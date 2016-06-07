package com.nationwide.chapter3.terri;

/*
 * Create a class using nested if statements and Enumerated types
 */

public class NestedIfEnum {

	public enum SavingsLevel {
		LITTLE_SAVINGS, MODERATE_SAVINGS, HUGE_SAVINGS
	};

	public NestedIfEnum() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int age = 46;

		SavingsLevel savings = SavingsLevel.MODERATE_SAVINGS;

		if (age < 65) {
			if (savings == SavingsLevel.HUGE_SAVINGS) {
				System.out.println("Reduce spending and retire Early");
			} else
				System.out.println("Continue to work and save");

		} else if (age > 67) {
			if (savings == SavingsLevel.MODERATE_SAVINGS) {
				System.out.println("Retire now");
			} else {
				System.out.println("Work until 70");
			}
		} else {
			System.out.println("Work, save, work, save, ...");
		}
	}
}