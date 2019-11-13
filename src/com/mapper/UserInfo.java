package com.mapper;

import java.util.List;

import com.pojo.userData;

public interface UserInfo {
	public List<userData> selectuser() throws Exception;

	public List<userData> selectpassword(String username) throws Exception;

	public int updatepassword(userData user1);
}
