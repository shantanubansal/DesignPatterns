package com.shantanubansal.designpatterns.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost of the Meal: " + vegMeal.getCost());
		Meal paneerTikkaMeal = mealBuilder.preparePaneerTikkaMeal();
		System.out.println("PaneerTikka Meal");
		paneerTikkaMeal.showItems();
		System.out.println("Total Cost of the Meal: " + paneerTikkaMeal.getCost());
	}
}
