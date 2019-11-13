package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.QueryWeekly;
import com.pojo.Ribaodata;
import com.service.WeeklyService;


//WeeklyService的实体类
@Service("WeeklyService")
public class QueryWeeklyServiceImpl implements WeeklyService {

	@Autowired
	QueryWeekly Queryweekly;
	
	public List<Ribaodata> queryweekly(Ribaodata rrr) {
		List<Ribaodata>  lst =Queryweekly.queryweekly(rrr);
		//返还数组数据
		return lst;
	}
}
