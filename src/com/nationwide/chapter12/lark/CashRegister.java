package com.nationwide.chapter12.lark;

public class CashRegister {
	private double purchase;
	private double payment;

	public CashRegister() {
		purchase = 0;
		payment = 0;
	}

	public void addItem(double amount) {
		double newTotal = purchase + amount;
		purchase = newTotal;
	}

	public void enterPayment(int moneyCount, Money moneyType) {
		payment = payment + moneyCount * moneyType.getValue();
	}

	public double giveChange() {
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}

	public double getTotal() {
		return purchase;
	}

	public double getPayment() {
		return payment;
	}
}
