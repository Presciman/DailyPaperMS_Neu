package com.pojo;
/**
 * 部门实体封装类定义
 * @author  lixin
 * 2017-2-24
 */
public class DepData {
	private String depID; //部门ID
	private String depName;//部门名称 
	private String zhu; //部门备注
	private String proid;
	
	public String getProid() {
		return proid;
	}
	public void setProid(String proid) {
		this.proid = proid;
	}
	public String getZhu() {
		return zhu;
	}
	public void setZhu(String zhu) {
		this.zhu = zhu;
	}
	public String getDepID() {
		return depID;
	}
	public void setDepID(String depID) {
		this.depID = depID;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	 
	
	/*public DepData(String depID, String depName, String zhu) {
		super();
		this.depID = depID;
		this.depName = depName;
		Zhu = zhu;
	}*/
}
