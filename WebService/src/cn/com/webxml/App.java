package cn.com.webxml;

import org.junit.Test;

public class App {
	@Test
public  void test() {
	MobileCodeWS mobileCodeWS=new MobileCodeWS();
	MobileCodeWSSoap mobileCodeWSSoap=mobileCodeWS.getMobileCodeWSSoap();
	String ret=mobileCodeWSSoap.getMobileCodeInfo("15016234499", null);
	System.out.println(ret);
	
}
}
