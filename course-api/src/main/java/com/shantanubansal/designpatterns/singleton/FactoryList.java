package com.shantanubansal.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class FactoryList {

	private static List<String> factories = null;

	public static List<String> getFactories() {
		loadValues();
		return factories;
	}

	private static void loadValues() {
		if (factories == null) {
			factories = new ArrayList<String>();
			factories.add("size");
			factories.add("color");
		}
	}

	public void addFactory(String factory) {
		if (factories == null) {
			factories = new ArrayList<String>();
		}
		factories.add(factory);
	}

	public void addAllFactory(List<String> newFactories) {
		if (factories == null) {
			factories = new ArrayList<String>();
		}
		factories.addAll(newFactories);
	}

	public static void removeFactories(String factory) {
		if(factories != null) {
			factories.remove(factory);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
