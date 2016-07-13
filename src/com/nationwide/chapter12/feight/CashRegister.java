package com.nationwide.chapter12.feight;

/**
 * A cash register totals up sales and computes change due.
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
	public void addItem(double amount) {
		double newTotal = purchase + amount;
		purchase = newTotal;
	}

	/**
	 * Enters the payment received from the customer; should be called once for
	 * each money type.
	 * 
	 * @param moneyCount
	 *            the number of money type
	 * @param moneyType
	 *            the type of the money in the payment
	 */
	public void enterPayment(int moneyCount, Money moneyType) {
		payment = payment + moneyCount * moneyType.getValue();
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
