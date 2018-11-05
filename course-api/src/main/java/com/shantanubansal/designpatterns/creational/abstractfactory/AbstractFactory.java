package com.shantanubansal.designpatterns.creational.abstractfactory;

import com.shantanubansal.designpatterns.creational.abstractfactory.colorFactory.Color;
import com.shantanubansal.designpatterns.creational.abstractfactory.sizefactory.Size;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Size getSize(String size);
}
