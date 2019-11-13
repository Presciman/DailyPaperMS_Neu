package com.mapper;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pojo.Ribaodata;


public interface AddPaper {
	//用人id查找人名
	public String findrennameByid(String renid);
	//用项目id查找项目名
	public String findpronameByid(String proid);
	
	//秦杰加入用renid获取depid
	public String finddepidByid(String renid);
	//插入日报
	public int insertRibao(Ribaodata ribaodata);
}
