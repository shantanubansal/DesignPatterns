package com.shantanubansal.designpatterns.creational.prototype;

public class Pizza extends Food{

	public static void main(String[] args) {

	}

	public Pizza() {
		type = "Pizza";
	}
	
	@Override
	void eat() {
		System.out.println("Inside Pizza :: eat() method.");
	}

}
