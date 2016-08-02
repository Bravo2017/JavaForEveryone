package com.nationwide.chapter15.thurston;

import java.util.LinkedList;

public class LinkedListReverser {

	// So this will take two lists.
	// take the list you want to reverse. GetFirst() from list a for all Size()
	// and feed those elements to addFirst() to second list
	// Second list is an instance list. AddAll back to first list.

	public static void listReverser(LinkedList<String> strings) {
		int parameter = strings.size();
		int counter = 0;
		LinkedList<String> templist = new LinkedList<String>();
		while (counter < parameter) {
			templist.addFirst(strings.remove());
			counter++;
		}
		strings.addAll(templist);

	}

	public static void main(String args[]) {

	}

}
