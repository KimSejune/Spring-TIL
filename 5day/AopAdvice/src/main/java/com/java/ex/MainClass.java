package com.java.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Student student = ctx.getBean("student", Student.class);

		student.StudentInfo();

		Worker worker = ctx.getBean("worker", Worker.class);
		worker.workerInfo();

		ctx.close();

	}

}
