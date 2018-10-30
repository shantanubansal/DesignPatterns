package com.shantanubansal.designpatterns.abstractfactory.sizefactory;

import com.shantanubansal.designpatterns.abstractfactory.AbstractFactory;
import com.shantanubansal.designpatterns.abstractfactory.colorFactory.Color;

/**
 * @author : iamshantanubansal@gmail.com, shantanubansal05@gmail.com, theshantanubansal@gmail.com
 * Factory Design Pattern:
 * 
 * This Design pattern can be classified as "Creational Pattern"
 * Provides one of the best ways to create the object
 * Here we create the object without actually exposing the way to create it.
*/

public class SizeFactory extends AbstractFactory{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Size getSize(String size) {
		if(size.equalsIgnoreCase("Tweleve")) {
			return (new Tweleve());
		}
		if(size.equalsIgnoreCase("Ten")) {
			return (new Ten());
		} 
		if(size.equalsIgnoreCase("Fourteen")) {
			return (new Fourteen());
		} 
		else
			return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
