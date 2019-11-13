package com.mapper;
import java.util.List;

import com.pojo.PRPData;
/**
 * ******************************V2.0********************************
 * @author Eric孙百西
 *
 * 
 *
 */
public interface PRP {
	public  List<PRPData> QueryPRP(com.pojo.PRPData  prpShort) throws Exception;
	public void InsertPRP(PRPData prpd) throws Exception;
	public void DeletePRP(int prp_id) throws Exception;
	public void UpdatePRP(PRPData prpdt) throws Exception;
	public PRPData SelectById(int id)throws Exception;
	public PRPData SelectNameStateByID(PRPData prpda)throws Exception;
	}
