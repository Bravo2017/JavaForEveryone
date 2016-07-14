package com.nationwide.chapter12.vipond;

/**
 * A cash register totals up sales and computes change due.
 */
public class CashRegister {
	private double purchase;
	private double payment;
	/** The value of a dollar (100 cents) */
	public static final int DOLLAR = 100;
	/** The value of a quarter (25 cents) */
	public static final int QUARTER = 25;
	/** The value of a dime (10 cents) */
	public static final int DIME = 10;
	/** The value of a nickel (5 cents) */
	public static final int NICKEL = 5;
	/** The value of a penny (1 cent) */
	public static final int PENNY = 1;

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
	 * each UnitOfMoney type.
	 * 
	 * @param UnitOfMoneyCount
	 *            the number of UnitOfMoneys
	 * @param UnitOfMoneyType
	 *            the type of the UnitOfMoneys in the payment
	 */
	public void enterPayment(int UnitOfMoneyCount, UnitOfMoney UnitOfMoneyType) {
		payment = payment + UnitOfMoneyCount * UnitOfMoneyType.getValue();
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
