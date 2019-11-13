package com.controller;
/**
 *张哲雨 
 * 某日日报记录controller
 * 2017-02-28
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Ribaodata;
import com.service.DailyAllService;

@Controller

public class QueryDailyAllController {
	//获取查询日报的服务
	@Autowired
	private DailyAllService DailyAllService;

	@RequestMapping("/querydailyallbydate")
	public ModelAndView userLogin(HttpServletRequest request) throws Exception {

		//获取用户名和时间
		 String uptime = request.getParameter("uptime");
		 if(uptime.equals(""))
		 {
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("msg", "输入值不能为空");
				modelAndView.setViewName("/quantianribaochaxun.jsp");

				return modelAndView;
		 }
		 
		 //将String转化为Date
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		 java.util.Date time=null;
		 time= sdf.parse(uptime);

		 //赋值
		Ribaodata rrr=new Ribaodata();
		rrr.setUptime(time);

		//调用接口，实现功能
		List<Ribaodata> ribaodata = new ArrayList<Ribaodata>();
		ribaodata = DailyAllService.querydailyall(rrr);


		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("ribaodata", ribaodata);
		modelAndView.setViewName("/quantianribaochaxunjieguo.jsp");

		return modelAndView;

	}
}
