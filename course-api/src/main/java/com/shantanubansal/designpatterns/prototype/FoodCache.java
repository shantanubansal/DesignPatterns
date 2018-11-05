package com.shantanubansal.designpatterns.prototype;

import java.util.Hashtable;

public class FoodCache {

	public static void main(String[] args) {
	}

	private static Hashtable<String, Food> foodMap = new Hashtable<String, Food>();

	public static Food getFood(String foodId) {
		Food cahchedFood = foodMap.get(foodId);
		return (Food) cahchedFood.clone();
	}

	public static void loadCache() {
		Biryani biryani = new Biryani();
		biryani.setId("1");
		foodMap.put(biryani.getId(), biryani);

		DaalBaati daalBaati = new DaalBaati();
		daalBaati.setId("2");
		foodMap.put(daalBaati.getId(), daalBaati);

		Pizza pizza = new Pizza();
		pizza.setId("3");
		foodMap.put(pizza.getId(), pizza);
	}
}
