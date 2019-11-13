package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.UserInfo;
import com.pojo.userData;
import com.service.UserInfoService;

@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfo userinfo;

	/**
	 * 查询所有用户
	 */

	@Override
	public List<userData> selectuser() throws Exception {
		// 调用mapper中的UserInfo接口中的sellectuser方法连接数据库返回值放在List<userData>中
		List<userData> lst = userinfo.selectuser();
		// 返还数组数据
		return lst;

	}

	@Override
	public List<userData> selectpassword(String username) throws Exception {
		List<userData> user = userinfo.selectpassword(username);
		return user;
	}

	@Override
	public int updatepassword(userData user1) {
		int flag = userinfo.updatepassword(user1);
		return flag;
	}

}