package com.pojo;
/**
 * 王月妍
 * 日报对象实体封装类
 * 2017-2-23
 * 秦杰 将workload改为int型，添加depid部门id  2017-2-27
 */
import java.util.Date;

public class Ribaodata {
	private String baoid;    //日报ID
	private String proid;    //项目ID
	private String proname;  //项目名称
	private String proprp;   //日报PRP
	private String context;  //任务
	private int workload;  //工作量 
	private int  addtime;    //加班时间
	private Date uptime;     //日报上传时间
	private String renid;    //编写人ID
	private String renname;  //编写人名
	private String upid;     //上司ID
	private String upstate;  //上传状态
	private String shenstate;  //日报审核状态
	private String reason;     //原因
	private String depid;    //部门id
	public String getBaoid() {
		return baoid;
	}

	public void setBaoid(String baoid) {
		this.baoid = baoid;
	}

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

	public String getProprp() {
		return proprp;
	}

	public void setProprp(String proprp) {
		this.proprp = proprp;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	public int getAddtime() {
		return addtime;
	}

	public void setAddtime(int addtime) {
		this.addtime = addtime;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDepid() {
		return depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

}
