package com.nationwide.chapter15.kuhl;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Problem15Two {

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

	public static void main(String[] args) {
		LinkedList<String> fullList = new LinkedList<String>(Arrays.asList("1",
				"2", "3", "4", "5"));

		System.out.println(fullList);
		reverse(fullList);
		System.out.println(fullList);

	}
}
