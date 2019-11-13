package com.service;

import java.util.List;

import com.pojo.DepData;

public interface DepInformationService {
	
	public  DepData  query(String id) throws Exception;
	
	/**
	 * 获取目录树
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public  List<DepData>  getShu(String proid) throws Exception;
	
	/**
	 * 更新部门信息
	 * @param  
	 * @return
	 * @throws Exception
	 */
	public  int  updateDep(DepData data) throws Exception;
	
	/**
	 * 保存新的部门信息
	 * @param  
	 * @return
	 * @throws Exception
	 */
	public  int saveDep(DepData data)throws Exception;
	
	/**
	 * 删除部门信息
	 * @param  
	 * @return
	 * @throws Exception
	 */
	public  int  deleteDep(String depid) throws Exception;
}
