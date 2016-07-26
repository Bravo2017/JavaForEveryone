package com.nationwide.chapter14.kuhl;

public class Coin {

	public Coin(double aValue, String aName) {
		value = aValue;
		name = aName;
	}

	public double getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	// Returns the name and value of the coin

	public String toString() {
		return "Coin[value = " + value + ",name =" + name + "]";
	}

	private double value;
	private String name;

}
