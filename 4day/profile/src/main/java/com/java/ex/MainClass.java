package com.java.ex;

import java.util.Scanner;

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
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("applicationCTX_dev.xml", "applicationCTX_run.xml");
		
		ServerInfo Info = ctx.getBean("serverInfo", ServerInfo.class);
		
		System.out.println(Info.getIpNum());
		System.out.println(Info.getPortNum());
		ctx.close();
	}

}
