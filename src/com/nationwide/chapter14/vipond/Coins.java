package com.nationwide.chapter14.vipond;

/**
 * A coin with a monetary value.
 */
public class Coins {
	private double value;
	private String name;

	public Coins(double aValue, String aName) {
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
		return "Coins[value=" + value + ",name=" + name + "]";
	}
}