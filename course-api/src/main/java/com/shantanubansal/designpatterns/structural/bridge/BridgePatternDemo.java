package com.shantanubansal.designpatterns.structural.bridge;

import com.shantanubansal.designpatterns.creational.factory.Green;

public class BridgePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}

}
