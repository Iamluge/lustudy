package com.lu.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lu.common.utils.Page;
import com.lu.crm.pojo.BaseDict;
import com.lu.crm.pojo.Customer;
import com.lu.crm.pojo.QueryVo;
import com.lu.crm.service.BaseDictService;
import com.lu.crm.service.CustomerService;

@Controller
public class CustomerController {
	//解决硬编码问题
	@Value("${fromType.code}")
	private String fromTypeCode;
	@Autowired
	private BaseDictService baseDictService;
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value="/customer/list")
	public String open(QueryVo vo,Model model){
		List<BaseDict> fromType = baseDictService.findByCode(fromTypeCode);
		List<BaseDict> industryType = baseDictService.findByCode("001");
		List<BaseDict> levelType = baseDictService.findByCode("006");
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		//通过四个条件  查询分页对象
		Page<Customer> page = customerService.selectPageByQueryVo(vo);
		model.addAttribute("page", page);
		model.addAttribute("custName", vo.getCustName());
		model.addAttribute("custSource", vo.getCustSource());
		model.addAttribute("custIndustry", vo.getCustIndustry());
		model.addAttribute("custLevel", vo.getCustLevel());
		return "customer";
	}
	
	
	//去修改页面
		@RequestMapping(value = "/customer/edit.action")
		public @ResponseBody
		Customer edit(Integer id){
			return customerService.selectCustomerById(id);
		}
		//修改保存
		@RequestMapping(value = "/customer/update.action")
		public @ResponseBody
		String update(Customer customer){
			//修改
			customerService.updateCustomerById(customer);
			return "OK";
		}
		//删除
		@RequestMapping(value = "/customer/delete.action")
		public @ResponseBody
		String delete(Integer id){
			//删除
			customerService.deleteCustomerById(id);
			return "OK";
		}


}
