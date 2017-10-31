package com.lu.crm.mapper;

import java.util.List;

import com.lu.crm.pojo.BaseDict;

public interface BaseDictDao {
	//查询
		public List<BaseDict> selectBaseDictListByCode(String code);
}
