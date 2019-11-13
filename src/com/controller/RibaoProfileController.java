package com.controller;
/**
 * 李欣
 * 部门职能设定controller
 * 2017-02-23
 */
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dep")

public class RibaoProfileController {
		
	@RequestMapping("/profile")
	public ModelAndView depSet(HttpServletRequest request){     //部门设定
		
		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.setViewName("/jquerytree.jsp");
		
		
		return modelAndView;
		
	}
}
