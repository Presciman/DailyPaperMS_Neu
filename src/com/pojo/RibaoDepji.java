package com.pojo;

/**
 * 部门项目信息实体封装类定义
 * @author  王月妍
 * 2017-2-25
 */

import java.util.Date;

public class RibaoDepji {
	private String proname; // 项目名称
	private String workload; // 工作量
	private Date uptime; // 日报上传时间
	private String renid; // 编写人ID
	private String renname; // 编写人名
	private String upid; // 上司ID
	private String upstate; // 上传状态
	private String shenstate; // 日报审核状态
	private String depname; // 部门名称
	private String state; // 编写人名
	private Date atime;// 结束时间
	private Date btime;// 起始时间

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

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public String getWorkload() {
		return workload;
	}

	public void setWorkload(String workload) {
		this.workload = workload;
	}

	public Date getUptime() {
		return uptime;
	}

	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	public String getRenid() {
		return renid;
	}

	public void setRenid(String renid) {
		this.renid = renid;
	}

	public String getRenname() {
		return renname;
	}

	public void setRenname(String renname) {
		this.renname = renname;
	}

	public String getUpid() {
		return upid;
	}

	public void setUpid(String upid) {
		this.upid = upid;
	}

	public String getUpstate() {
		return upstate;
	}

	public void setUpstate(String upstate) {
		this.upstate = upstate;
	}

	public String getShenstate() {
		return shenstate;
	}

	public void setShenstate(String shenstate) {
		this.shenstate = shenstate;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
