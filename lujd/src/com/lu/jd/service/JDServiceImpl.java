package com.lu.jd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lu.jd.dao.JDDao;
import com.lu.jd.pojo.ProductModel;
@Service
public class JDServiceImpl implements JDService{
	@Autowired
	private JDDao jdDao;

	@Override
	public List<ProductModel> selectProductModelListByQuery(String queryString, String catalog_name, String price,
			String sort) throws Exception {
		// TODO Auto-generated method stub
		return jdDao.selectProductModelListByQuery(queryString, catalog_name, price, sort);
	}

}
