package com.nt.advice;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("dcAdvice")
@Aspect
public class DiscountCouponAdvice {

	@AfterReturning(returning = "billAmt" , value = "execution (double com.nt.service.OnlineStore.shopping(..))")
	public void generateCoupon(JoinPoint jp, double billAmt) throws Throwable {
		System.out.println("DiscountCouponAdvice.generateCoupon()");
		String couponCode;
		
		if (billAmt>5000)
			couponCode="MINUS30%";
		else if(billAmt>=3000)
			couponCode="MINUS20%";
		else if (billAmt>=1000)
			couponCode="MINUS10%";
		else
			couponCode="MINUS05%";
		
		System.out.println(couponCode);
		/*
		 * FileWriter writer = new FileWriter(
		 * "D:\\RDP\\Eclipse work bench\\SpringAOP\\AOPProj04-Decl-AfterReturningAdvice-DiscountCoupon\\resources\\couponcode.txt"
		 * ); writer.write(couponCode); writer.flush(); writer.close();
		 */
	}
}
