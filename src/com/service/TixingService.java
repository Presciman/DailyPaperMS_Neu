package com.service;

import com.pojo.TixingData;

public interface TixingService {

	/**
	 * 插入提醒
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int insertTixing(TixingData tixing) throws Exception;

}
