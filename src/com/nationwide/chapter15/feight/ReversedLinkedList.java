package com.nationwide.chapter15.feight;

import java.util.LinkedList;

/*
 * Write a method public static void reverse(LinkedList<String> strings)
 * that reverses the entries in a linked list.
 * 
 * @author Suzanne Feight
 * 
 */

public class ReversedLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> tvShows = new LinkedList<String>();
		tvShows.add("Braindead");
		tvShows.addFirst("American Gothic");
		tvShows.add("Mom");
		tvShows.add("The Good Wife");
		tvShows.add(2, "Madam Secretary");
		
		System.out.println("Original Order: " + tvShows.toString());
		
		reverse(tvShows);

	}
	
	public static void reverse(LinkedList<String> strings) {
		
		for(int i = 1; i < strings.size(); i++) {
			String temp = strings.get(i);
			strings.remove(i);
			strings.addFirst(temp);
		}
		
		System.out.println("Reversed Order: " + strings.toString());
	}

}
