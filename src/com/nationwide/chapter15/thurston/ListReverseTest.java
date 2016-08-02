package com.nationwide.chapter15.thurston;

import java.util.LinkedList;

public class ListReverseTest {

	/*
	 * public static void listReverser(LinkedList<String> strings){ int
	 * parameter = strings.size(); int counter = 0; LinkedList<String> templist
	 * = new LinkedList<String>(); while (counter < parameter ){
	 * templist.addFirst(strings.remove()); counter++; }
	 * strings.addAll(templist); }
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> test = new LinkedList<String>();
		String element = "first";
		test.add(element);

		element = "second";
		test.add(element);

		element = "third";
		test.add(element);
		System.out.println(test);

		LinkedListReverser.listReverser(test);

		System.out.println(test);

	}

}
