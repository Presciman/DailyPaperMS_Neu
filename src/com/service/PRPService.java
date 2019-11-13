package com.service;

import java.util.List;

import com.pojo.PRPData;
/**
 * ******************************V2.0********************************
 * @author Eric孙百西
 *
 * 
 *
 */
public interface PRPService {
  public List<PRPData> QueryPRP(String prp_short);
  public void InsertPRP(PRPData prpd);
  public void DeletePRP(int prpID);
  public void UpdatePRP(PRPData prpdt);
  public PRPData findPRPById(int id);
  public PRPData findNameStateByID(PRPData prpda);

		
	

}
