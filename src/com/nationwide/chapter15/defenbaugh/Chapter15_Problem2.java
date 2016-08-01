package com.nationwide.chapter15.defenbaugh;

import java.util.LinkedList;
import java.util.Stack;

public class Chapter15_Problem2 {

	/**
	 * author: Valerie Defenbaugh Write a method that reverses the entries in a
	 * linked list. Thanks Nick for showing me how to use Stack in this program!
	 */
	public static void main(String[] args) {

		// Create a LinkedList of grocery items
		LinkedList<String> groceryList = new LinkedList<String>();

		groceryList.addLast("lettuce");
		groceryList.addLast("bananas");
		groceryList.addLast("grapes");
		groceryList.addLast("milk");
		groceryList.addLast("chicken");

		System.out.println("The original groceryList is "
				+ groceryList.toString());

		// Call the reverse method to reverse the list
		Reverse(groceryList);
		System.out.println(groceryList);
	}

	public static void Reverse(LinkedList<String> list) {

		LinkedList<String> outputList = new LinkedList<String>();
		Stack<String> groceryStack = new Stack<String>();

		// Add each string in the list to the stack
		for (String string : list) {
			groceryStack.push(string);
		}

		System.out.println("The groceryStack is " + groceryStack.toString());

		list.clear();

		// pop the last item added to the groceryStack and add it to the list
		while (groceryStack.size() > 0) {
			list.add(groceryStack.pop());
			System.out.println("list = " + list.toString());
		}

		list = outputList;
	}
}
