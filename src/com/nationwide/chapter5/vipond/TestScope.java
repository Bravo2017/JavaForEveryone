package com.nationwide.chapter5.vipond;

public class TestScope {

	public static void main(String[] args) {
		double total = pricewithtax(5.09) + pricewithtax(8.56)
				+ pricewithtax(3.12);
		System.out.println(total);
		double total2 = 5.09 + 8.56 + 3.12;
		double total3 = pricewithtax(total2);
		System.out.println(total3);
	}

	public static double pricewithtax(double price) {
		double tax = price * 1.07;
		double total = (double) Math.round(tax * 100d) / 100d;
		return total;
	}

}
