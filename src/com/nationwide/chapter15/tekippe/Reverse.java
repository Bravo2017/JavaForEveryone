package com.nationwide.chapter15.tekippe;

import java.util.LinkedList;
import java.util.ListIterator;

public class Reverse {

	/**
	 * create a linked list and method to reverse it.
	 */

	public static LinkedList<String> list = new LinkedList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list.addFirst("one");
		list.add("two");
		list.add("three");
		list.add("four");

		System.out.println(list);
		reverseList(list);
		System.out.println(list);

	}

	public static void reverseList(LinkedList<String> strings) {

		LinkedList<String> reverseList = new LinkedList<String>();

		ListIterator<String> iterator = strings.listIterator();

		while (iterator.hasNext()) {
			String s = iterator.next();
			reverseList.addFirst(s);
		}
		list = reverseList;
		System.out.println(strings);

	}
}