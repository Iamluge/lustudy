package com.lu.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lu.jd.pojo.ProductModel;
import com.lu.jd.service.JDService;

@Controller
public class JDController {
	@Autowired
	private JDService jDService;
@RequestMapping(value="list.action")
public String jdSearch(String queryString, String catalog_name, String price,
		String sort,Model model) throws Exception{
	if(queryString==null||queryString=="")
	{
		queryString="幽默";
	}
	List<ProductModel> productModels = jDService.selectProductModelListByQuery(queryString, catalog_name, price, sort);
	model.addAttribute("productModels", productModels);
	model.addAttribute("queryString", queryString);
	model.addAttribute("catalog_name", catalog_name);
	model.addAttribute("price", price);
	model.addAttribute("sort", sort);
	return "product_list";
}
}
