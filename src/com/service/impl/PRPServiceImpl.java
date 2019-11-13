package com.service.impl;

//import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.PRP;
import com.pojo.PRPData;
import com.service.PRPService;
/**
 * ******************************V2.0********************************
 * @author Eric孙百西
 * 添加了条件查询功能
 * 添加了无条件查询功能
 * 添加了插入功能
 * 添加了PRP更新修改功能
 * 添加了PRP阶段名无重复插入功能
 * 添加了PPR阶段名无重复修改功能
 * plz：由于中间改动数据库的表，因此此版本较上一版本有较大改动
 * 
 *
 */
@Service
public class PRPServiceImpl implements PRPService{
@Autowired
  PRP prp;
	@Override
	public  List<PRPData> QueryPRP(String prp_short) {
		
		 List<PRPData> list= null;
		try {
			com.pojo.PRPData p=new com.pojo.PRPData();
			p.setPrp_short(prp_short);
			  list=prp.QueryPRP(p);
			  
		 	 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println(prp1);
//		System.out.println(list);
		return list;
			
		
		
	}
	@Override
	public void InsertPRP(PRPData prpd) {
		// TODO 插入数据
		try {
			prp.InsertPRP(prpd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void DeletePRP(int prp_id) {
        //TODO 删除
		try {
			prp.DeletePRP(prp_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void UpdatePRP(PRPData prpdt) {
		// TODO 更新(修改)
		try {
			prp.UpdatePRP(prpdt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public PRPData findPRPById(int id) {
		// TODO 根据传进来的id查找PRP信息，并将数据传入目标页
		PRPData prpdata=null;
		try {
			prpdata = prp.SelectById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prpdata;
	}
	@Override
	public PRPData findNameStateByID(PRPData prpda) {
		// TODO 根据传进来的对象prpda中的prp_name查询是否有相应行
		PRPData t = null;
		try {
			t = prp.SelectNameStateByID(prpda);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	}

 
   

