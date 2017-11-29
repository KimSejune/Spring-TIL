package com.java.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation = "classpath:applicationCTX.xml";
		String configLocation1 = "classpath:applicationCTX1.xml";
		// configfile은 여러개 넣어줄 수 있다.
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation, configLocation1);
		
		Student student = ctx.getBean("student1", Student.class);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getHobbys());
		
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		// student2를 studentInfo를 통하여 student를 사용하여 생성해준다.
		Student student2 = studentInfo.getStudent(); // student1의 정보를 가져온다.student1 == student2
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		
		Student student3 = ctx.getBean("student3", Student.class);
		System.out.println(student3.getName());
		System.out.println(student3.getAge());
		System.out.println(student3.getHobbys());
		
		if(student == student3) {
			System.out.println("student == student3");
		}else {
			System.out.println("student != student3");
		}
		
		
		Family family = ctx.getBean("family", Family.class);
		if(student3.getName().toString().equals("세준")) {
			System.out.println(student3.getName()+"'s family");
			System.out.println(family.getPapaName());
			System.out.println(family.getMamiName());
			System.out.println(family.getSisName());
			System.out.println(family.getBroName());
			
		}
		
		ctx.close();
		
	}

}
