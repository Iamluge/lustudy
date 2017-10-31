package com.lu.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lu.mapper.OrderMapper;
import com.lu.mapper.StaffMapper;
import com.lu.pojo.Orders;
import com.lu.pojo.QueryVo;
import com.lu.pojo.Staff;

public class OrdersMapperTest {




	//@Test
	public void testMapperfindStaffByIdList() throws IOException {
		// 加载核心配置文件
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建sqlsessionfactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
		List<Orders> order=orderMapper.selectOrders();
		

	
		
		for (Orders order1:order) {
			System.out.println(order1);
		}

	}
	
	@Test
	public void testMapper() throws IOException {
		// 加载核心配置文件
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建sqlsessionfactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
		List<Staff> order=orderMapper.selectStaffList();
		

	
		
		for (Staff order1:order) {
			System.out.println(order1.getId()+"----"+order1.getOrdersList());
		}

	}
}
