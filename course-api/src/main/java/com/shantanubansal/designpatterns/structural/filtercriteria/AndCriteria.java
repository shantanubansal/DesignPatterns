package com.shantanubansal.designpatterns.structural.filtercriteria;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {

	private List<Criteria> criterias;
	
	public AndCriteria(List<Criteria> criterias) {
		this.criterias = criterias;
	}
	
	@Override
	public List<Human> meetCriteria(List<Human> humans) {
		for(Criteria criteria : criterias) {
			if(humans == null)
				return new ArrayList<>();
			humans = criteria.meetCriteria(humans);
		}
		return humans;
	}

}
