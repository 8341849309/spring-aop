package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.nt.service.BankService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AroundAdviceTest {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(AroundAdviceTest.class, args);

		BankService ser = ctx.getBean("bankService", BankService.class);
		
		System.out.println(ser.calCompoundInterestAmount(1000, 2, 2));
		
		System.out.println("===================================================");
		
		System.out.println(ser.calcSimpleInterestAmount(1000, 2, 2));

		((ConfigurableApplicationContext) ctx).close();
	}

}
