package com.nationwide.chapter12.lark;

public class CashRegisterTester {

	public static void main(String[] args) {

		CashRegister reg = new CashRegister();
		Money dollar = new Money(1.0, "Dollar");
		Money quarter = new Money(.25, "Quarter");
		Money dime = new Money(.1, "Dime");
		Money nickel = new Money(.05, "Nickel");
		Money penny = new Money(.01, "Penny");

		reg.addItem(4.95);
		reg.addItem(3.50);
		reg.addItem(12.43);
		reg.addItem(.50);

		System.out.printf("Total Price: %.2f\n", reg.getTotal());

		reg.enterPayment(25, dollar);
		reg.enterPayment(1, quarter);
		reg.enterPayment(1, dime);
		reg.enterPayment(3, penny);

		System.out.printf("Total Payment: %.2f\n", reg.getPayment());

		System.out.printf("Change: %.2f\n", reg.giveChange());

	}

}
