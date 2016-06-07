package com.nationwide.chapter3.austin;

public class NestedIfWithEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IceCreamFlavor favorite = IceCreamFlavor.VANILLA;

		if (favorite == IceCreamFlavor.CHOCOLATE) {
			System.out.println("CHOCOLATE");

		} else if (favorite == IceCreamFlavor.VANILLA) {
			System.out.println("VANILLA");

		} else {
			System.out.println("STRAWBERRY");
		}

	}

	public enum IceCreamFlavor {
		VANILLA, CHOCOLATE, STRAWBERRY
	};

}
