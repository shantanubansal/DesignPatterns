package com.shantanubansal.designpatterns.structural.filtercriteria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrCriteria implements Criteria {

	private List<Criteria> criterias;
	
	public OrCriteria(List<Criteria> criterias) {
		this.criterias = criterias;
	}
	
	@Override
	public List<Human> meetCriteria(List<Human> humans) {
		Set<Human> results = new HashSet<>();
		for(Criteria criteria : criterias) {
			if(humans == null)
				return new ArrayList<>();
			results.addAll(criteria.meetCriteria(humans));
		}
		return (List<Human>) results;
	}

}
