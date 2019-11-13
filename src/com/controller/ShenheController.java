package com.controller;
/**
 * 李广文
 * 日报审核controller
 * 2017-2-23
 */
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.pojo.DailyData;
import com.pojo.Ribaodata;
import com.pojo.ShenheData;
import com.service.DailyService;
import com.service.ShenheService;

@Controller

@RequestMapping("/ribao")
public class ShenheController {
	@Autowired	
    private   DailyService  DailyService ;
	@Autowired	
    private   ShenheService shenheService ;
	/**
	 * 日报审核页面加载
	 * @author 
	 *
	 */
	@RequestMapping("/shenhe")    
	    public ModelAndView Shenhe(HttpServletRequest request){    
		 String userid = request.getParameter("userid");
		 
	    	ModelAndView modelAndView =  new ModelAndView();
	    	//List<Ribaodata> list = null;
	    	modelAndView.addObject("userId",userid);
	    	modelAndView.setViewName("/view/shenhe/Shenhe.jsp");
	    	
	    	
	    	return modelAndView;
	    }
	
	/**
	 * 获取日报列表 
	 * @return
	 */
	@RequestMapping("/queryDaily")    
    public ModelAndView queryAllDaily(HttpServletRequest request){    
     
		//解析json
		 String jsondata = request.getParameter("jsondata");
		 String userid = request.getParameter("userid");
		 try {
			jsondata = new String(jsondata.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		//TODO 调试
		 System.out.println(jsondata);
		//解析json
		JSONObject json = JSONObject.fromObject(jsondata);
		
		// String renId = json.get("renid").toString();
		 String renName = json.get("ren").toString(); 	
		 String state= json.get("state").toString();
		 String stime = json.get("stime").toString();
		 String etime = json.get("etime").toString();
		// String userId = json.get("userId")+"";
		 
		 //字符串转时间
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
	  
		 //TODO 调试
		 System.out.println(" >>>>>>>>>>>>>>>>>>>    "+   userid  +"  "+  stime +"  "+ etime);
		 
		 //封装
		 
		   ShenheData shenheData = new ShenheData();
		   
		   if(stime != null && !stime.equals("") && !stime.equals("null"))
			try {
				shenheData.setStime(df.parse(stime)); 
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		   
		   if(etime != null && !etime.equals("") && !etime.equals("null"))
				try {
					shenheData.setEtime(df.parse(etime)); 
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		   
		   shenheData.setUpId(userid);
		   shenheData.setRenName(renName);
		   shenheData.setShenstate(state);
//		   shenheData.setStime(stime1);
//		   shenheData.setEtime(etime1);
		 
		 //调用Service
		 List<Ribaodata> list = null;
		 try {
			 list=shenheService.queryShenDaily(shenheData);
			 
			//TODO 调试
			System.out.println(">>>>>>>>>>>>list: "+list); 
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
    	ModelAndView modelAndView =  new ModelAndView();
    	
    	   modelAndView.addObject("ribaoList", list);
    	   modelAndView.addObject("shu", list.size());
    	 
    	 modelAndView.setViewName("/view/shenhe/ShenQuery.jsp");
	    	
	    	
	    
    	return modelAndView;
    }
	
	
	/**
	 * 通过日报ID获取日报  
	 * @return
	 */
	@RequestMapping("/queryDailyById")    
    public ModelAndView queryDailyById(HttpServletRequest request){    
     
		//解析json
		 String ribaoid = request.getParameter("ribaoid");
		  
		//TODO 调试
		 System.out.println(ribaoid);
		 
		  
		 //调用Service
		  Ribaodata ribaodata = null;
		 try {
			 if(ribaoid != null &&!ribaoid.equals(""))
			 ribaodata =shenheService.queryShenDailyById(ribaoid);
			 
			//TODO 调试
			System.out.println(">>>>>>>>>>>>list: "+ribaodata); 
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
    	ModelAndView modelAndView =  new ModelAndView();
    	
    	   modelAndView.addObject("ribaodata", ribaodata);
    	  
    	 
    	 modelAndView.setViewName("/view/shenhe/GeRenShen.jsp");
	    	
	    	
	    
    	return modelAndView;
    }
	
	/**
	 *审核日报
	 * @param request
	 * @return 
	 */
	@RequestMapping("/pass")    
    public void pass(HttpServletRequest request,HttpServletResponse response){    
     
		//解析json
		 String jsondata = request.getParameter("jsondata");
		 String  caoZuo = request.getParameter("flag");
		 System.out.println(caoZuo);
		 try {
			jsondata = new String(jsondata.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		//TODO 调试
		 System.out.println(jsondata);
		//解析json
		JSONObject json = JSONObject.fromObject(jsondata);
	  
		 String reason= json.get("reason").toString();
		// String len= json.get("len").toString();
		 
 
		 
		//解析id
		 JSONArray jsonArray = JSONArray.fromObject(json.get("ribaoids"));
		 
		 System.out.println(jsonArray.size());
		
		 String ids[]= new String[1000] ;
		 for(int i=0;i<jsonArray.size();i++)
		 {
			 ids[i] = jsonArray.get(i).toString();
		 }
		 
		/*//拼接sqlid
		    String id = "";
		    for(int i=0;i<jsonArray.size();i++)
		    {   
		    	if(i== 0)
		    	id+=ids[i];
		    	else
		    		id+=","+ids[i];
		    }
	 System.out.println(id);*/
		//service 
		int result;
		try {
			result = shenheService.shenDaily(caoZuo, ids,jsonArray.size(), reason);
			
			//返回
            PrintWriter  out = response.getWriter();
			
			if(result==jsonArray.size())
			{
				out.print("1");
			}else
			{
				out.print("0");
			}
			out.flush();
			out.close();
	    	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
	    	 
    	
    	
    	
    	 
    }
}
