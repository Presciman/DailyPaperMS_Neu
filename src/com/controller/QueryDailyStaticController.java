package com.controller;

/**
 * 王月妍
 * 个人日报查询按日期查询controller
 * 2017-02-24
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.DailyData;
import com.service.DailyService;
import com.service.DailyServiceBypro;

@Controller
public class QueryDailyStaticController {

	@Autowired
	private DailyService dailyservice;// 获取查询日报的服务

	@RequestMapping("/querydailybydate")
	public ModelAndView querydailybydate(HttpServletRequest request)
			throws Exception {

		// 获取用户名和时间
		String btime = request.getParameter("btime");
		String atime = request.getParameter("atime");
		if(btime.equals("")||atime.equals(""))
		{
			ModelAndView modelAndView = new ModelAndView();

			modelAndView.addObject("msg", "输入值不能为空");

			modelAndView.setViewName("/wyy.jsp");

			return modelAndView;
		}
		
		HttpSession session = request.getSession();
		String renid = (String) session.getAttribute("uname");

		Date date1 = null;
		Date date2 = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		date1 = formatter.parse(btime);
		date2 = formatter.parse(atime);

		DailyData ddd = new DailyData();
		// 将数据传入service层

		List<DailyData> dailydata = new ArrayList<DailyData>();
		ddd.setAtime(date2);
		ddd.setBtime(date1);
		ddd.setRenid(renid);

		System.out.println(renid + "renid");
		dailydata = dailyservice.querydaily(ddd);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("dailydata", dailydata);

		modelAndView.setViewName("/wyychaxunribao.jsp");

		return modelAndView;

	}

	@Autowired
	private DailyServiceBypro dailyservicebypro;// 获取查询日报的服务

	@RequestMapping("/querydailybypro")
	public ModelAndView querydailybypro(HttpServletRequest request)
			throws Exception {

		// 获取用户名和时间
		String btime = request.getParameter("btime");
		String atime = request.getParameter("atime");
		String proname = request.getParameter("proname");
		
		if(btime.equals("")||atime.equals("")||proname.equals(""))
		{
			ModelAndView modelAndView = new ModelAndView();

			modelAndView.addObject("msg", "输入值不能为空");

			modelAndView.setViewName("/wyy1.jsp");

			return modelAndView;
		}

		// String btime = "2010-11-20 20:00:01";
		// String atime = "2020-11-20 20:00:01";
		// String renid = "1";

		Date date1 = null;
		Date date2 = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		date1 = formatter.parse(btime);
		date2 = formatter.parse(atime);
		if(btime.equals("")||atime.equals(""))
		{
			ModelAndView modelAndView = new ModelAndView();

			modelAndView.addObject("msg", "输入值不能为空");

			modelAndView.setViewName("/wyy.jsp");

			return modelAndView;
		}

		DailyData ddd = new DailyData();
		// 将数据传入service层

		List<DailyData> dailydata = new ArrayList<DailyData>();
		ddd.setAtime(date2);
		ddd.setBtime(date1);
		ddd.setProname(proname);

		dailydata = dailyservicebypro.querydailybypro(ddd);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("dailydata", dailydata);

		modelAndView.setViewName("/wyychaxunxiangmu.jsp");

		return modelAndView;

	}

}
