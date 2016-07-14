package com.nationwide.chapter12.sharp;

public class CashRegisterTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CashRegister register = new CashRegister();
		register.addItem(29.50);
		register.addItem(9.25);
		register.enterPayment(50);
		double change = register.giveChange();
		System.out.println(change);
		System.out.println("Expected: 11.25");
	}
}
