package com.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.normalLogin;
import com.pojo.userData;
import com.service.*;

@Service("loginService")
public class loginServiceimpl implements loginService {
  
	@Autowired
	normalLogin ulogin;



	@Override
	public userData login(userData userdata) {
		userData user = new userData();
		
		
		try {
			user=ulogin.login(userdata);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	

}
	

