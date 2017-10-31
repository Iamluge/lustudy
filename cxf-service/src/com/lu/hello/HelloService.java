package com.lu.hello;

public class HelloService implements IHelloService {

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		System.out.println("CXF 被调用啦！！！");
		return "hello"+name;
	}

}
