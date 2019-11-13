package com.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.pojo.Ribaodata;

public interface RiBaoService {
	//添加日报时的获取用户名和项目名的操作 以及获取depid
	public Map<String, String> addPaperService(Map<String, String> map);
	//将日报信息插入
	public int insertRibao(Ribaodata ribaodata);
	//执行日报的无条件查询
	public ArrayList<Ribaodata> queryRibao(String renid);
	//执行日报的条件查询
	public ArrayList<Ribaodata> queryRibaoBytiaojian(Date sdate,Date edate);
	
	//删除日报
	public int deleteRibaoByid(String baoid);
	//更改日报
	
	public int updateRibaoByid(Ribaodata ribaodata);
	
}
