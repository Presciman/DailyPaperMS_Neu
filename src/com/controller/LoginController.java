package com.controller;

import javax.servlet.http.HttpServletRequest;



import javax.servlet.http.HttpSession;

import com.pojo.userData;
import com.service.loginService;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller

@RequestMapping("/login")
public class LoginController {
	@Autowired
	private loginService loginService;//获取登录的服务
	
	@RequestMapping("/normal")
	public ModelAndView userLogin(HttpServletRequest request) throws Exception{
		userData userdata = new userData();
		userData backuser = new userData();
		//初始化backuser，为没有用户做准备
		
		String uname = request.getParameter("uname");
		if(uname.equals("")){
			uname = (String) request.getSession().getAttribute("uname");
		}
		String pwd = request.getParameter("pwd");
		//获取用户名和密码
		userdata.setUsername(uname);
		userdata.setPassword(pwd);
		//通多dao层去数据库中取数据,存放到user的pojo里去
		backuser=loginService.login(userdata);
		//获取传回来的密码
		String backpwd = backuser.getPassword();	
		// 
		ModelAndView modelAndView =  new ModelAndView();
		
		//判断密码是否正确
		if(pwd.equalsIgnoreCase(backpwd)){
			
			//将用户信息存入session
			 //使用request对象的getSession()获取session，如果session不存在则创建一个
			HttpSession session = request.getSession();
			//将数据存储到session中
			session.setAttribute("uname", backuser.getUsername());
			session.setAttribute("depid", backuser.getDepid());
			session.setAttribute("roleid", backuser.getRoleid());
			session.setMaxInactiveInterval(1*60*60);
			modelAndView.addObject("userdata", backuser);
			modelAndView.setViewName("/main.jsp");
			System.out.println("登录成功");
		}else{
		
			modelAndView.addObject("errorMsg", "密码错误！！！");
			modelAndView.setViewName("/login.jsp");
			System.out.println("登录失败");
		}
		return modelAndView;
	}
}
