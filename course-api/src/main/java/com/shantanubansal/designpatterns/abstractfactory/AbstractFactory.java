package com.shantanubansal.designpatterns.abstractfactory;

import com.shantanubansal.designpatterns.abstractfactory.colorFactory.Color;
import com.shantanubansal.designpatterns.abstractfactory.sizefactory.Size;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Size getSize(String size);
}
