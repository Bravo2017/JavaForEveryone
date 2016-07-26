package com.nationwide.chapter14.sharp;

public class Coin {

	private double value;
	private String name;

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

	public String toString() {
		return "Coin[value=" + value + ",name=" + name + "]";
	}
}
