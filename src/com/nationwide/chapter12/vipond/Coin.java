package com.nationwide.chapter12.vipond;

public class Coin {
	private double value;
	private String name;

	/**
	 * Constructs a coin.
	 */
	public Coin(double aValue, String aName) {
		value = aValue;
		name = aName;
	}

	/**
	 * Gets the coin value.
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Gets the coin name.
	 */
	public String getName() {
		return name;
	}
}
