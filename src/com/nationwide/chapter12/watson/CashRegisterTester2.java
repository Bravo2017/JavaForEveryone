package com.nationwide.chapter12.watson;

public class CashRegisterTester2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CashRegister2 register1 = new CashRegister2();
		register1.addItem(6.75);
		register1.addItem(20.);
		register1.addItem(12.50);
		register1.addItem(22.58);
		register1.addItem(2.97);
		register1.addItem(53.17);
		register1.addItem(18.18);

		Cha_Ching bigAndrew = new Cha_Ching(20.0, "Twenty");
		Cha_Ching bigAlexander = new Cha_Ching(10.0, "Ten");
		Cha_Ching bigAbe = new Cha_Ching(5.0, "Five");
		Cha_Ching bigGeorge = new Cha_Ching(1.0, "Dollar");
		Cha_Ching littleGeorge = new Cha_Ching(0.25, "Quarter");
		Cha_Ching littleFranklin = new Cha_Ching(0.10, "Dime");
		Cha_Ching littleThomas = new Cha_Ching(0.05, "Nickle");
		Cha_Ching littleAbe = new Cha_Ching(0.01, "Penny");

		register1.enterPayment(8, bigAlexander);
		register1.enterPayment(1, bigGeorge);
		register1.enterPayment(2, bigAbe);
		register1.enterPayment(3, bigAndrew);
		register1.enterPayment(4, littleGeorge);
		register1.enterPayment(5, littleFranklin);
		register1.enterPayment(6, littleThomas);
		register1.enterPayment(7, littleAbe);

		System.out.println("Total due: " + register1.amountDue());
		System.out.println("Total paid: " + register1.amountPaid());
		System.out.printf("Change: %.2f\n", register1.giveChange());
	}
}
