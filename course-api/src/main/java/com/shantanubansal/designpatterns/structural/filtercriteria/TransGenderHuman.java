package com.shantanubansal.designpatterns.structural.filtercriteria;

import java.util.List;
import java.util.stream.Collectors;

public class TransGenderHuman implements Criteria {

	@Override
	public List<Human> meetCriteria(List<Human> humans) {
		return humans.stream().filter(human -> human.getGender().equalsIgnoreCase("trans")).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
