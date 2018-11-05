package com.shantanubansal.designpatterns.creational.prototype;

public class DaalBaati extends Food{

	public static void main(String[] args) {

	}

	public DaalBaati() {
		type = "Daal Baati";
	}
	
	@Override
	void eat() {
		System.out.println("Inside Daal Baati :: eat() method.");
	}

}
