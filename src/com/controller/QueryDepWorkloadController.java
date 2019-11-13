package com.controller;
/**
 *杨嘉钦 
 * 部门工作量查询及导出controller
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

import com.pojo.DepWorkloaddata;
import com.service.DepWorkloadService;

@Controller

public class QueryDepWorkloadController {
	//获取查询日报的服务
	@Autowired
	private DepWorkloadService DepWorkloadService;

	@RequestMapping("/querydepworkload")
	public ModelAndView userLogin(HttpServletRequest request) throws Exception {

		//获取用户名和时间
		 String time1 = request.getParameter("time1");
		 String time2 = request.getParameter("time2");
		 String depid = request.getParameter("depid");
		 
		 if(time1.equals("")||time2.equals("")||depid.equals(""))
		 {
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("msg", "输入值不能为空");
				modelAndView.setViewName("/bumengongzuoliangdaochu.jsp");

				return modelAndView;
		 }
		 
		 
		 //将String转化为Date
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		 java.util.Date time01=null;
		 java.util.Date time02=null;
		 time01= sdf.parse(time1);
		 time02= sdf.parse(time2);
		 
		 //赋值
		DepWorkloaddata ddd=new DepWorkloaddata();
		ddd.setTime1(time01);
		ddd.setTime2(time02);
		ddd.setDepid(depid);
		

		//调用接口，实现功能
		List<DepWorkloaddata> depworkloaddata = new ArrayList<DepWorkloaddata>();
		depworkloaddata = DepWorkloadService.querydepworkload(ddd);

		int i=depworkloaddata.size();
		int s=0;

		if(i==0)
		{
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("msg", "查询值为空");
			modelAndView.setViewName("/bumengongzuoliangdaochu.jsp");

			return modelAndView;
		}
		for(int j=0;((j+1)%3==0)||(j<i);j++)
		{
			s=s+depworkloaddata.get(j).getWorkload();
		}


		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("depworkloaddata", depworkloaddata);
		modelAndView.addObject("s", s);
		modelAndView.setViewName("/bumengongzuoliangdaochujieguo.jsp");

		return modelAndView;

	}
}
