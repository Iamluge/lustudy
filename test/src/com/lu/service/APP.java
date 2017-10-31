package com.lu.service;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebserviceServerService webserviceServerService=new WebserviceServerService();
WebserviceServer webserviceServer=webserviceServerService.getWebserviceServerPort();
webserviceServer.helloworld("胜爷——————————————");
	}

}
