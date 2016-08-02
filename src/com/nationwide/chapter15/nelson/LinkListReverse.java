package com.nationwide.chapter15.nelson;

/**
 * 15.2 Write a reverse method that reverses the entries in a linked list 
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class LinkListReverse {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>(Arrays.asList(
				"Apple", "Banana", "Grape", "Orange"));
		System.out.println("Original list: " + myList);

		reverse(myList);
		System.out.println("Reversed list: " + myList);
	}

	public static void reverse(LinkedList<String> list) {
		LinkedList<String> reversedList = new LinkedList<String>();
		Stack<String> s = new Stack<String>();

		for (String string : list) {
			s.push(string);
		}

		list.clear();
		while (s.size() > 0) {
			list.add(s.pop());
		}

		list = reversedList;
	}
}
