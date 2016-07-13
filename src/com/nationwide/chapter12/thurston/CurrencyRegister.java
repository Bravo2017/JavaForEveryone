package com.nationwide.chapter12.thurston;

public class CurrencyRegister {
	private double purchase;
	private double payment;

	/**
	 * Constructs a currency register with no money in it.
	 */
	public CurrencyRegister() {
		purchase = 0;
		payment = 0;
	}

	/**
	 * Records the sale of an item.
	 * 
	 * @param amount
	 *            the price of the item
	 */
	public void addItem(double amount) {
		double newTotal = purchase + amount;
		purchase = newTotal;
	}

	/**
	 * Enters the payment received from the customer; should be called once for
	 * each currency type.
	 * 
	 * @param currencyCount
	 *            the number of coins or bills
	 * @param currencyType
	 *            the type of the coins or bills in the payment
	 */
	public void enterPayment(int currencyCount, Currency currencyType) {
		payment = payment + currencyCount * currencyType.getValue();

	}

	/**
	 * Computes the change due and resets the machine for the next customer.
	 * 
	 * @return the change due to the customer
	 */
	public double giveChange() {
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
}
