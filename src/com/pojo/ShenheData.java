package com.pojo;

import java.util.Date;

/**
 * 审核条件封装类
 * @author li
 *2017-2-27
 */
public class ShenheData {
     private String renId;  //人员ID
     private String renName; //人员名
     private Date stime;   //起始时间
     private Date etime;   //结束时间
     private String shenstate; //审核状态
    // private String upId; 
     private String  baoid;
     private String  upId;//审核人ID
     
     public String getShenstate() {
		return shenstate;
	}
	public void setShenstate(String shenstate) {
		this.shenstate = shenstate;
	}
	
	public String getRenId() {
		return renId;
	}
	public void setRenId(String renId) {
		this.renId = renId;
	}
	public String getRenName() {
		return renName;
	}
	public void setRenName(String renName) {
		this.renName = renName;
	}
	public Date getStime() {
		return stime;
	}
	public void setStime(Date stime) {
		this.stime = stime;
	}
	public Date getEtime() {
		return etime;
	}
	public void setEtime(Date etime) {
		this.etime = etime;
	}
	 
	public String getBaoid() {
		return baoid;
	}
	public void setBaoid(String baoid) {
		this.baoid = baoid;
	}
	public String getUpId() {
		return upId;
	}
	public void setUpId(String upId) {
		this.upId = upId;
	}
     
     
}
