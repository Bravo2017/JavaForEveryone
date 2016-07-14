package com.nationwide.chapter12.samudrala;

/**
 * A Currency class that represents both bills and coins.
 */
public class Currency {
	private double value;
	private String name;
	private String coinOrBill;

	/**
	 * Constructs a currency.
	 * 
	 * @param aValue
	 *            the monetary value of the coin.
	 * @param aName
	 *            the name of the coin
	 * @param aCoinOrBill
	 *            the name of the coin
	 */
	public Currency(double aValue, String aName, String aCoinOrBill) {
		value = aValue;
		name = aName;
		coinOrBill = aCoinOrBill;
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

	/**
	 * Gets the currency type - bill or coin.
	 * 
	 * @return the type
	 */
	public String getCoinOrBill() {
		return coinOrBill;
	}
}
