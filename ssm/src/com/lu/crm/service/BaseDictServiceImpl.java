package com.lu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lu.crm.mapper.BaseDictDao;
import com.lu.crm.pojo.BaseDict;

@Service
public class BaseDictServiceImpl implements BaseDictService{
	@Autowired
	private BaseDictDao baseDictDao;
	public List<BaseDict> findByCode(String code){
		return baseDictDao.selectBaseDictListByCode(code);
	}

}
