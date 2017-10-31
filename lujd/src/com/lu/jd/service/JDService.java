package com.lu.jd.service;

import java.util.List;

import com.lu.jd.pojo.ProductModel;

public interface JDService {
	public List<ProductModel> selectProductModelListByQuery(String queryString, String catalog_name,
			String price,String sort) throws Exception ;
}
