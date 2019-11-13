package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.QueryDaily;
import com.pojo.DailyData;
import com.service.DailyService;

@Service("DailyService")
public class QueryDailyServiceImpl implements DailyService {

	@Autowired
	QueryDaily querydaily;

	/**
	 * 按条件 查询日报
	 */
	public List<DailyData> querydaily(DailyData ddd) {
		List<DailyData> lst = querydaily.querydaily(ddd);
		// 返还数组数据
		return lst;
	}
}
