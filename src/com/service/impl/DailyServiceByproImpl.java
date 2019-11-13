package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.QueryDailyBypro;
import com.pojo.DailyData;
import com.service.DailyServiceBypro;

@Service("DailyServiceBypro")
public class DailyServiceByproImpl implements DailyServiceBypro {

	@Autowired
	QueryDailyBypro querydailybypro;

	/**
	 * 按条件 查询日报
	 */
	public List<DailyData> querydailybypro(DailyData ddd) {
		List<DailyData> lst = querydailybypro.querydailybypro(ddd);
		// 返还数组数据
		return lst;
	}

}
