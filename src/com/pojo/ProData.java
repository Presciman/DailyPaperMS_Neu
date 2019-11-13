package com.pojo;

import java.util.Date;

public class ProData {
	private String proid;
	private String proname;
	private Date starttime;
	private Date endtime;
	private int prostate;
	public String getProid() {
		return proid;
	}
	public void setProid(String proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public int getProstate() {
		return prostate;
	}
	public void setProstate(int prostate) {
		this.prostate = prostate;
	}

}
