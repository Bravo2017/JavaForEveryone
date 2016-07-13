package com.nationwide.chapter12.thurston;

public class Currency {
	private double value;
	private String name;

	/**
	 * Constructs a coin.
	 * 
	 * @param aValue
	 *            the monetary value of the coin.
	 * @param aName
	 *            the name of the coin
	 */
	public Currency(double aValue, String aName) {
		value = aValue;
		name = aName;
	}

	/**
	 * Gets the currency value.
	 * 
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Gets the coin or bill name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
