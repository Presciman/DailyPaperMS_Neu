package com.controller;

/**
 * 阎梓宁
 * 填写日报提醒日报提醒controller
 * 2017-03-01
 */
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.TixingData;
import com.service.TixingService;

@Controller
@RequestMapping("/tixing")
public class InsertDailyremindController {

	@Autowired
	TixingService tixingservice;

	@RequestMapping("/addtixing")
	public void addTixing(HttpServletRequest request,
			HttpServletResponse response) {
		String context = request.getParameter("context");
		String renid = request.getParameter("renid");
		String state = request.getParameter("state");
		String today = request.getParameter("today");

		Date date1 = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date1 = formatter.parse(today);
		} catch (ParseException e2) {
			e2.printStackTrace();
		}

		TixingData tixing = new TixingData();
		// 将数据传入service层

		tixing.setContext(context);
		tixing.setRenid(renid);
		tixing.setState(Integer.parseInt(state));
		tixing.setToday(date1);

		try {
			int result = tixingservice.insertTixing(tixing);

			PrintWriter out = response.getWriter();

			if (result == 1) {
				out.print("1");
			} else {
				out.print("0");
			}
			out.flush();
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
