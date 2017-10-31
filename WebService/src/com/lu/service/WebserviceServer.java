package com.lu.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class WebserviceServer {
	public String helloworld(String name) {
		System.out.println("我被调用用啦");
		return "hello" + name;
	}

	public static void main(String[] args) {
		String ipString = "http://192.168.240.1:8080/hello";
		Object iObject = new WebserviceServer();
		Endpoint.publish(ipString, iObject);
	}

}
