package com.nationwide.chapter12.lark;

public class Money {
	private double value;
	private String name;

	public Money(double theValue, String theName) {
		value = theValue;
		name = theName;
	}

	public double getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

}
