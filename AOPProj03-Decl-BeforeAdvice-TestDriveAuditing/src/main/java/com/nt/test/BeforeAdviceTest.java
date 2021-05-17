package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CarShowRoom;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		CarShowRoom proxy=ctx.getBean("csr", CarShowRoom.class);
		
		System.out.println(proxy.sellCar("Venkateswarlu", "toyoto", 1300000));
		
		System.out.println(proxy.sellCar("Kishore", "Scorio", 1500000));

		ctx.close();
	}

}
