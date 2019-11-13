package com.controller;
/**
 *杨嘉钦 
 * 个人周报导出controller
 * 2017-02-28
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Ribaodata;
import com.print.Print;
import com.service.WeeklyService;

@Controller

public class QueryWeeklyStaticController {
	//获取查询日报的服务
	@Autowired
	private WeeklyService WeeklyService;

	@RequestMapping("/queryweeklybydate")
	public ModelAndView userLogin(HttpServletRequest request) throws Exception {
		String renname = null;
		//获取用户名和时间
		 String uptime = request.getParameter("wtime");
		 String renname1 = request.getParameter("renname");
		 renname = new String(renname1.getBytes("8859_1"),"utf-8");
		 
		 if(uptime.equals("")||renname1.equals(""))
		 {
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("msg", "输入值不能为空");
				modelAndView.setViewName("/gerenzhoubaodaochu.jsp");

				return modelAndView;
		 }
		 
		 //将String转化为Date
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		 java.util.Date time=null;
		 time= sdf.parse(uptime);
		 
		 //赋值
		Ribaodata rrr=new Ribaodata();
		rrr.setUptime(time);
		rrr.setRenname(renname);

		//调用接口，实现功能
		List<Ribaodata> ribaodata = new ArrayList<Ribaodata>();
		ribaodata = WeeklyService.queryweekly(rrr);

		//调用Print方法，打印数据
		Print.Print(ribaodata);

		int i=ribaodata.size();
		if(i<2)
		{
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("msg", "查询值为空");
			modelAndView.setViewName("/gerenzhoubaodaochu.jsp");
			return modelAndView;
		}
		
		for(int j=0;((j+1)%2==0)||(j<i);j++)
		{
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			formatter.format(ribaodata.get(j).getUptime());
		}
		
		
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("ribaodata", ribaodata);
		modelAndView.setViewName("/gerenzhoubaodaochujieguo.jsp");

		return modelAndView;

	}
}
