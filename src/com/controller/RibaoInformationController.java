package com.controller;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.DepData;
import com.service.DepInformationService;
/**
 * 部门设定controller
 * @author 李欣
 * 2017-2-25
 */
@Controller
@RequestMapping("/dep")

public class RibaoInformationController {
@Autowired
private DepInformationService  depInformationService ;
  
   /* *//**
     * 获取某一部门的信息
     * @param request
     * @return
     *//*
	@RequestMapping("/information")
	public ModelAndView  getDepInfo (HttpServletRequest request){
		//获取部门名称
		 DepData  depin = null;
		String name = request.getParameter("depName");
		try {
			depin = depInformationService.query(name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		ModelAndView modelAndView =  new ModelAndView();
		
		modelAndView.addObject("dep", depin);
		
		modelAndView.setViewName("/");
		
		return modelAndView;
	}*/

	
	/**
     * 加载部门设定页面
     * @param request
     * @return
     */	
	@RequestMapping("/depset")
	public ModelAndView depSet(HttpServletRequest request){     
		String proid = request.getParameter("proid");
		ModelAndView modelAndView =  new ModelAndView();
		List<DepData> depList = null;
		
		try {
			
			depList =  depInformationService.getShu(proid);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		modelAndView.addObject("depList", depList)
		            .addObject("proid", proid);
		
		modelAndView.setViewName("/view/depset/bms/DepSet.jsp");
		
		// TODO 测试deplist
		System.out.println(depList);
		
		return modelAndView;
		
	}
	
	/**
     * 修改某一部门的信息
     * @param request
     * @return
     */
	@RequestMapping("/updateInfo")
	public void  updateInfo (HttpServletRequest request,HttpServletResponse response){
		//获取部门信息
		String jsondata = request.getParameter("jsondata"); 
		try {
			jsondata = new String(jsondata.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//解析json
		JSONObject json = JSONObject.fromObject(jsondata);
		 String depId = json.get("depid").toString();
		 String depName = json.get("depname").toString();
		 String depZhu = json.get("depzhu").toString();
		 
		
		//封装
		DepData  depin = new DepData();
		depin.setDepID(depId);
		depin.setDepName(depName);
		depin.setZhu(depZhu);
		
		//TODO 调试
		System.out.println(depin.getDepID());
		System.out.println(depin.getDepName());
		System.out.println(depin.getZhu());
		
		try {
			int result = depInformationService.updateDep(depin);
			System.out.println("3333333333333333333>>>>"+result);
			
			/*List<Object>   datas = new  ArrayList<Object>() ;
			//重新获取目录树
			List<DepData> depList = null;
			depList =  depInformationService.getShu();
			
			PrintWriter  out = response.getWriter();
			
			if(result==1)
			{
				datas.add(0, "1");
				datas.add(1, depList);
			}
		    else
			  {
		    	datas.add(0, "0");
				datas.add(1, depList);
			  }
			String jsons = JSONArray.fromObject(datas).toString();
			jsons = new String(jsons.getBytes("ISO-8859-1"),"utf-8");
			out.print(jsons);*/
			
			PrintWriter  out = response.getWriter();
			
			if(result==1)
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
	
	/**
	 *保存新部门信息
	 *@param request
	 *@return
	 */
	@RequestMapping("newdep")
	public void  saveInfo (HttpServletRequest request,HttpServletResponse response){
		//获取部门信息
		String jsondata = request.getParameter("jsondata"); 
		try {
			jsondata = new String(jsondata.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//解析json
		JSONObject json = JSONObject.fromObject(jsondata);
		 String proid = json.get("proid").toString();
		 String depId = json.get("sondepid").toString();
		 String depName = json.get("sondepname").toString();
		 String depZhu = json.get("sondepzhu").toString();
		
		//封装
		DepData  depin = new DepData();
		depin.setProid(proid);
		depin.setDepID(depId);
		depin.setDepName(depName);
		depin.setZhu(depZhu);
		
		
		//TODO 调试
		System.out.println(depin.getDepID());
		System.out.println(depin.getDepName());
		System.out.println(depin.getZhu());
		
		try {
			int result = depInformationService.saveDep(depin);
			
			PrintWriter  out = response.getWriter();
			
			if(result==1)
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
	
	
	/**
     * 删除部门 
     * @param request  
     * @return
     */
	@RequestMapping("/deletedep")
	public void deletedep (HttpServletRequest request,HttpServletResponse response){
		//获取部门名称
		 int  result  = 0;
		String depid = request.getParameter("depid");
		 PrintWriter  out = null;
		try {
			   result = depInformationService.deleteDep(depid);
			   out =  response.getWriter();
			   if(result==1)
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
			out.print("0");
			out.flush();
			out.close();
			e.printStackTrace();
		}

		
		 
	}
}