package com.nationwide.chapter4.davis;

public class Chpt4Q5NestedLoop {

	/**
	 * 5.Create a class using a nested loop.
	 */
	public static void main(String[] args) {

		for (int hours = 0; hours <= 12; hours++) {
			for (int minutes = 0; minutes <= 59; minutes++) {
				if (minutes == 30) {
					if (hours == 0) {
						System.out.println("The time is 00 dark " + minutes);
					} else {
						System.out.println("The time is " + hours + ":"
								+ minutes);
					}
				} else if (minutes == 0 && hours > 0) {
					System.out.println("The time is " + hours + " o'clock");
				}
			}
		}

	}
}
