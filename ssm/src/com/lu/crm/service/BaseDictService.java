package com.lu.crm.service;

import java.util.List;

import com.lu.crm.pojo.BaseDict;

public interface BaseDictService {
	public List<BaseDict> findByCode(String code);
}
