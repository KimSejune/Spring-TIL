package com.java.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		
		String sigName = joinpoint.getSignature().toLongString();
		System.out.println(sigName+" is Start!!");
		long startTime = System.currentTimeMillis();
		
		try {
			Object obj = joinpoint.proceed();
			return obj;
		}finally {
			long endTime = System.currentTimeMillis();
			System.out.println(sigName+ " is End!!");
			System.out.println("소요시간 : " + (endTime-startTime));
		}
		
	}
	
	public void beforeMethod() {
		System.out.println("beforeMethod");	
	}
	
	public void after() {
		System.out.println("after");
	}
	
	public void afterReturn() {
		System.out.println("afterReturn");
	}
	
	public void afterThrow() {
		System.out.println("afterThrow");
	}
}
