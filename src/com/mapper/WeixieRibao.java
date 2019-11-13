package com.mapper;

import java.util.List;

import com.pojo.Ribaodata;

public interface WeixieRibao {
	/**
	 * 查询写日报日期
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Ribaodata> weixie(String renid) throws Exception;

	/**
	 * 查询未审核日报日期
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Ribaodata> weishenhe(String renid) throws Exception;
}
