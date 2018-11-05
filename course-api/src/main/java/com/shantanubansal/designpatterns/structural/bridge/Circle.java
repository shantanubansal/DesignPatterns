package com.shantanubansal.designpatterns.structural.bridge;


public class Circle extends Shape {

	private int x, y, radius;

	protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
