package com.hadeslee.ex8;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;


public class MainClass {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
			
			System.out.println( env.getProperty("admin.id") );
			System.out.println( env.getProperty("admin.pw") );
		} catch (IOException e) {}
		
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext)ctx;
		gCtx.load("applicationCTX8.xml");
		gCtx.refresh();
		
		AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);
		System.out.println("admin ID : " + adminConnection.getAdminId());
		System.out.println("amdin PW : " + adminConnection.getAdminPw());
		System.out.println("sub_adminID : " + adminConnection.getSub_adminId());
		System.out.println("sub_adminPW : " + adminConnection.getSub_adminPw());
		
		gCtx.close();
		ctx.close();
		
	}
	
}
