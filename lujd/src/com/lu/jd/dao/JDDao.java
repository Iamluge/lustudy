package com.lu.jd.dao;

import java.util.List;

import com.lu.jd.pojo.ProductModel;

public interface JDDao {
	//// 通过上面四个条件查询对象商品结果集
	public List<ProductModel> selectProductModelListByQuery(String queryString, String catalog_name,
			String price,String sort) throws Exception ;
}
