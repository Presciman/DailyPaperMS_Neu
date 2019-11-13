package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.PRPData;
import com.service.PRPService;

/**
 * ******************************V2.2********************************
 * @author Eric孙百西
 * 添加了条件查询功能
 * 添加了无条件查询功能
 * 添加了插入功能
 * 添加了PRP更新修改功能
 * 添加了PRP阶段名无重复插入功能
 * 添加了PPR阶段名无重复修改功能
 * 解决了中文转码问题，待解决改数据库表nvarchar(10)为(50)
 * plz：由于中间改动数据库的表，因此此版本较上一版本有较大改动
 ****************************************************************************
 * 使用prp阶段说明书：
 * 插入新数据的时候prp简称、prp缩写不能为空，prp名称不能和已有可查（状态为1）重名；
 * 更新数据的时候prp简称、prp缩写不能为空，prp名称不能和已有可查（状态为1）重名；
 * **************************************************************************
 *
 */


@Controller

@RequestMapping("/view")
public class PRPController {
 @Autowired
 private PRPService prpService;

   @RequestMapping("/queryPRP")
   public ModelAndView prpQuery(HttpServletRequest request) throws Exception{
	      //TODO 获取前端传进来的PRP缩写
	      String prpShort = request.getParameter("prpShort");
	     //TODO 传数据到前端
	      List<PRPData> prpList = new ArrayList<PRPData>();
	           prpList = prpService.QueryPRP(prpShort);
	      ModelAndView modelAndView = new ModelAndView();
	           modelAndView.addObject("prpList", prpList);
	           modelAndView.setViewName("/PRPQuery.jsp");
   return modelAndView;
   }
   
   @RequestMapping("/insertPRP")
   public ModelAndView prpInsert(HttpServletRequest request) throws Exception{
	      //TODO　获取前端传进来的PRP缩写、PRP阶段名称并转码
	      PRPData prpd = new PRPData();
	      PRPData notsame = new PRPData();
	      String prpn = null;
	      String prpna = null;
	      //TODO 获取
	      prpn = request.getParameter("prpName");
	      //TODO 转码
	      prpna=new String(prpn.getBytes("ISO-8859-1"),"utf-8");
	      //TODO PPRData 对象接数据
	      ModelAndView modelAndView = new ModelAndView();
	         prpd.setPrp_short(request.getParameter("prpShort"));
	         prpd.setPrp_name(prpna);
	         if(request.getParameter("prpShort")!=""&&prpna!=""){
	        	 //TODO 调用service查询是否有重名PRP
	        	 notsame = prpService.findNameStateByID(prpd);
	        	 if(notsame!=null){
	        		 modelAndView.setViewName("/Insert500.jsp");
	        	 }
	        	 else{
	        		 //TODO 调用service将数据插入
	        		 prpService.InsertPRP(prpd);
	        		 modelAndView.setViewName("/PRPQuery.jsp");
	        	 }
	         }
	         else{
	        	 modelAndView.setViewName("/view/PRP/404PRP.jsp");
	         }
	         return modelAndView;
   	}
   
   @RequestMapping("/deletePRP")
   public ModelAndView prpDelete(HttpServletRequest request) throws Exception{
	      //TODO　获取前端传进来的PRP缩写
	      int prpID = Integer.parseInt(request.getParameter("prpID"));
	      //TODO 调用service方法删除
	      prpService.DeletePRP(prpID);
	      //TODO 返回到查询页面
	      ModelAndView modelAndView = new ModelAndView();
	         modelAndView.setViewName("/PRPQuery.jsp");
   return modelAndView;
   }
   
//TODO 动作为跳转页面到修改prp
   @RequestMapping("/updatePRP")
   public ModelAndView prpJump(HttpServletRequest request)throws Exception{
	      //TODO 获取前端传过来的id
	      PRPData prpdata=null;
	      int vari;
	         vari=Integer.parseInt(request.getParameter("prpID"));
	      //TODO 调用service方法查找全部信息
	      //TODO 用PRPData接住数据
	      prpdata=prpService.findPRPById(vari);
	      //TODO 数据传到前台
	      ModelAndView modelAndView = new ModelAndView();
	         modelAndView.addObject("prpdata",prpdata);
	         modelAndView.setViewName("/PRPUpdate.jsp");
   return modelAndView;
   }


@RequestMapping("/updatePRPSubmit")
   public ModelAndView prpUpdate(HttpServletRequest request)throws Exception{
	      ModelAndView modelAndView = new ModelAndView();
	      //TODO　获取前端传进来的PRPID,PRP缩写,PRP名字
	      PRPData values = new PRPData();
	      PRPData notsame = new PRPData();
	      String prpn = null;
	      String prpna = null;
	      if(request.getParameter("prpShort")!=""&&request.getParameter("prpName")!="")
	      {
	    	  //TODO 以字符串形式取出来
	    	  prpn=request.getParameter("prpName");
	    	  //TODO 转码
	    	  prpna=new String(prpn.getBytes("8859_1"),"utf-8");
	    	  values.setPrp_id(Integer.parseInt(request.getParameter("prpID")));
	    	  values.setPrp_short(request.getParameter("prpShort"));
	    	  values.setPrp_name(prpna);
              //TODO 调用service查询是否有同名PRP
	    	  notsame = prpService.findNameStateByID(values);
	    	  if(notsame!=null){
	    		  modelAndView.setViewName("/view/PRP/Update500.jsp");
	    	  }
	    	  else{
	    	  //TODO 调用service方法修改
	    	  prpService.UpdatePRP(values);
	 
	    	  //TODO 返回到查询页面
	    	  modelAndView.setViewName("/PRPQuery.jsp");
	    	  }
	      }
	      else{//TODO 返回到错误页面
	    	  modelAndView.setViewName("/view/PRP/404PRP.jsp");
	      }
   return modelAndView;
   }
}
