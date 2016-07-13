package com.nationwide.chapter12.nelson;

/**
 * A cash register adds purchases, subtracts payments, and calculates the change
 * due.
 */
public class CashRegister {
	private double purchase;
	private double payment;

	/**
	 * Constructs a cash register with no money in it.
	 */
	public CashRegister() {
		purchase = 0;
		payment = 0;
	}

	/**
	 * Records the sale of an item.
	 * 
	 * @param amount
	 *            the price of the item
	 */
	public void enterPurchase(double amount) {
		purchase = purchase + amount;
	}

	/**
	 * Enters the payment received from the customer; should be called once for
	 * each currency type.
	 * 
	 * @param currencyCount
	 *            the number of currency
	 * @param currencyType
	 *            the type of currency
	 */
	public void enterPayment(int currencyCount, Currency currencyType) {
		payment = payment + currencyCount * currencyType.getValue();
	}

	/**
	 * Computes the change due and resets register for the next customer.
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
