package com.java.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		
		String str = joinpoint.getSignature().toShortString();
		System.out.println(str+"is start");
		
		long st = System.currentTimeMillis(); // 공통기능을 나타낸다.
		
		try {
			Object obj = joinpoint.proceed(); // 핵심기능을 나타낸다. 
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(str+"is finish");
			System.out.println("경과 시간 "+(et-st));
		}
		
		
		
	}
}
