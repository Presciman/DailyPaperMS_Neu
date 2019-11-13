package com.controller;

/**
 * 王月妍
 * 未写未审核日报查询controller
 * 2017-02-24
 */
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Ribaodata;
import com.service.WeixieRibaoService;

@Controller
public class QueryWeixieRibaoController {

	@Autowired
	private WeixieRibaoService weixieribao;// 获取查询日报的服务

	@RequestMapping("/querydailyweixie")
	public ModelAndView querydailyweixie(HttpServletRequest request)
			throws Exception {

		HttpSession session = request.getSession();
		String renid = (String) session.getAttribute("uname");
		List<Ribaodata> ribao = new ArrayList<Ribaodata>();

		ribao = weixieribao.weixie(renid);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("ribao", ribao);

		modelAndView.setViewName("/wyyweixie.jsp");

		return modelAndView;

	}

	@RequestMapping("/querydailyweishenhe")
	public ModelAndView querydailyweishenhe(HttpServletRequest request)
			throws Exception {

		HttpSession session = request.getSession();
		String renid = (String) session.getAttribute("uname");
		List<Ribaodata> ribao = new ArrayList<Ribaodata>();

		ribao = weixieribao.weishenhe(renid);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("ribao", ribao);

		modelAndView.setViewName("/wyyweishenhe.jsp");

		return modelAndView;

	}

}
