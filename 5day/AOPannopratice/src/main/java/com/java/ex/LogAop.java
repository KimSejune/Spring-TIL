package com.java.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	@Pointcut("within(com.java.ex.*)")
	private void pointcutMethod(){
		
	}
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr+" is start");
		
		long startTime = System.currentTimeMillis();
		
		try {
			Object obj = joinpoint.proceed();
			return obj;
		} finally {
			long endTime = System.currentTimeMillis();
			System.out.println(signatureStr +" is finish");
			System.out.println(signatureStr +" 경과시간 " + (endTime - startTime));
			
		}
	}
	
	@Before("within(com.java.ex.*)")
	public void beforeMethod() {
		System.out.println("beforeMethod()");
	}
	
			
	

}
