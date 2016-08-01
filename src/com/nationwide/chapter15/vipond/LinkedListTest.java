package com.nationwide.chapter15.vipond;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class.
 */

public class LinkedListTest {

	public static LinkedList<String> listinfo = new LinkedList<String>();

	public static void main(String[] args) {

		listinfo.addLast("first");
		listinfo.addLast("second");
		listinfo.addLast("third");
		listinfo.addLast("fourth");
		listinfo.addLast("fifth");
		listinfo.addLast("sixth");

		System.out.println("Before: " + listinfo);

		reverse(listinfo);

		System.out.println("After: " + listinfo);
	}

	public static void reverse(LinkedList<String> strings) {

		LinkedList<String> templist = new LinkedList<String>();
		ListIterator<String> tempiterator = strings.listIterator();

		String tempword;
		boolean cont = true;

		do {
			tempword = tempiterator.next();
			templist.addFirst(tempword);
			cont = tempiterator.hasNext();
		} while (cont == true);

		listinfo = templist;

	}
}
