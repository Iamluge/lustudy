package com.lu.mapper;

import java.util.List;

import com.lu.pojo.Orders;
import com.lu.pojo.Staff;




public interface OrderMapper {
	
	

	
	//一对一关联 查询  以订单为中心 关联用户
	public List<Orders> selectOrders();
	public List<Staff> selectStaffList();

	
}
