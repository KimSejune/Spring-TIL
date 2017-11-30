package com.java.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // 생성 
		
		ctx.load("classpath:applicationCTX.xml");  // 설정 
		ctx.refresh();
		
		Student student = ctx.getBean("student", Student.class); // 사용 
		System.out.println(student.getName()); 
		student.setName("김세준");
		System.out.println(student.getName());
		ctx.close(); // 종료 
	}

}
