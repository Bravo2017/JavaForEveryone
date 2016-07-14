package com.nationwide.chapter12.defenbaugh;

public class CashRegister
/**
 * A cash register totals up sales and computes change due.
 */

{
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
	public void addItem(double amount) {
		double newTotal = purchase + amount;
		purchase = newTotal;
	}

	/**
	 * Enters the payment received from the customer; should be called once for
	 * each coin type.
	 * 
	 * @param coinCount
	 *            the number of coins
	 * @param coinType
	 *            the type of the coins in the payment
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
