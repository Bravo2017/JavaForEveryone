package com.nationwide.chapter15.tekippe;

import java.util.PriorityQueue;
import java.util.Scanner;

import com.nationwide.chapter15.defenbaugh.ToDoItem;

public class ToDoList {

	/**
	 * create a to do list
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rank;
		String desc;
		String x;

		PriorityQueue<ToDoItem> toDo = new PriorityQueue<ToDoItem>();
		Scanner in = new Scanner(System.in);
		System.out
				.println("Enter 'add' to add a task  Enter 'next' to find retreive the next task");
		x = in.nextLine();
		while (x.equals("add")) {
			System.out.println("enter priority then a description");
			rank = in.nextInt();
			// System.out.println("enter description");
			desc = in.nextLine();
			toDo.add(new ToDoItem(rank, desc));
			System.out
					.println("Enter 'add' to add a task  Enter 'next' to find retreive the next task");
			x = in.nextLine();
		}
		if (x.equals("next")) {
			ToDoItem first = toDo.remove();
			System.out.println(first);
		}

	}

}
