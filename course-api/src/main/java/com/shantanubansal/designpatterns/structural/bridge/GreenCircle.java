package com.shantanubansal.designpatterns.structural.bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Circle with Radious: " + radius + " is Green in Color. (X,Y):( " + x + "," + y + ")");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
