package com.lu.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lu.mapper.StaffMapper;
import com.lu.pojo.QueryVo;
import com.lu.pojo.Staff;

public class StaffDaoImpl implements StaffDao{

	
	//此处借来test一下
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		StaffMapper mapper = ac.getBean(StaffMapper.class);
//		UserMapper mapper = (UserMapper) ac.getBean("userMapper");
		//Staff staff= mapper.findStaffById("103");
		QueryVo queryVo=new QueryVo();
		Staff staff=new Staff();
		staff.setName("胜");
		queryVo.setStaff(staff);
		int test=mapper.findCountQueryVo(queryVo);
		System.out.println(test);
	}
}
