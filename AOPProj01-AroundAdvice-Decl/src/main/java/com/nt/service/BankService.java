package com.nt.service;

public class BankService {
	
	public double calcSimpleInterestAmount(float pAmt,float rate,float time) {
		System.out.println("BankService.calcSimpleInterestAmount()");
		return (pAmt*time*rate)/100.0f;
	}

	public double calCompoundInterestAmount(float pAmt,float rate,float time) {
		System.out.println("BankService.calCompoundInterestAmount()");
		return (pAmt*Math.pow(1+rate/100, time))-pAmt;
	}
	
}
