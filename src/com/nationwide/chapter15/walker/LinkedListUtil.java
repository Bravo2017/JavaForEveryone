package com.nationwide.chapter15.walker;

import java.util.LinkedList;

public class LinkedListUtil {
	
	public static void reverse(LinkedList<String> list){
		LinkedList<String> reversedList = new LinkedList<String>();
		
		String temp = ".";
		int listSize = list.size();
		int count = 1;

		while (count <= listSize){
			temp = list.removeLast();
			reversedList.add(temp);
			count++;
		}

		list.addAll(reversedList);
		
	}

}
