package com.pojo;
/**
 * 批量审核
 * @author li
 *
 */
public class PshenHe {
   private String caoZuo;  
   private String ids;
   private String reason;
   
   public PshenHe(String caoZuo, String ids, String reason) {
		super();
		this.caoZuo = caoZuo;
		this.ids = ids;
		this.reason = reason;
	}  
public String getCaoZuo() {
	return caoZuo;
}
public void setCaoZuo(String caoZuo) {
	this.caoZuo = caoZuo;
}
public String getIds() {
	return ids;
}
public void setIds(String ids) {
	this.ids = ids;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
}
