package com.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.PRPData;
import com.pojo.PRPjiData;
import com.pojo.ProData;
import com.pojo.RenjiData;
import com.pojo.Renyuandata;
import com.pojo.Ribaodata;
import com.service.PRPService;
import com.service.ProgramSettingService;

@Controller
/**
 * 
 * @author Eric孙百西
 *
 */
@RequestMapping("/view")
public class ProgramSettingController {
	@Autowired
	private ProgramSettingService psService;
	@Autowired
	private PRPService prpService;
 
		@RequestMapping("/queryPro")
		public ModelAndView ProSQuery(HttpServletRequest request)throws Exception{
			//TODO 获取前端传进来的数值
			//TODO 前端进来的数值转码
			String pronameA = "";
			String pronameB = "";
				pronameB = request.getParameter("proname");
				pronameA = new String(pronameB.getBytes("8859_1"),"UTF-8");
			ProData pin= new ProData();
				pin.setProid(request.getParameter("proid"));
				pin.setProname(pronameA);
			//TODO 日期由String类型转为date类型
			String stime = request.getParameter("starttime");
			String etime = request.getParameter("endtime");
			Date stimed = null;
			Date etimed = null;
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			if(stime!=""){
				stimed = formatter.parse(stime);
				}
			if(etime!=""){
			etimed = formatter.parse(etime);
			}
			pin.setStarttime(stimed);
			pin.setEndtime(etimed);
			//TODO 调用service方法进行查询
			List<ProData> prolist = new ArrayList<ProData>();
				prolist = psService.QueryPro(pin);
			//TODO 返回的数据再回到页面
			ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("prolist",prolist);
				modelAndView.setViewName("/ProQuery.jsp");
				return modelAndView;
		}
		@RequestMapping("/deletePro")
		public ModelAndView ProSDelete(HttpServletRequest request)throws Exception{
			//TODO 获取到前端的proid
			String proID = request.getParameter("proid");
			//TODO 调用service方法删除
			psService.DeletePro(proID);
			//TODO 返回查询页面
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("/ProQuery.jsp");
			return modelAndView;
		}
		@RequestMapping("/insertProJump")
		public ModelAndView ProJumpTowardsInsert(HttpServletRequest request)throws Exception{
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("/ProInsert.jsp");
			return modelAndView;
		}
		@RequestMapping("/insertPro")
		public ModelAndView ProSInsert(HttpServletRequest request)throws Exception{
			//TODO 日期由String类型转为date类型
			int flag=0;
			ModelAndView modelAndView = new ModelAndView();
			String stime = request.getParameter("starttime");
			String etime = request.getParameter("endtime");
			Date stimed = null;
			Date etimed = null;
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			if(stime!=""&&etime!=""&&request.getParameter("proname")!=""){
				flag=1;
				stimed = formatter.parse(stime);
				etimed = formatter.parse(etime);
				if(stimed.before(etimed)){
					flag=1;
					
				}
				if(stimed.after(etimed)){
					flag=0;
				}
			//TODO 获取到前端数据
			ProData pdt = new ProData();
				pdt.setProid(request.getParameter("proid"));
				//TODO 项目名称转码
				String pronameA = "";
				String pronameB = "";
					pronameB = request.getParameter("proname");
					pronameA = new String(pronameB.getBytes("8859_1"),"UTF-8");
				pdt.setProname(pronameA);
				pdt.setStarttime(stimed);
				pdt.setEndtime(etimed);
			//TODO 调用service方法进行插入
			psService.InsertPro(pdt);
			}
			//TODO 跳转到查询页面
			if(flag==1){
				modelAndView.setViewName("/ProQuery.jsp");}
			if(flag==0){modelAndView.setViewName("/view/PRP/404PRP.jsp");}
				return modelAndView;
		}
		@RequestMapping("/setPRPByPro")
		public ModelAndView ProSJumpTowardsPRP(HttpServletRequest request)throws Exception{
			//TODO　获取proid
			String proId = null;
			proId = request.getParameter("proid");
			 //TODO PRP全查询
		      String prpShort = "";
		     //TODO 获取数据
		      List<PRPData> prpList = new ArrayList<PRPData>();
		           prpList = prpService.QueryPRP(prpShort);
			//TODO 跳转页面
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("proid", proId);
			modelAndView.addObject("prpList", prpList);
			modelAndView.setViewName("/ProQuery_Jump.jsp");
			return modelAndView;
		}
		@RequestMapping("/insertPRPji")
		public ModelAndView InsertPRPji(HttpServletRequest request)throws Exception{
			//TODO 获取前端的checkbox
			String[] arr = request.getParameterValues("prp_name");
			String proid = request.getParameter("proid");
//			System.out.println("############"+proid);
			String[] array = new String[100001];
			PRPjiData prpji = new PRPjiData();
			for(int i = 0;i<arr.length;i++)
			{   
				array[i]=new String(arr[i].getBytes("8859_1"),"UTF-8");
				System.out.println("*******************"+array[i]+"*****************");
				prpji.setPrp_name(array[i]);
				prpji.setProid(proid);
				psService.InsertPRPji(prpji);
				}
			//TODO 跳转到查询页面
			ModelAndView modelAndView = new ModelAndView();
				modelAndView.setViewName("/ProQuery.jsp");
				return modelAndView;
		}
		@RequestMapping("/updateProJump")
		public ModelAndView ProSUpdate(HttpServletRequest request)throws Exception{
			//TODO 获取前端进来的proid
			String inID=request.getParameter("proid");
			ProData pdt = new ProData();
			pdt = psService.QueryByProid(inID);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("prodata", pdt);
			modelAndView.setViewName("/ProUpdate.jsp");
			return modelAndView;
		}
		@RequestMapping("/updateProSubmit")
		public ModelAndView ProSUpdateT(HttpServletRequest request)throws Exception{
			int flag=0;
			ModelAndView modelAndView = new ModelAndView();
			//TODO 获取前端进来的数据
			ProData pdta = new ProData();
			//TODO 时间格式转换
			String stime = request.getParameter("starttime");
			String etime = request.getParameter("endtime");
			Date stimed = null;
			Date etimed = null;
			if(stime!=""&&etime!=""&&request.getParameter("proname")!=""&&request.getParameter("proid")!=""){
				flag=1;
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				stimed = formatter.parse(stime);
				etimed = formatter.parse(etime);
				if(stimed.before(etimed)){
					flag=1;
				}
				if(stimed.after(etimed)){
					flag=0;
				}
			//TODO 编码转换
				//TODO 项目名称转码
				String pronameA = "";
				String pronameB = "";
					pronameB = request.getParameter("proname");
					pronameA = new String(pronameB.getBytes("8859_1"),"UTF-8");
				pdta.setProid(request.getParameter("proid"));
				pdta.setProname(pronameA);
				pdta.setStarttime(stimed);
				pdta.setEndtime(etimed);
			//TODO 调用service方法更新
				psService.UpdatePro(pdta);}
				//TODO 跳转到查询页面
				if(flag==1){
					modelAndView.setViewName("/ProQuery.jsp");}
			if(flag==0){modelAndView.setViewName("/view/PRP/404PRP.jsp");}
					return modelAndView;
		}
		@RequestMapping("/setRen")
		public ModelAndView JumpToRen(HttpServletRequest request)throws Exception{
			String proId = request.getParameter("proid");
			String deptid = request.getParameter("depid");
//			String proId ="**1**"; 
			List<Renyuandata> lista = new ArrayList<Renyuandata>();
			List<Renyuandata> listManager = new ArrayList<Renyuandata>();
			List<Renyuandata> listLeader = new ArrayList<Renyuandata>();
			List<Renyuandata> listStaff = new ArrayList<Renyuandata>();
			lista =psService.QueryRenByPro();
			Renyuandata r = new Renyuandata();
			//TODO 分角色，根据角色经理、组长、组员分到不同列表里面进行展示
			//TODO 遍历list->判断角色->放到不同list里面
			for(int i =0;i<lista.size();i++)
			{
				r = lista.get(i);
				if(r.getRoleid().equals("1"))
				{
					listManager.add(r);
				}
				if(r.getRoleid().equals("2"))
				{
					listLeader.add(r);
				}
				if(r.getRoleid().equals("3"))
				{
					listStaff.add(r);
				}
			}
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("listManager", listManager).addObject("listLeader", listLeader).addObject("listStaff", listStaff);
			modelAndView.addObject("depid", deptid);
			modelAndView.addObject("proID", proId);
			
//			System.out.println("####################"+lista.toString());
			modelAndView.setViewName("/view/renyuan/QueryRenyuan.jsp");
			return modelAndView;
		}
		@RequestMapping("/renProSubmit")
		public ModelAndView InsertRenji(HttpServletRequest request)throws Exception{
			String message;
			//获取json串
			String data = request.getParameter("jsondata");
			try {
				data = new String(data.getBytes("ISO-8859-1"),"utf-8");
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("转码失败");
			}
			//抓取json
			JSONObject json = JSONObject.fromObject(data);
			int number = Integer.parseInt((String) json.get("number").toString());
			//插入项目经理信息
			Renyuandata a = new Renyuandata();
			RenjiData ryd = new RenjiData();
			Renyuandata renji = new Renyuandata();
			a.setRenid((String) json.get("renid"));
			psService.BusyRen(a);
			ryd.setRenid((String) json.get("renid"));
			ryd.setProid((String) json.get("proid"));
			ryd.setDepid((String) json.get("depid"));
			//TODO 根据renid查询renname
			renji = psService.QueryRennameById(a);
			//TODO 查询到的renname 放到pojo封装
			ryd.setRenname(renji.getRenname());
			ryd.setProroleid("1");
			ryd.setState("0");
			ryd.setUpid("1");
			psService.InsertRenyuanji(ryd);
			//TODO 解析json插入小组长信息
			Renyuandata rena = new Renyuandata();
			Renyuandata renb = new Renyuandata();
			RenjiData renc = new RenjiData();
			Renyuandata rena1 = new Renyuandata();
			Renyuandata renb1 = new Renyuandata();
			RenjiData renc1 = new RenjiData();
			 JSONArray jsonArray = JSONArray.fromObject(json.get("renida"));
			 System.out.println(jsonArray.size());
			 String renids[]= new String[1000] ;
			 int flag = 0;
			 for(int i=0;i<jsonArray.size();i++)
			 {
				 renids[i] = jsonArray.get(i).toString();
				 flag++;
			 }
			 JSONArray jsonArraya = JSONArray.fromObject(json.get("upida"));
			 System.out.println(jsonArraya.size());
			 String upids[]= new String[1000] ;
			 for(int j=0;j<jsonArraya.size();j++)
			 {
				 upids[j] = jsonArraya.get(j).toString();
			 }
			 //遍历数组
			 //因为小组长没有选领导，领导就是项目经理所以单独插入，number为小组长数量由前端传过来
			 System.out.println(number);
			 for(int m=0;m<number;m++)
			 {
				 rena1.setRenid(renids[m]);
				 psService.BusyRen(rena1);
				 //根据renid查询renname和roleid
				 renb1 = psService.QueryRennameById(rena1);
				 renc1.setRenid(renids[m]);
				 renc1.setRenname(renb.getRenname());
				 renc1.setUpid((String) json.get("renid"));
				 renc1.setProroleid(renb.getRoleid());
				 renc1.setDepid((String) json.get("depid"));
				 renc1.setState("0");
				 renc1.setProid((String) json.get("proid"));
				 //插入信息
				 psService.InsertRenyuanji(renc1);
			 }
			 for(int k=number;k<flag;k++)
			 {
				 rena.setRenid(renids[k]);
				 psService.BusyRen(rena);
				 //根据renid查询renname和roleid
				 renb = psService.QueryRennameById(rena);
				 renc.setRenid(renids[k]);
				 renc.setRenname(renb.getRenname());
				 renc.setUpid(upids[k]);
				 renc.setProroleid(renb.getRoleid());
				 renc.setDepid((String) json.get("depid"));
				 renc.setState("0");
				 renc.setProid((String) json.get("proid"));
				 //插入信息
				 psService.InsertRenyuanji(renc);
			 }
			
			message = "success";
			return null;
			
		}
//		@RequestMapping("/toDept")
//		public ModelAndView ToDept (HttpServletRequest request)throws Exception{
//			String proId = request.getParameter("proid");
//			ModelAndView modelAndView = new ModelAndView();
//			modelAndView.addObject("proid", proId);
//			modelAndView.setViewName("/ProQuery.jsp");
//			return modelAndView; 
//		}
}
