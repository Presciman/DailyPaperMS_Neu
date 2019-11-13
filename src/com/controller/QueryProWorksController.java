package com.controller;

/**
 * 孙明杨
 * 项目工作量查询controller
 * 2017-02-28
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.RibaoDepji;
import com.service.QueryProWorksService;

@Controller
public class QueryProWorksController {

	@Autowired
	private QueryProWorksService queryproworksservice;// 获取查询项目工作量的服务

	@RequestMapping("/queryproworks")
	public ModelAndView queryproworks(HttpServletRequest request)
			throws Exception {

		// 获取用户名和时间
		String btime = request.getParameter("btime");
		String atime = request.getParameter("atime");
		String proname = request.getParameter("proname");

		if(btime.equals("")||atime.equals("")||proname.equals(""))
		{
			ModelAndView modelAndView = new ModelAndView();

			modelAndView.addObject("msg", "输入值不能为空");

			modelAndView.setViewName("/wyy3.jsp");

			return modelAndView;
		}
		
		Date date1 = null;
		Date date2 = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		date1 = formatter.parse(btime);
		date2 = formatter.parse(atime);

		RibaoDepji ddd = new RibaoDepji();
		// 将数据传入service层

		List<RibaoDepji> ribao = new ArrayList<RibaoDepji>();
		ddd.setAtime(date2);
		ddd.setBtime(date1);
		ddd.setProname(proname);
		// 将数据放入service中并返回，返回值是ribao
		ribao = queryproworksservice.queryproworks(ddd);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("ribao", ribao);

		modelAndView.setViewName("/wyyxiangmuliang.jsp");

		return modelAndView;

	}
}