package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ProWorks;
import com.pojo.RibaoDepji;
import com.service.QueryProWorksService;

@Service("QueryProWorksService")
public class QueryProWorksServiceImpl implements QueryProWorksService {

	@Autowired
	ProWorks proworks;

	/**
	 * 项目工作量查询
	 */

	@Override
	public List<RibaoDepji> queryproworks(RibaoDepji ddd) {
		List<RibaoDepji> lst = proworks.queryproworks(ddd);
		// 返还数组数据
		return lst;
	}

}
