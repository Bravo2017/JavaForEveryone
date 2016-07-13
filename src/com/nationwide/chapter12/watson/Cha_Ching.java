package com.nationwide.chapter12.watson;

/**
 * P12.2
 * 
 * Real cash registers can handle both bills and coins. Design a single class
 * that expresses the commonality of these concepts. Redesign the CashRegister
 * class and provide a method for entering payments that are described by your
 * class. Your primary challenge is to come up with a good name for this class.
 */

public class Cha_Ching {

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
	public Cha_Ching(double aValue, String aName) {
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
