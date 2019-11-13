package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Model;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.ibatis.executor.ReuseExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.DepData;
import com.pojo.Ribaodata;
import com.service.RiBaoService;
/**
 * 
 * @author 秦杰
 *日报管理的controller
 */
@Controller
@RequestMapping("/ribao")
public class RiBaoController {
	@Autowired
	RiBaoService ribaoservice;
	
	@RequestMapping("/add")
	public void addRibao(HttpServletRequest request,HttpServletResponse response){
			
		String data = request.getParameter("jsondata");
		System.out.println(data);
		
		try {
			data = new String(data.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//解析json
		JSONObject json = JSONObject.fromObject(data);
		
		Ribaodata ribaodata = new Ribaodata();
		
		
		
		
		
		SimpleDateFormat formatter = new  SimpleDateFormat( "yyyy-MM-dd");
		//获取系统时间
		try {
			Date update = new Date();
			String uptime = formatter.format(update);
			Date date = formatter.parse(uptime);
			ribaodata.setUptime(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		
		ribaodata.setAddtime(Integer.parseInt((String) json.get("addtime")) );
		ribaodata.setBaoid((String) json.get("baoid"));
		ribaodata.setContext((String) json.get("context"));
		
		ribaodata.setProid((String) json.get("proid"));
		
		ribaodata.setProprp((String) json.get("proprp"));
		
		String youid = (String) request.getSession().getAttribute("uname");
		ribaodata.setRenid(youid);
		
		ribaodata.setUpid((String) json.get("upid"));

		ribaodata.setWorkload(Integer.parseInt( (String) json.get("workload")));

		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("renid", ribaodata.getRenid());
		map.put("proid", (String) json.get("proid"));
		
		map=ribaoservice.addPaperService(map);
		
		
		ribaodata.setRenname(map.get("renname"));
		ribaodata.setDepid(map.get("depid"));
		ribaodata.setProname(map.get("proname"));
		
		System.out.println(ribaodata);
		
		int i = ribaoservice.insertRibao(ribaodata);
		try {
			PrintWriter  out = response.getWriter();
			
			
			if(i == 1){
				
				out.print("");
			}else
			{
				out.print("0");
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//----------------日报的无条件
	@RequestMapping("/chaxun")
	public void queryRibao(HttpServletRequest request,HttpServletResponse response){
		//调用日报的服务
		
		//使用request对象的getSession()获取session
		HttpSession session = request.getSession();
		String uname = (String) session.getAttribute("uname");
		ArrayList<Ribaodata> ribaodata;
		ribaodata=ribaoservice.queryRibao(uname);
		//把日报里的日期格式化
		SimpleDateFormat formatter = new  SimpleDateFormat( "yyyy-MM-dd");
	
		
		//打成json串带回
		/*
				JSONObject jsonObj =new JSONObject();
				Map <String, String> ingredients = new HashMap <String, String>();
				ingredients.put("apples", ribaodata.getBaoid());
				ingredients.put("sugar", ribaodata.getProid());
				ingredients.put("pastry", ribaodata.getProprp());
				ingredients.put("bestEaten", Integer.toString( ribaodata.getWorkload()));
				ingredients.put("bestEaten",Integer.toString( ribaodata.getAddtime()));
				ingredients.put("pastry", ribaodata.getUptime().toString());
				ingredients.put("pastry", ribaodata.getUpid());
				ingredients.put("pastry", ribaodata.getShenstate());
				
				jsonObj.put("ribaodata", ingredients);
				PrintWriter out;
				try {
					out = response.getWriter();
					String json = jsonObj.toString();
			        out.write(json);  
			        
			        out.flush();  
			        out.close(); 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
				
		*/
		try {
			
			request.setAttribute("ribadata", ribaodata);
			request.getRequestDispatcher("/showRibao.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
	@RequestMapping("/tiaojianchaxun")
	public ModelAndView queryRibaoByTiaojian(HttpServletRequest request, HttpServletResponse response){
		String stime = request.getParameter("stime");
		String etime = request.getParameter("etime");
		ArrayList<Ribaodata> ribaodata = new ArrayList<Ribaodata>();
		//获取时间条件
		SimpleDateFormat formatter = new  SimpleDateFormat( "yyyy-MM-dd");
		Date edate = new Date();
		Date sdate = new Date();
		try {
			sdate = formatter.parse(stime);
			edate = formatter.parse(etime);
			ribaodata = ribaoservice.queryRibaoBytiaojian(sdate,edate);
			System.out.println(ribaodata);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		/*
		String data = request.getParameter("jsondata");
		System.out.println(data);
		
		try {
			data = new String(data.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//解析json
		JSONObject json = JSONObject.fromObject(data);
		
		Ribaodata ribaodata = new Ribaodata();
		//获取时间条件
		SimpleDateFormat formatter = new  SimpleDateFormat( "yyyy-MM-dd");
		String stime=json.get("stime").toString();
		String etime=json.get("etime").toString();
		
	
		try {
			Date sdate = formatter.parse(stime);
			Date edate = formatter.parse(etime);
			//将时间传个日报服务的查询方法
			ribaodata = ribaoservice.queryRibaoBytiaojian(sdate,edate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		//做成json字符串，带回
		/*
		JSONObject jsonObj =new JSONObject();
		Map <String, String> ingredients = new HashMap <String, String>();
		ingredients.put("apples", ribaodata.getBaoid());
		ingredients.put("sugar", ribaodata.getProid());
		ingredients.put("pastry", ribaodata.getProprp());
		ingredients.put("bestEaten", Integer.toString( ribaodata.getWorkload()));
		ingredients.put("bestEaten",Integer.toString( ribaodata.getAddtime()));
		ingredients.put("pastry", ribaodata.getUptime().toString());
		ingredients.put("pastry", ribaodata.getUpid());
		ingredients.put("pastry", ribaodata.getShenstate());
		
		jsonObj.put("ribaodata", ingredients);
		*/
		/*try {
			
			request.setAttribute("ribadata", ribaodata);
			request.getRequestDispatcher("/showRibao2.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		ModelAndView model =new ModelAndView();
		model.addObject("ribadata", ribaodata);
		model.setViewName("/showRibao.jsp");
		
		return model;
		
		
	}
	//--------日报的删除
	@RequestMapping("/shanchu")
	public void deleteRibao(HttpServletRequest request, HttpServletResponse response){
		
		String baoid = request.getParameter("baoid");
		//调用方法删除
		int i = ribaoservice.deleteRibaoByid(baoid);
		//对删除进行判断
		if(i > 0 ){
			request.setAttribute("msg", 1);
		}else{
			request.setAttribute("msg", 0);
		}
			try {
				
				request.getRequestDispatcher("/showRibao.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	//日报的修改
	@RequestMapping("/xiugai")
	public void updataRibao(HttpServletRequest request,HttpServletResponse response){
		
		String data = request.getParameter("jsondata");
		System.out.println(data);
		
		try {
			data = new String(data.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//解析json
		JSONObject json = JSONObject.fromObject(data);
		
		Ribaodata ribaodata = new Ribaodata();
		

		SimpleDateFormat formatter = new  SimpleDateFormat( "yyyy-MM-dd");
		
		try {
			String ss=json.get("uptime").toString();
			java.util.Date date = formatter.parse(ss);
			ribaodata.setUptime(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		
		ribaodata.setAddtime(Integer.parseInt((String) json.get("addtime")) );
		ribaodata.setBaoid((String) json.get("baoid"));
		ribaodata.setContext((String) json.get("context"));
		
		ribaodata.setProid((String) json.get("proid"));
		
		ribaodata.setProprp((String) json.get("proprp"));
		ribaodata.setRenid((String) json.get("renid"));
		ribaodata.setUpid((String) json.get("upid"));

		ribaodata.setWorkload(Integer.parseInt( (String) json.get("workload")));

		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("renid", (String) json.get("renid"));
		map.put("proid", (String) json.get("proid"));
		
		map=ribaoservice.addPaperService(map);
		
		
		ribaodata.setRenname(map.get("renname"));
		ribaodata.setDepid(map.get("depid"));
		ribaodata.setProname(map.get("proname"));
		
		System.out.println(ribaodata);
		
		int i = ribaoservice.updateRibaoByid(ribaodata);
		try {
			PrintWriter  out = response.getWriter();
			
			
			if(i == 1){
				
				out.print("");
			}else
			{
				out.print("0");
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
