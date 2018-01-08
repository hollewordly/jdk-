package com.ly.maven.test;

import java.lang.reflect.Proxy;

import org.apache.catalina.User;
import org.junit.Test;

import com.ly.maven.pojo.po.UserService;
import com.ly.maven.pojo.po.impl.UserServiceImpl;
import com.ly.maven.proxy.PerformHandler;

public class Mytest {

	public Mytest() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void test() {
		UserService service = new UserServiceImpl();
		PerformHandler handler = new PerformHandler(service);
		service = (UserService) Proxy.newProxyInstance(service.getClass().getClassLoader(),service.getClass().getInterfaces(),handler);
		service.login();
		
	}
}
