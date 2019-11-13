package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.Tixing;
import com.pojo.TixingData;
import com.service.TixingService;

@Service("TixingService")
public class TixingServiceImpl implements TixingService {

	@Autowired
	Tixing tiXing;

	/**
	 * 插入提醒信息
	 * 
	 * @param
	 * @return
	 * @throws Exception
	 */

	@Override
	public int insertTixing(TixingData tixing) throws Exception {
		int result = 0;
		result = tiXing.insertTixing(tixing);

		return result;
	}
}
