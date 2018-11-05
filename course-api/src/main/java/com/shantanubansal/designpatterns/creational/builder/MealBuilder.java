package com.shantanubansal.designpatterns.creational.builder;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	
	public Meal preparePaneerTikkaMeal() {
		Meal meal = new Meal();
		meal.addItem(new PaneerTikkaBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
