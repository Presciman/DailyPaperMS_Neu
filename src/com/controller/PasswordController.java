package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.userData;
import com.service.UserInfoService;

/**
 * 阎梓宁 用户密码维护controller 2017-03-01
 */

@Controller
public class PasswordController {

	@Autowired
	private UserInfoService userinfo;// 获取查询日报的服务

	@RequestMapping("/selectuser")
	public ModelAndView selectall(HttpServletRequest request) throws Exception {

		List<userData> user = new ArrayList<userData>();// 设置返回值为list

		user = userinfo.selectuser();// 调用service里的selectuser方法

		ModelAndView modelAndView = new ModelAndView();// 返回ModelAndView

		modelAndView.addObject("user", user);

		modelAndView.setViewName("/mima1.jsp");

		return modelAndView;

	}

	@RequestMapping("/selectpassword")
	public ModelAndView selectpassword(HttpServletRequest request)
			throws Exception {

		// 使用request对象的getSession()获取session
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("uname");
		List<userData> user = new ArrayList<userData>();

		System.out.println(username + "username");

		user = userinfo.selectpassword(username);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("user", user);

		// System.out.println(user.toString() + "12324");

		modelAndView.setViewName("/mima.jsp");

		return modelAndView;

	}

	@RequestMapping("/updatepassword")
	public ModelAndView updatepassword(HttpServletRequest request)
			throws Exception {

		// 使用request对象的getSession()获取session
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("uname");
		String password = request.getParameter("password");
		String depid = request.getParameter("depid");
		if (password.equals("") || depid.equals("")) {
			ModelAndView modelAndView = new ModelAndView();

			modelAndView.addObject("msg", "输入值不能为空");

			modelAndView.setViewName("/wyy4.jsp");

			return modelAndView;
		}

		userData user = new userData();
		user.setDepid(Integer.parseInt(depid));
		user.setPassword(password);
		user.setUsername(username);

		int flag = userinfo.updatepassword(user);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		if (flag == 0) {
			System.out.println("更改信息失败");
		} else {
			modelAndView.setViewName("/wyy4.jsp");
		}

		return modelAndView;

	}

}
