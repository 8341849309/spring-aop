package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.OnlineStore;

public class AfterReturningAdviceTest {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		OnlineStore proxy = ctx.getBean("store", OnlineStore.class);

		System.out.println(proxy.shopping(new String[] {"Shirt","Plain Pant"}, new float[] {4500.0f,8000}));

		ctx.close();
	}

}
