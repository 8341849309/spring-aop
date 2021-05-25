package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.OnlineStore;

@SpringBootApplication
public class AfterReturningAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AfterReturningAdviceTest.class, args);

		OnlineStore proxy = ctx.getBean("store", OnlineStore.class);

		System.out.println(proxy.shopping(new String[] { "Shirt", "Plain Pant" }, new float[] { 4500.0f, 8000 }));

		((ConfigurableApplicationContext) ctx).close();

	}

}
