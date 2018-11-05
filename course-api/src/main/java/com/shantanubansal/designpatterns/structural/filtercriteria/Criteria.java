package com.shantanubansal.designpatterns.structural.filtercriteria;

import java.util.List;

public interface Criteria {
	public List<Human> meetCriteria(List<Human> persons);
}
