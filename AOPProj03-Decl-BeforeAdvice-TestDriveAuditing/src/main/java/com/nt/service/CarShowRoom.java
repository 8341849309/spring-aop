package com.nt.service;

public class CarShowRoom {

	public String sellCar(String custName, String carName, double price) {
		System.out.println("CarShowRoom.sellCar()");
		if(carName.equalsIgnoreCase("toyoto"))
			return "Car "+carName+" is sold to "+custName+" at price:: "+price;
		else
			return "Car "+carName+" is not available for sale";
	}

}
