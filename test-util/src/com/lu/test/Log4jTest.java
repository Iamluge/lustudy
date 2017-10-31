package com.lu.test;



import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest {
@Test
public void test(){
	//System.out.println("dhsjkhjkhjsk");
	//获得日志记录器对象
	Logger logger=Logger.getLogger(Log4jTest.class); 
	logger.fatal("致命错误");
	logger.error("普通错误");
	logger.warn("警告信息");
	logger.info("普通信息");
	logger.debug("调试信息");
	logger.trace("堆栈信息");
	
}
}
