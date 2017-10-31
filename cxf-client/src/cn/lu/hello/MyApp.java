package cn.lu.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
ApplicationContext test=new ClassPathXmlApplicationContext("cxf.xml");
IHelloService proxy=(IHelloService) test.getBean("myClient");
String tString=proxy.hello("HELLO IS ME");
System.out.print(tString);
	}

}
