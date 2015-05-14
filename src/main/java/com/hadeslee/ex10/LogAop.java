package com.hadeslee.ex10;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	@Pointcut("within(com.hadeslee.ex10.*)")
	private void pointcutMethod() {
	}
	
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println( signatureStr + " is start.");
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinpoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println( signatureStr + " is finished.");
			System.out.println( signatureStr + " 경과시간 : " + (et - st));
		}
		
	}
	
	@Before("within(com.hadeslee.ex10.*)")
	public void beforAdvice() {
		System.out.println("beforAdvice()");
	}
	
}
