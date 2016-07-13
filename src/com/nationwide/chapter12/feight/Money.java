package com.nationwide.chapter12.feight;

/**
 * Real cash registers can handle both bills and coins. Design a single class
 * that expresses the commonality of these concepts. Redesign the CashRegister
 * class and provide a method for entering payments that are described by your
 * class. Your primary challenge is to come up with a good name for this class.
 * 
 * @author Suzanne Feight
 */

public class Money {
	private static final Money PENNY = new Money(.01, "Penny");
	private static final Money NICKEL = new Money(.05, "Nickel");
	private static final Money DIME = new Money(.10, "Dime");
	private static final Money QUARTER = new Money(.25, "Quarter");
	private static final Money HALF_DOLLAR = new Money(.50, "Half Dollar");
	private static final Money ONE_DOLLAR_BILL = new Money(1.00,
			"One Dollar Bill");
	private static final Money FIVE_DOLLAR_BILL = new Money(5.00,
			"Five Dollar Bill");
	private static final Money TEN_DOLLAR_BILL = new Money(10.00,
			"Ten Dollar Bill");
	private static final Money TWENTY_DOLLAR_BILL = new Money(20.00,
			"Twenty Dollar Bill");
	private static final Money FIFTY_DOLLAR_BILL = new Money(50.00,
			"Fifty Dollar Bill");
	private static final Money ONE_HUNDRED_DOLLAR_BILL = new Money(100.00,
			"One Hundred Dollar Bill");

	private final double value;
	private final String name;

	public Money() {
		value = 0;
		name = null;
	}

	private Money(double aValue, String aName) {
		value = aValue;
		name = aName;
	}

	public double getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public Money getPenny() {
		return PENNY;
	}

	public Money getNickel() {
		return NICKEL;
	}

	public Money getDime() {
		return DIME;
	}

	public Money getQuarter() {
		return QUARTER;
	}

	public Money getHalfDollar() {
		return HALF_DOLLAR;
	}

	public Money getOneDollarBill() {
		return ONE_DOLLAR_BILL;
	}

	public Money getFiveDollarBill() {
		return FIVE_DOLLAR_BILL;
	}

	public Money getTenDollarBill() {
		return TEN_DOLLAR_BILL;
	}

	public Money getTwentyDollarBill() {
		return TWENTY_DOLLAR_BILL;
	}

	public Money getFiftyDollarBill() {
		return FIFTY_DOLLAR_BILL;
	}

	public Money getOneHundredDollarBill() {
		return ONE_HUNDRED_DOLLAR_BILL;
	}

}
