package com.nationwide.chapter15.nelson;

/**
 * 15.6 Implement a To Do List
 * Enter 'add' with priority (1 - 9) and description to add a task
 * Enter 'next' to remove and print most urgent task
 * Enter 'quit' to quit the program
 */

import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoList {

	PriorityQueue<Task> tasks = new PriorityQueue<Task>();

	public static void main(String[] args) {
		ToDoList list = new ToDoList();

		Scanner in = new Scanner(System.in);
		System.out
				.println("Enter 'add' with priority 1 - 9 and a description or "
						+ "'next' to remove/print most urgent task', or 'quit': ");
		while (in.hasNext()) {
			String command = in.next();
			if (command.equals("add")) {
				int priority = in.nextInt();
				String description = in.nextLine().trim();
				if (priority > 0 && priority < 10) {
					list.add(priority, description);
				} else {
					System.out
							.println("add task with priority 1 - 9, try again");
				}
			} else if (command.equals("next")) {
				list.next();
			} else if (command.equals("quit"))
				System.exit(0);
			else {
				System.out.println("Entry not recognized, try again");
			}
		}
		in.close();
	}

	public ToDoList() {
		this.tasks = new PriorityQueue<Task>();
	}

	public void add(int priority, String description) {
		this.tasks.offer(new Task(priority, description));
	}

	public void next() {
		System.out.println(this.tasks.poll());
	}

}
