package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.WeixieRibao;
import com.pojo.Ribaodata;
import com.service.WeixieRibaoService;

@Service("WeixieRibaoService")
public class WeixieRibaoServiceImpl implements WeixieRibaoService {
	@Autowired
	WeixieRibao weixieribao;

	@Override
	public List<Ribaodata> weixie(String renid) {
		List<Ribaodata> list = null;

		try {
			list = weixieribao.weixie(renid);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Ribaodata> weishenhe(String renid) {
		List<Ribaodata> list = null;

		try {
			list = weixieribao.weishenhe(renid);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
