package com.nationwide.chapter12.vipond;

/**
 * This program tests the CashRegister class.
 */
public class CashRegisterTester {
	public static void main(String[] args) {
		CashRegister register1 = new CashRegister();
		register1.addItem(5.12);
		register1.addItem(4.95);
		register1.addItem(2.56);

		UnitOfMoney fivedollar = new UnitOfMoney(5.0, "FiveDollar");
		UnitOfMoney dollar = new UnitOfMoney(1.0, "Dollar");
		UnitOfMoney quarter = new UnitOfMoney(0.25, "Quarter");
		UnitOfMoney dime = new UnitOfMoney(0.10, "Dime");

		register1.enterPayment(2, fivedollar);
		register1.enterPayment(4, dollar);
		register1.enterPayment(3, quarter);
		register1.enterPayment(2, dime);

		System.out.printf("Change: %.2f\n", register1.giveChange());

		register1.enterPayment(2, fivedollar);
		register1.enterPayment(4, dollar);
		register1.enterPayment(3, quarter);
		register1.enterPayment(2, dime);

		System.out.printf("Change: %.2f\n", register1.giveChange());
	}
}
