package com.java.ex;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();

		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));

			System.out.println(env.getProperty("admin.id")); // 알아서 스캔해서 가져온다.
			System.out.println(env.getProperty("admin.pw"));
		} catch (IOException e) {
		}
		// TODO Auto-generated catch block

		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;
		gCtx.load("applicationCTX.xml");
		gCtx.refresh();

		AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);

		// bean에서 값을 주어지지 않았고 AdminConnection의 constructor가 없는데도 불구하고
		// implements를 통하여
		// EnvironmentAware를 참조했기 때문이다.
		System.out.println(adminConnection.getAdminId());
		System.out.println(adminConnection.getAdminPw());

		gCtx.close();
		ctx.close();

	}

}
