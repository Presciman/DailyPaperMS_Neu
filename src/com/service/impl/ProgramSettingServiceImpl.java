package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ProgramSetting;
import com.pojo.PRPjiData;
import com.pojo.ProData;
import com.pojo.RenjiData;
import com.pojo.Renyuandata;
import com.service.ProgramSettingService;


@Service
public class ProgramSettingServiceImpl implements ProgramSettingService{
@Autowired
 ProgramSetting programSetting;
	@Override
	public List<ProData> QueryPro(ProData prod) {
		List<ProData> list = null;
        try {
			list = programSetting.QueryPro(prod);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public void DeletePro(String proid) {
		try {
			programSetting.DeletePro(proid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void InsertPro(ProData prod) {
		try {
			programSetting.InsertPro(prod);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public ProData QueryByProid(String proid) {
		ProData prod = null;
		ProData p = new ProData();
		p.setProid(proid);
		try {
			prod = programSetting.QueryByProid(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prod;
	}
	@Override
	public void UpdatePro(ProData prod) {
		try {
			programSetting.UpdatePro(prod);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void InsertPRPji(PRPjiData prpj) {
		try {
			programSetting.InsertPRPji(prpj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Renyuandata> QueryRenByPro() {
		List<Renyuandata> list = null;
		try {
			list =programSetting.QueryRenjiByproid();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public Renyuandata QueryRennameById(Renyuandata rjd) {
		Renyuandata ren = new Renyuandata();
		try {
			ren = programSetting.QueryRennameById(rjd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("查询失败");
		}
		return ren;
	}
	@Override
	public void InsertRenyuanji(RenjiData rjd) {
		try {
			programSetting.InsertRenyuanji(rjd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("插入失败");
		}
		
	}
	@Override
	public void BusyRen(Renyuandata ren) {
		// TODO Auto-generated method stub
		try {
			programSetting.BusyRen(ren);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("忙等待");
		}
		
	}

}
