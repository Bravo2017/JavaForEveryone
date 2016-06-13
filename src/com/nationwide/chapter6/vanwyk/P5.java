package com.nationwide.chapter6.vanwyk;

import java.util.ArrayList;

/*
 * Write a method public static void removeMin that removes the minimum value from a partially filled array without calling other methods.
 */
public class P5 {

	public static void main(String[] args) {
		removeMin();

	}

	public static void removeMin() {

		ArrayList<Integer> accounts = new ArrayList<Integer>();

		accounts.add(new Integer(1));
		accounts.add(new Integer(2));
		accounts.add(new Integer(3));
		accounts.add(new Integer(4));
		accounts.add(new Integer(5));
		accounts.add(new Integer(6));

		System.out.println("Before removal");
		System.out.println(accounts);

		accounts.remove(0); // not sure if this is what the task was, assuming
							// there is a process to get lowest total and remove
							// it automatically.

		System.out.println("After removal");
		System.out.println(accounts);

	}
}
