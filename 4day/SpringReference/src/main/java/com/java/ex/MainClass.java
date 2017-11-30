package com.java.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation = "classpath:applicationCTX.xml"; 
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		Student student1 = ctx.getBean("student", Student.class);
		
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		
		Student student2 = ctx.getBean("student", Student.class);
		
		student2.setName("수현");
		student2.setAge(24);
		
		// student2를 설정했는데 student1도 바뀌어있다 
		// 즉 같은 student를 가르키기 때문이다.
		
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		
		if(student1.equals(student2)) {
			System.out.println("equals");
		}else {
			System.out.println("nono");
		}
		ctx.close();
	}

}
