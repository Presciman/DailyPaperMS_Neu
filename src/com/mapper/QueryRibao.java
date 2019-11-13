package com.mapper;

import java.util.ArrayList;
import java.util.Date;

import com.pojo.Ribaodata;

public interface QueryRibao {
	
	public ArrayList<Ribaodata> queryRibao(String renid);
	public ArrayList<Ribaodata> queryRibaoBytiaojian(Date sdate,Date edate);
	public int deleteRibao(String baoid);
	public int updateRibao(Ribaodata ribaodata);

}
