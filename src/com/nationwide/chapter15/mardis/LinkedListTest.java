package com.nationwide.chapter15.mardis;

import java.util.LinkedList;

public class LinkedListTest {

	/**
	 * Write a method public static void reverse(LinkedList<String> strings)
	 * that reverses the entries in a linked list.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> names = new LinkedList<String>();
		names.addLast("Brad");
		names.addLast("Cory");
		names.addLast("Ron");
		names.addLast("Nick");

		System.out.println(names);

		reverse(names);

	}

	public static void reverse(LinkedList<String> strings) {
		int sizeList = strings.size();

		for (int x = 0; x < sizeList; x++) {
			String removed = strings.removeLast();
			strings.add(x, removed);
		}

		System.out.println(strings);

	}

}
