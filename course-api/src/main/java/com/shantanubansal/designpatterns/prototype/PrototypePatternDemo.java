package com.shantanubansal.designpatterns.prototype;

public class PrototypePatternDemo {

	public static void main(String[] args) {

		FoodCache.loadCache();
		Food clonedFood = (Food) FoodCache.getFood("1");
		System.out.println("Food: " + clonedFood.getType());
		

		Food clonedFood2 = (Food) FoodCache.getFood("2");
		System.out.println("Food: " + clonedFood2.getType());
		

		Food clonedFood3 = (Food) FoodCache.getFood("3");
		System.out.println("Food: " + clonedFood3.getType());
	}

}
