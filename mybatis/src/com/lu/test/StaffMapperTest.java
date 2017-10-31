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

import com.lu.mapper.StaffMapper;
import com.lu.pojo.QueryVo;
import com.lu.pojo.Staff;

public class StaffMapperTest {
	// @Test
	public void testMapper() throws IOException {
		// 加载核心配置文件
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建sqlsessionfactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StaffMapper staffMapper = sqlSession.getMapper(StaffMapper.class);
		// Staff staff=staffMapper.findStaffById("103");
		// System.out.println(staff);

		// 测试包装类型
		QueryVo vo = new QueryVo();
		Staff staff = new Staff();
		staff.setName("胜");
		vo.setStaff(staff);
		List<Staff> staffs = staffMapper.findStaffQueryVo(vo);
		for (Staff staff2 : staffs) {
			System.out.println(staff2);
		}
		System.out.println("the count is " + staffMapper.findCountQueryVo(vo));

	}

	// @Test
	public void testMapperfindStaffByIdAndName() throws IOException {
		// 加载核心配置文件
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建sqlsessionfactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StaffMapper staffMapper = sqlSession.getMapper(StaffMapper.class);
		// Staff staff=staffMapper.findStaffById("103");
		// System.out.println(staff);

		// 测试包装类型

		Staff staff = new Staff();
		staff.setName("胜爷");
		staff.setId("105");

		List<Staff> staffs = staffMapper.findStaffByNameAndId(staff);
		for (Staff staff2 : staffs) {
			System.out.println(staff2);
		}

	}

	@Test
	public void testMapperfindStaffByIdList() throws IOException {
		// 加载核心配置文件
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建sqlsessionfactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StaffMapper staffMapper = sqlSession.getMapper(StaffMapper.class);
		// Staff staff=staffMapper.findStaffById("103");
		// System.out.println(staff);

		QueryVo queryVo = new QueryVo();
		List<String> list = new ArrayList<>();
		list.add("103");
		list.add("104");
		list.add("107");
		queryVo.setIdList(list);
		List<Staff> staffs = staffMapper.findStaffByIdList(queryVo);
		for (Staff staff2 : staffs) {
			System.out.println(staff2);
		}

	}
}
