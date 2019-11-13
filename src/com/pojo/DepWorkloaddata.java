package com.pojo;

import java.util.Date;


public class DepWorkloaddata {
	private String renname;
	private String renid;
	private String depid;
	private Date time1;
	private Date time2;
	public String getRenid() {
		return renid;
	}
	public void setRenid(String renid) {
		this.renid = renid;
	}
	private int workload;
	public String getDepid() {
		return depid;
	}
	public void setDepid(String depid) {
		this.depid = depid;
	}
	public Date getTime1() {
		return time1;
	}
	public void setTime1(Date time1) {
		this.time1 = time1;
	}
	public Date getTime2() {
		return time2;
	}
	public void setTime2(Date time2) {
		this.time2 = time2;
	}
	public int getWorkload() {
		return workload;
	}
	public void setWorkload(int workload) {
		this.workload = workload;
	}
	public void setRenname(String renname) {
		this.renname = renname;
	}
	public String getRenname() {
		return renname;
	}
	
	
}
