package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mapper.QueryDepWorkload;
import com.pojo.DepWorkloaddata;
import com.service.DepWorkloadService;



//WeeklyService的实体类
@Service("DepWorkloadService")
public class QueryDepWorkloadServiceImpl implements DepWorkloadService {

	@Autowired
	QueryDepWorkload QueryDepWorkload;
	
	public List<DepWorkloaddata> querydepworkload(DepWorkloaddata ddd) {
		List<DepWorkloaddata>  lst =QueryDepWorkload.querydepworkload(ddd);
		//返还数组数据
		return lst;
	}
}
