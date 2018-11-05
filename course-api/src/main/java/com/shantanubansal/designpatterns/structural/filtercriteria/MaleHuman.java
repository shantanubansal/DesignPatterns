package com.shantanubansal.designpatterns.structural.filtercriteria;

import java.util.List;
import java.util.stream.Collectors;

public class MaleHuman implements Criteria {

	@Override
	public List<Human> meetCriteria(List<Human> humans) {
		return humans.stream().filter(human -> human.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
