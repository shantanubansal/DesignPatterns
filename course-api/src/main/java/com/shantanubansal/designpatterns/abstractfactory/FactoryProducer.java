package com.shantanubansal.designpatterns.abstractfactory;

import com.shantanubansal.designpatterns.abstractfactory.colorFactory.ColorFactory;
import com.shantanubansal.designpatterns.abstractfactory.sizefactory.SizeFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String factoryType) {
		if(factoryType.equalsIgnoreCase("color")) {
			return (new ColorFactory());
		}
		if(factoryType.equalsIgnoreCase("size")) {
			return (new SizeFactory());
		} 
		else
			return null;
	}
}
