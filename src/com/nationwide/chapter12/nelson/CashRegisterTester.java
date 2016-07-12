package com.nationwide.chapter12.nelson;

/**
 * P12.14 Place the CashRegister and Currency classes from 12.2 into package
 * com.nationwide.eChapter12. Keep CashRegisterTester in the default package.
 * Import CashRegister and Currency in order to make them accessible to the
 * default package tester.
 * 
 * This program tests the CashRegister and Currency classes
 */
public class CashRegisterTester {
	public static void main(String[] args) {
		CashRegister register1 = new CashRegister();
		register1.enterPurchase(7.89);
		register1.enterPurchase(5.77);
		register1.enterPurchase(1.99);

		Currency dollar = new Currency(1.00, "Dollar");
		Currency quarter = new Currency(0.25, "Quarter");
		Currency dime = new Currency(0.10, "Dime");
		Currency nickel = new Currency(0.05, "Nickel");
		Currency penny = new Currency(0.01, "Penny");

		register1.enterPayment(20, dollar);
		register1.enterPayment(2, quarter);
		register1.enterPayment(1, dime);
		register1.enterPayment(1, nickel);
		register1.enterPayment(0, penny);

		System.out.printf("Change: %.2f\n", register1.giveChange());
	}
}
