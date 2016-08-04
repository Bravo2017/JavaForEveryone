package com.nationwide.chapter15.williams;

import java.util.LinkedList;

public class P15_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> listOfNames = new LinkedList<String>();
		listOfNames.addLast("Matt");
		listOfNames.addLast("Shelly");
		listOfNames.addLast("Zerek");
		listOfNames.addLast("Kaelyn");
		listOfNames.addLast("Quintin");
		System.out.println(listOfNames);
		reverse(listOfNames);
	}

	public static void reverse(LinkedList<String> strings) {
		int x;
		int size = strings.size();
		LinkedList<String> reversedList = new LinkedList<String>();
		for (x = 0; x < size; x++) {
			String removedItem = strings.removeFirst();
			reversedList.addFirst(removedItem);
		}
		System.out.println(reversedList);
	}

}
