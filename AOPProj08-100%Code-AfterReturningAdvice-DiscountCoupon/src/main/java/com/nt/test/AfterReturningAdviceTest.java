package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.service.OnlineStore;

public class AfterReturningAdviceTest {

	public static void main(String[] args) throws Exception {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		OnlineStore proxy = ctx.getBean("store", OnlineStore.class);

		System.out.println(proxy.shopping(new String[] { "Shirt", "Plain Pant" }, new float[] { 4500.0f, 8000 }));

		ctx.close();
	}

}
