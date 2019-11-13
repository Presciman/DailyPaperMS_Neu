package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ShenHeMapper;
import com.pojo.PshenHe;
import com.pojo.Ribaodata;
import com.pojo.ShenheData;
import com.service.ShenheService;

@Service("ShenheService")
public class ShenheServiceImp implements ShenheService{
	@Autowired
	private  ShenHeMapper heMapper;
	
	/**
	 * 按条件获取日报列表
	 * @param shenheData
	 * @return
	 * @throws Exception
	 */
	
	@Override
	public List<Ribaodata> queryShenDaily(ShenheData shenheData)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>>>>>>>>>>"+shenheData.getStime());
		System.out.println(">>>>>>>>>>>>>>>>"+shenheData.getEtime());
		System.out.println(">>>>>>>>>>>>>>>>"+shenheData.getRenName());
		System.out.println(">>>>>>>>>>>>>>>>"+shenheData.getUpId());
		return heMapper.queryShenDaily(shenheData) ;
	}

	/**
	 * 批量审核日报
	 * @param shenheData
	 * @return
	 * @throws Exception
	 */
	@Override
	public int shenDaily(String caoZuo, String[] ids,int len,String reason) throws Exception {
		// TODO Auto-generated method stub
		int res = 0;
		if(!caoZuo.equals("")&&caoZuo != null)
		{
			if(caoZuo.equals("1"))
			{
				for(int i=0;i<len;i++)
				{
					res+= heMapper.shenPDaily(new PshenHe("通过",ids[i],reason));
				} 	
			}
				
			else
				 
				if(caoZuo.equals("0"))
					for(int i=0;i<len;i++)
					{
						res+= heMapper.shenPDaily(new PshenHe("未通过",ids[i],reason));
					} 
		}
			
		return res;
	}

	@Override
	public Ribaodata queryShenDailyById(String ribaoid) throws Exception {
		 
		return heMapper.queryShenDailyById(ribaoid);
	}
   
}
