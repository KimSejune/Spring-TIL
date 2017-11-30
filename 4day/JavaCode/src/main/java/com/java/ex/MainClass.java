package com.java.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdminConnection adminConnection = ctx.getBean("adminConnection", AdminConnection.class);
		
		System.out.println(adminConnection.getAdminId());
		System.out.println(adminConnection.getAdminPw());
		System.out.println(adminConnection.getSub_adminId());
		System.out.println(adminConnection.getSub_adminPw());
		
		ctx.close();
		
	}

}
