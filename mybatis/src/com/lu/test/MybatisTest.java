package com.lu.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lu.pojo.Staff;

public class MybatisTest {
@Test
	public void test() throws IOException{
	//加载核心配置文件
	String resource="sqlMapConfig.xml";
	InputStream inputStream=Resources.getResourceAsStream(resource);
	//创建sqlsessionfactory
	SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	//创建sqlsession
	SqlSession sqlSession=sqlSessionFactory.openSession();
	//Staff staff=sqlSession.selectOne("staff.findStaffById","101");
	//System.out.println(staff);
	/*List<Staff> staffs=sqlSession.selectList("staff.findStaffByName","2");
	for(Staff staff:staffs)
		System.out.println(staff);
		*/
	Staff staff=new Staff();
	staff.setId("109");
	staff.setName("胜爷");
	staff.setTelephone("1008611");
	staff.setStation("广东河源");
   sqlSession.update("staff.delete","110");
   sqlSession.update("staff.insert",staff);
    sqlSession.commit();
	//System.out.println(staff);
		
}

}
