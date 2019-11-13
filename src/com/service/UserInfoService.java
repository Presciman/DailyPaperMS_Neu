package com.service;

import java.util.List;

import com.pojo.userData;

public interface UserInfoService {

	/**
	 * 查询所有用户名
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<userData> selectuser() throws Exception;

	public List<userData> selectpassword(String username) throws Exception;

	public int updatepassword(userData user);
}
