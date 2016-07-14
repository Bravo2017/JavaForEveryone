package com.nationwide.chapter12.vipond;

public class UnitOfMoney {
	/**
	 * A monetary payment unit with a monetary value.
	 */
	public UnitOfMoney(double aValue, String aName) {
		value = aValue;
		name = aName;
	}

	/**
	 * Gets the value.
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Gets the name.
	 */
	public String getName() {
		return name;
	}

	private double value;
	private String name;
}
