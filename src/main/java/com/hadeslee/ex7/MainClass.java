package com.hadeslee.ex7;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.load("classpath:applicationCTX7.xml");
		
		ctx.refresh();
		
		ctx.close();
		
	}
	
}
