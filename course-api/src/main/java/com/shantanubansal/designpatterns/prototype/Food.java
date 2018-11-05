package com.shantanubansal.designpatterns.prototype;

public abstract class Food implements Cloneable {

	private String id;
	protected String type;

	abstract void eat();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
