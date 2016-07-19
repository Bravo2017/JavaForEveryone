package com.nationwide.chapter12.tekippe;

public class Money {
	/**
	 * A coin with a monetary value.
	 */
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
	public Money(double aValue, String aName) {
		value = aValue;
		name = aName;
	}

	/**
	 * Gets the coin value.
	 * 
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Gets the coin name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
