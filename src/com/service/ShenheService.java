package com.service;
/**
 * 李广文
 * 日报审核
 */
import java.util.List;

import com.pojo.Ribaodata;
import com.pojo.ShenheData;

public interface ShenheService {
	/**
	 * 按id获取日报
	 * @param String
	 * @return Ribaodata
	 * @throws Exception
	 */
	public  Ribaodata  queryShenDailyById(String ribaoid)throws Exception;
	
	/**
	 * 按条件获取日报列表
	 * @param shenheData
	 * @return
	 * @throws Exception
	 */
	public List<Ribaodata> queryShenDaily(ShenheData shenheData)throws Exception;
	/**
	 * 批量审核日报
	 * @param shenheData
	 * @return
	 * @throws Exception
	 */
	public int  shenDaily(String caoZuo,String[]  ids,int len,String reason)throws Exception;
}
