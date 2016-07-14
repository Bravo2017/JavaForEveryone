package com.nationwide.chapter12.feight;

/**
 * This program tests the CashRegister class.
 */
public class CashRegisterTester_Revised {
	public static void main(String[] args) {
		Money money = new Money();
		CashRegister register1 = new CashRegister();
		register1.addItem(1.95);
		register1.addItem(0.95);
		register1.addItem(2.50);

		register1.enterPayment(1, money.getOneDollarBill());
		register1.enterPayment(1, money.getFiveDollarBill());
		register1.enterPayment(2, money.getQuarter());
		register1.enterPayment(1, money.getNickel());
		register1.enterPayment(1, money.getDime());
		register1.enterPayment(10, money.getPenny());

		System.out.printf("Change: %.2f\n", register1.giveChange());
	}
}