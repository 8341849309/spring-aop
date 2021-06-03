package com.nt.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("pmAdvice")
@Aspect
public class PerformanceMonitoringAdvice {
	
	@Around(value = "execution (double com.nt.service.BankService.cal*(..))")
	public Object performance(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("PerformanceMonitoringAdvice.performance()---> Before entering");
		long start=System.currentTimeMillis();
		Object retVal=pjp.proceed();
		long end=System.currentTimeMillis();
		System.out.println("PerformanceMonitoringAdvice.performance()---> After entering");
		System.out.println(pjp.getSignature()+" with args "+Arrays.toString(pjp.getArgs())+" has taken"+(end-start)+"ms.");
		return retVal;
	}

}
