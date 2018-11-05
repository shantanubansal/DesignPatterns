package com.shantanubansal.designpatterns.creational.factory;

public class PaintRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorFactory colorFactory = new ColorFactory();
		Color color = colorFactory.getColor("red");
		color.paint();
	}

}
