package com.mapper;

import java.util.List;

import com.pojo.PshenHe;
import com.pojo.Ribaodata;
import com.pojo.ShenheData;

/**
 * 日报审核
 * @author 李广文
 * 2017-2-27
 */
public interface ShenHeMapper {
       /**
        *  查询日报，按条件查询
        */
	public List<Ribaodata> queryShenDaily(ShenheData shenheData)throws Exception;
	
	 /**
     *  批量审核日报
     */
	public int shenPDaily(PshenHe pshenHe) throws Exception;
	/**
     *  查询日报，按条id
     */
	public Ribaodata queryShenDailyById(String ribaoid) throws Exception; 
}
