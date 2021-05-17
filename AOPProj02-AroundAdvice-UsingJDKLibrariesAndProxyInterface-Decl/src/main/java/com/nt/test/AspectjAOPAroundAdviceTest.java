package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IBankService;

public class AspectjAOPAroundAdviceTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//proxy class obj
		IBankService proxy=ctx.getBean("bankService", IBankService.class);
		System.out.println(proxy.getClass()+"  "+proxy.getClass().getSuperclass());
		System.out.println("============================");
		//invoke methods
		System.out.println("Simple Interest:: "+proxy.calcSimpleInterestAmount(10000, 2, 2));
		System.out.println("============================");
		System.out.println("Compund Interest:: "+proxy.calCompoundInterestAmount(10000, 2, 2));
		System.out.println("=============================");
		System.out.println("Simple Interest:: "+proxy.calcSimpleInterestAmount(10000, 2, 2));
		System.out.println("============================");
		System.out.println("Compund Interest:: "+proxy.calCompoundInterestAmount(10000, 2, 2));
		
		ctx.close();
	}

}
