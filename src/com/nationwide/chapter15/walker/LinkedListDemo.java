package com.nationwide.chapter15.walker;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		String[] addItems = {"5", "4", "3", "2", "1"};
		for (String s : addItems){
			list.add(s);
		}
		
		for (int i = 0; i < list.size(); i++){
			System.out.print(list.get(i));
		}
		System.out.println("");

		LinkedListUtil.reverse(list);
		
		for (int i = 0; i < list.size(); i++){
			System.out.print(list.get(i));
		}


	}

}
