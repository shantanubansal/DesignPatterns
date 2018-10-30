package com.shantanubansal.designpatterns.abstractfactory;

import com.shantanubansal.designpatterns.abstractfactory.colorFactory.Color;
import com.shantanubansal.designpatterns.abstractfactory.sizefactory.Size;

/**

 * @author : iamshantanubansal@gmail.com, shantanubansal05@gmail.com, theshantanubansal@gmail.com
 * Factory Design Pattern:
 
 Abstract Design Pattern:
 ------ Factory of Factories
 ------ Works around a super factory which create another factories
 ------ Comes under Creational Pattern
 ------ Interface is responsible for creating a factory of related objects without actually specifying the classes.

*/
public class BuildRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory sizeFactory = FactoryProducer.getFactory("size");
		Size size = sizeFactory.getSize("Ten");
		size.buildSize();

		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color = colorFactory.getColor("blue");
		color.paint();
		
	}

}
