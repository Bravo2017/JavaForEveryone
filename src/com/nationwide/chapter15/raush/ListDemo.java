package com.nationwide.jfe.chapter15;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

/**
 * This program demonstrates the LinkedList class.
 */
public class ListDemo {
	public static void main(String[] args) {
		LinkedList<String> staff = new LinkedList<String>();
		staff.addLast("Diana");
		staff.addLast("Harry");
		staff.addLast("Romeo");
		staff.addLast("Tom");

		System.out.println("Print full list");
		System.out.println(staff);

		reverse(staff); 
		System.out.println("Print reversed list");
		System.out.println(staff);
		
		/*
		// | in the comments indicates the iterator position
		
		ListIterator<String> iterator = staff.listIterator(); // |DHRT

		iterator.next(); // D|HRT
		iterator.add("Juliet"); // DHJ|RT
		System.out.println(iterator.next()); // DH|RT

		// Add more elements after second element

		iterator.add("Nina"); // DHJN|RT

		iterator.next(); // DHJN|R|T

		// Remove last traversed element

		iterator.remove(); // DHJN|T

		// Print all elements

		System.out.println(staff);
		System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
	*/
	}

	public static void reverse(LinkedList<String> list) {
		LinkedList<String> outputList = new LinkedList<String>();
		Stack<String> stack = new Stack<String>();
		for (String string : list) {
			stack.push(string);
		}
		list.clear();
		while (stack.size() > 0) {
			list.add(stack.pop());
		}
		list = outputList;
	}

}
