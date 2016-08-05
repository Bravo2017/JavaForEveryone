package com.nationwide.chapter15.sharp;

import java.util.*;

public class LinkedList {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        // create a LinkedList
        java.util.LinkedList stuff = new java.util.LinkedList();

        // add some elements
        stuff.add("Hello");
        stuff.add("2");
        stuff.add("Chocolate");
        stuff.add("10");

        ListIterator<String> iterator = stuff.listIterator();
        iterator.next();
        iterator.next();

        iterator.add("Goodbye");
        iterator.add("7");
        iterator.add("Cookies");

        iterator.next();
        iterator.remove();

        // print the list
        System.out.println("LinkedList:" + stuff);

    }

}
