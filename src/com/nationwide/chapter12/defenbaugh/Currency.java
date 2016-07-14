package com.nationwide.chapter12.defenbaugh;

/**
 * @author - Valerie Defenbaugh Chapter 12 P12.2 Currency with a monetary value.
 *         Real cash registers can handle both bills and coins. Design a single
 *         class that expresses the commonality of these concepts. Redesign the
 *         CashRegister class and provide a method for entering payments that
 *         are described by your class. Your primary challenge is to come up
 *         with a good name for this class.
 */

public class Currency {
	private double value;
	private String name;

	/**
	 * Constructs an amount.
	 * 
	 * @param aValue
	 *            the monetary value of the currency.
	 * @param aName
	 *            the name of the currency
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
	 * Gets the currency name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
