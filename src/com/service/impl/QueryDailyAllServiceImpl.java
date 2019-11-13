package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.QueryDailyAll;
import com.pojo.Ribaodata;
import com.service.DailyAllService;



//WeeklyService的实体类
@Service("DailyAllService")
public class QueryDailyAllServiceImpl implements DailyAllService {

	@Autowired
	QueryDailyAll QueryDailyAll;
	
	public List<Ribaodata> querydailyall(Ribaodata rrr) {
		List<Ribaodata>  lst =QueryDailyAll.querydailyall(rrr);
		//返还数组数据
		return lst;
	}
}
