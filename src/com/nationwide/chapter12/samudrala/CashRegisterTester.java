package com.nationwide.chapter12.samudrala;

/**
 * This program tests the CashRegister class.
 */
public class CashRegisterTester {
	public static void main(String[] args) {
		CashRegister register1 = new CashRegister();
		register1.addItem(1.95);
		register1.addItem(0.95);
		register1.addItem(2.50);

		Currency dollar = new Currency(1.0, "Dollar", "bill");
		Currency quarter = new Currency(0.25, "Quarter", "coin");

		register1.enterPayment(6, dollar);
		register1.enterPayment(3, quarter);

		System.out.printf("Change: %.2f\n", register1.giveChange());
	}
}
