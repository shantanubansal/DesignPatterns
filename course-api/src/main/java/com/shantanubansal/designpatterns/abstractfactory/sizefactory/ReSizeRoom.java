package com.shantanubansal.designpatterns.abstractfactory.sizefactory;

public class ReSizeRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SizeFactory sizeFactory = new SizeFactory();
		Size color = sizeFactory.getSize("Fourteen");
		color.buildSize();
	}

}
