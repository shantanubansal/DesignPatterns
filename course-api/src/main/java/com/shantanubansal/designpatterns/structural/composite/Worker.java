package com.shantanubansal.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Worker {

	private String name;
	private String category;
	private int salary;
	private List<Worker> juniors;

	
	
	public Worker(String name, String category, int salary) {
		super();
		this.name = name;
		this.category = category;
		this.salary = salary;
		this.juniors = new ArrayList<>();
	}
	
	public void addJunior(Worker w) {
		juniors.add(w);
	}

	public void removeJunior(Worker w) {
		juniors.remove(w);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Worker> getJuniors() {
		return juniors;
	}

	public void setJuniors(List<Worker> juniors) {
		this.juniors = juniors;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", category=" + category + ", salary=" + salary + "]";
	}

	
	
}
