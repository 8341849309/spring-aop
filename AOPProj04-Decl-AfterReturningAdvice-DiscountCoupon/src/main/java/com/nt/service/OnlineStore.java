package com.nt.service;

public class OnlineStore {

	public double shopping(String[] items, float[] prices) {
		System.out.println("OnlineStore.purchase()");
		float billAmt = 0.0f;
		
		for (float price : prices) {
			billAmt += price;
		}
		return billAmt;
	}
}
