package com.pojo;

/**
 * 王月妍
 * 查询日报对象实体封装类
 * 2017-2-24
 */
import java.util.Date;

public class DailyData {
	private Date atime;// 结束时间
	private Date btime;// 起始时间
	private String renid;// 员工id

	public String getRenid() {
		return renid;
	}

	public void setRenid(String renid) {
		this.renid = renid;
	}

	private String proname;// 项目名称

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public Date getAtime() {
		return atime;
	}

	public void setAtime(Date atime) {
		this.atime = atime;
	}

	public Date getBtime() {
		return btime;
	}

	public void setBtime(Date btime) {
		this.btime = btime;
	}

}
