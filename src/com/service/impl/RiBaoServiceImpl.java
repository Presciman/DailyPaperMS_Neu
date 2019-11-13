package com.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.AddPaper;
import com.mapper.QueryRibao;
import com.pojo.Ribaodata;
import com.service.RiBaoService;
/**
 * 
 * @author 秦杰
 *日报服务
 */
@Service("RiBaoService")
public class RiBaoServiceImpl implements RiBaoService{
	@Autowired  //获取添加的服务
	AddPaper addpaper;
	@Autowired  //获取查询的服务
	QueryRibao queryribao;
	
	//添加日报时获取项目名和人名的操作
	@Override
	public Map<String, String> addPaperService(Map<String, String> map) {
		//提取取人id和项目id，分别去查找
		//秦杰 加入用renid获取部门id 2017-2-27
		String renid = map.get("renid");
		String proid = map.get("proid");
		//用人id去找人名
		String renname = addpaper.findrennameByid(renid);
		//用项目id去找项目名
		String proname = addpaper.findpronameByid(proid);
		
		//用renid获取部门编号
		String depid = addpaper.finddepidByid(renid);
		
		//打包带回
		map.put("proname", proname);
		map.put("renname", renname);
		map.put("depid", depid);
		
		return map;
	}
	//将日报的信息插入到数据库中

	@Override
	public int insertRibao(Ribaodata ribaodata) {
			//调用添加日报服务中中方法，将日报进行插入
			addpaper.insertRibao(ribaodata);
		return 0;
	}

	@Override
	public ArrayList<Ribaodata> queryRibao(String renid) {
			//调用queryribao中的查询方法
		ArrayList<Ribaodata> ribaodata = new ArrayList<Ribaodata>();
		ribaodata = queryribao.queryRibao(renid);
		return ribaodata;
	}

	@Override
	public ArrayList<Ribaodata> queryRibaoBytiaojian(Date sdate,Date edate) {
		
		
		return queryribao.queryRibaoBytiaojian(sdate, edate);
	}

	@Override
	public int deleteRibaoByid(String baoid) {
			queryribao.deleteRibao(baoid);
		return 0;
	}

	@Override
	public int updateRibaoByid(Ribaodata ribaodata) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
