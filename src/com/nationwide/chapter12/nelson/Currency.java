package com.nationwide.chapter12.nelson;

public class Currency {

	/*
	 * P12.2 Design single class to handle bills and coins
	 */

	private double value;
	private String name;

	/*
	 * Constructor for currency
	 * 
	 * @param value is the monetary value of the currency
	 * 
	 * @param name is the name of the currency
	 */
	public Currency(double currencyValue, String currencyName) {
		value = currencyValue;
		name = currencyName;
	}

	public double getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
}
