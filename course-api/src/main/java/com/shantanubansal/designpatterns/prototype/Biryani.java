package com.shantanubansal.designpatterns.prototype;

public class Biryani extends Food{

	public static void main(String[] args) {

	}

	public Biryani() {
		type = "Birayni";
	}
	
	@Override
	void eat() {
		System.out.println("Inside Birayni :: eat() method.");
	}

}
