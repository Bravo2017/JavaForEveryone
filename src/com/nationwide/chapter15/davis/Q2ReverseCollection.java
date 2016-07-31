package com.nationwide;

import java.util.LinkedList;
import java.util.ListIterator;

//P15.2 Write a method
//public static void reverse(LinkedList<String> strings1)
//that reverses the entries in a linked list. 

public class Q2ReverseCollection {

	public static void main(String[] args) {

		reverse(new LinkedList<String>());
	}

	public static void reverse(LinkedList<String> strings) {

		strings = new LinkedList<String>();

		strings.add("ACE   of HEARTS");
		strings.add("KING  of HEARTS");
		strings.add("QUEEN of HEARTS");
		strings.add("JACK  of HEARTS");
		strings.add("TEN   of HEARTS");
		strings.add("NINE  of HEARTS");
		strings.add("EIGHT of HEARTS");
		strings.add("SEVEN of HEARTS");
		strings.add("SIX   of HEARTS");
		strings.add("FIVE  of HEARTS");
		strings.add("FOUR  of HEARTS");
		strings.add("THREE of HEARTS");
		strings.add("TWO   of HEARTS");

		for (String hearts : strings) {
			System.out.println(hearts);
		}
		System.out.println("And in reverse is...");

		LinkedList<String> sgnirts = new LinkedList<String>();

		for (String straeh : strings) {
			ListIterator<String> iterator = strings.listIterator();
			// String s = iterator.next();
			sgnirts.addFirst(straeh);
		}
		for (String straeh : sgnirts) {
			System.out.println(straeh);
		}
	}
}
