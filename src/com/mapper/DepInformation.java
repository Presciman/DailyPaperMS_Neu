package com.mapper;

import java.util.List;

import com.pojo.DepData;

public  interface DepInformation {
	public DepData query(String name) throws Exception;
	
	/**
	 * 获取目录树所有部门
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public  List<DepData>  queryDepAll(String proid) throws Exception;
	
	/**
	 * 更新部门信息
	 * @param  
	 * @return
	 * @throws Exception
	 */
	public int updateDep(DepData depdata) throws Exception;
	
	/**
	 * 保存新的部门信息
	 * @param  
	 * @return
	 * @throws Exception
	 */
	public int saveDep(DepData depdata) throws Exception;
	
	/**
	 * 删除部门信息
	 * @param  
	 * @return
	 * @throws Exception
	 */
	public int deleteDep(String depid) throws Exception;

	
}
