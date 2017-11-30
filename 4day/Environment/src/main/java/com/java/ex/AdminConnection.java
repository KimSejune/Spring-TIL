package com.java.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean{
	
	private Environment env;
	private String adminId;
	private String adminPw;

	// bean이 처음으로 호출되는 순간에 콜백이 된다.환경설정부분이라서 가장 처음에 발생한다.
	@Override
	public void setEnvironment(Environment env) {
		// TODO Auto-generated method stub
		System.out.println("setEnvironment()");
		setEnv(env);
		// env는 MainClass의 존재하는 env와 같으며 admin.properties를 포함하고 있다.
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
	public Environment getEnv() {
		return env;
	}

	public String getAdminId() {
		return adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}
	
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy()");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
		
	}


	

}
