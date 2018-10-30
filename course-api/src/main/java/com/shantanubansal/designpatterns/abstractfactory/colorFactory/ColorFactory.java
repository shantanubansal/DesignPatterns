package com.shantanubansal.designpatterns.abstractfactory.colorFactory;

import com.shantanubansal.designpatterns.abstractfactory.AbstractFactory;
import com.shantanubansal.designpatterns.abstractfactory.sizefactory.Size;

/**
 * @author : iamshantanubansal@gmail.com, shantanubansal05@gmail.com, theshantanubansal@gmail.com
 * Factory Design Pattern:
 * 
 * This Design pattern can be classified as "Creational Pattern"
 * Provides one of the best ways to create the object
 * Here we create the object without actually exposing the way to create it.
*/

public class ColorFactory extends AbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Color getColor(String colorType) {
		if(colorType.equalsIgnoreCase("red")) {
			return (new Red());
		}
		if(colorType.equalsIgnoreCase("blue")) {
			return (new Blue());
		} 
		if(colorType.equalsIgnoreCase("green")) {
			return (new Green());
		} 
		else
			return null;
	}

	@Override
	public Size getSize(String size) {
		// TODO Auto-generated method stub
		return null;
	}

}
