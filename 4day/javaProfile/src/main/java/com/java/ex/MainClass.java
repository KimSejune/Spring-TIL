package com.java.ex;

import java.util.Scanner;

import org.omg.PortableInterceptor.ServerRequestInfo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String config = null;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		if(str.equals("dev")) {
			config = "dev";
		}else if(str.equals("run")){
			config = "run";
		}else {
			System.out.println("error");
		}
		scanner.close();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.register(ApplicationDev.class, ApplicationRun.class);
		ctx.refresh();
		
		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println(serverInfo.getIp());
		System.out.println(serverInfo.getPort());
		ctx.close();
			

	}

}
