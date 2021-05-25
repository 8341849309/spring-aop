package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class AspectjAOPAroundAdviceTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//proxy class obj
		BankService proxy=ctx.getBean("bankService", BankService.class);
		System.out.println(proxy.getClass()+"  "+proxy.getClass().getSuperclass());
		System.out.println("============================");
		//invoke methods
		System.out.println("Simple Interest:: "+proxy.calcSimpleInterestAmount(10000, 2, 2));
		System.out.println("============================");
		System.out.println("Compund Interest:: "+proxy.calCompoundInterestAmount(10000, 2, 2));
		
		ctx.close();
	}

}
