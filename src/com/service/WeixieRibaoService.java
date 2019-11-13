package com.service;

import java.util.List;

import com.pojo.Ribaodata;

public interface WeixieRibaoService {

	List<Ribaodata> weixie(String renid);

	List<Ribaodata> weishenhe(String renid);

}
