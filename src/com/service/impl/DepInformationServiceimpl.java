package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.DepInformation;
import com.pojo.DepData;
import com.service.DepInformationService;

@Service("DepInformationService")
public class DepInformationServiceimpl implements DepInformationService {
	@Autowired
	DepInformation depinmapper;
	
	public  DepData  query(String name) throws Exception{
		DepData Dep = depinmapper.query(name);
		return Dep;
		
	}
    
	/**
	 * 获取目录树信息
	 */
	@Override
	public List<DepData> getShu(String proid) throws Exception {
		// TODO Auto-generated method stub
		List<DepData> list = null;
		
		list  =  depinmapper.queryDepAll(proid);
		
		return list;
	}
	
	
	/**
	 * 更新部门信息
	 * @param  
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateDep(DepData depdata) throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
		    result = depinmapper.updateDep(depdata);
		return result;
	}

	/**
	 * 保存新的部门信息
	 * @param  
	 * @return
	 * @throws Exception
	 */
	@Override
	public int saveDep(DepData depdata) throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
			result = depinmapper.saveDep(depdata);
		
		return result;
	}
    
	/**
	 *删除部门信息
	 * @param  
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteDep(String depid) throws Exception {
		// TODO Auto-generated method stub
		return depinmapper.deleteDep(depid);
	}
	
}