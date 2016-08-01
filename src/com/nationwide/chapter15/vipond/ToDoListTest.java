package com.nationwide.chapter15.vipond;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoListTest {
	/**
	 * This program demonstrates a priority queue of work orders. The most
	 * important work orders are removed first.
	 */
	public static void main(String[] args) {

		PriorityQueue<ToDoList> q = new PriorityQueue<ToDoList>();
		Scanner in = new Scanner(System.in);

		boolean continuelist = true;

		while (continuelist == true) {
			System.out
					.print("Please enter A(dd) to add a task, N(ext) to complete the highest priority task or Q(uit) to quit");
			char action;
			action = Character.toUpperCase(in.next().charAt(0));
			do {
				if (action != 'A' && action != 'N' && action != 'Q') {
					System.out.print("Enter A(dd), N(ext), Q(uit)");
					action = Character.toUpperCase(in.next().charAt(0));

				}
			} while (action != 'A' && action != 'N' && action != 'Q');

			if (action == 'A') {
				System.out.print("What is the task name?");
				in.nextLine();
				String taskname = in.nextLine();
				System.out.print("What is the task priority (1-9)?");
				int taskpriority = in.nextInt();
				q.add(new ToDoList(taskpriority, taskname));
			}
			if (action == 'N') {
				if (q.isEmpty()) {
					System.out.println("There are no tasks to remove");
				} else {
					System.out.println(q.remove() + " was removed");
				}

			}
			if (action == 'Q') {
				System.out.println("The following tasks remain:");
				while (q.size() > 0) {
					System.out.println(q.remove());
				}
				continuelist = false;
			}
		}
	}
}
