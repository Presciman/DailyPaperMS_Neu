package com.pojo;

import java.util.Date;

public class TixingData {

	private Date today;
	private int state;
	private String renid;
	private String context;

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getRenid() {
		return renid;
	}

	public void setRenid(String renid) {
		this.renid = renid;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

}
