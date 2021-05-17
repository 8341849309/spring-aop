package com.nt.service;

public interface IBankService {

	public double calcSimpleInterestAmount(float pAmt,float rate,float time);
	public double calCompoundInterestAmount(float pAmt,float rate,float time);
}
