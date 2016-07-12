package com.nationwide.chapter12.watson;

/**
 * P12.2
 * 
 * Real cash registers can handle both bills and coins. Design a single class
 * that expresses the commonality of these concepts. Redesign the CashRegister
 * class and provide a method for entering payments that are described by your
 * class. Your primary challenge is to come up with a good name for this class.
 */

public class CashRegister2 {

	/**
	 * A cash register totals up sales and computes change due.
	 */

	private double purchase;
	private double payment;

	/**
	 * Constructs a cash register with no money in it.
	 */
	public CashRegister2() {
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

	public double amountDue() {
		return purchase;
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
	public void enterPayment(int coinCount, Cha_Ching coinType) {
		payment = payment + coinCount * coinType.getValue();
	}

	public double amountPaid() {
		return payment;
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
