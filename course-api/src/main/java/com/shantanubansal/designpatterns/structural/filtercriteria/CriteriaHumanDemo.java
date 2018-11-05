package com.shantanubansal.designpatterns.structural.filtercriteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriteriaHumanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Human> humans = new ArrayList<Human>();
		humans.add(new Human("A", "male", "single"));
		humans.add(new Human("B", "female", "single"));
		humans.add(new Human("C", "male", "married"));
		humans.add(new Human("D", "female", "married"));
		humans.add(new Human("E", "trans", "single"));
		humans.add(new Human("F", "trans", "married"));

		
		Criteria male = new MaleHuman();
		Criteria female = new FemaleHuman();
		Criteria trans = new TransGenderHuman();
		Criteria single = new SingleHuman();
		Criteria married = new marriedHuman();

		Criteria singleMale = new AndCriteria(Arrays.asList(new Criteria[] {male, single}));
		Criteria singleFemale = new AndCriteria(Arrays.asList(new Criteria[] {female, single}));
		Criteria singletrans= new AndCriteria(Arrays.asList(new Criteria[] {trans, single}));
		

		Criteria marriedMale = new AndCriteria(Arrays.asList(new Criteria[] {male, married}));
		Criteria marriedFemale = new AndCriteria(Arrays.asList(new Criteria[] {female, married}));
		Criteria marriedtrans= new AndCriteria(Arrays.asList(new Criteria[] {trans, married}));
		
		printHumans(male.getClass().getName(), male.meetCriteria(humans));
		printHumans(female.getClass().getName(),female.meetCriteria(humans));
		printHumans(trans.getClass().getName(),trans.meetCriteria(humans));
		printHumans(married.getClass().getName(),married.meetCriteria(humans));
		printHumans(singleMale.getClass().getName(),singleMale.meetCriteria(humans));
		printHumans(singleFemale.getClass().getName(),singleFemale.meetCriteria(humans));
		printHumans(singletrans.getClass().getName(),singletrans.meetCriteria(humans));
		printHumans(marriedMale.getClass().getName(),marriedMale.meetCriteria(humans));
		printHumans(marriedFemale.getClass().getName(),marriedFemale.meetCriteria(humans));
		printHumans(marriedtrans.getClass().getName(),marriedtrans.meetCriteria(humans));
	}

	public static void printHumans(String criteria, List<Human> humans) {
		System.out.println("Criteria: " + criteria);
		humans.stream().forEach(human -> System.out.println(human));
		
	}
	
}
