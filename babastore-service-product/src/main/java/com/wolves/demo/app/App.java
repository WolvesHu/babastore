package com.wolves.demo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application-context.xml"});    
        context.start(); 
	}
}
