package com.lu.test;


import java.util.List;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lu.mybatis.mapper.StaffMapper;
import com.lu.mybatis.pojo.Staff;
import com.lu.mybatis.pojo.StaffExample;






public class TestMapper {

	
	//此处借来test一下
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		StaffMapper mapper = ac.getBean(StaffMapper.class);
		StaffExample example=new StaffExample();
		example.createCriteria().andIdEqualTo("103");
		List<Staff> staffs=mapper.selectByExample(example);
		for(Staff staff:staffs)
		{
			System.out.println(staff.getName());
		}

	}
}
