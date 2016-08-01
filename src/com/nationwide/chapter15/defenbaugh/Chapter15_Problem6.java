package com.nationwide.chapter15.defenbaugh;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Chapter15_Problem6 {

	/**
	 * @author - Valerie Defenbaugh Implement a to do list. Tasks have a
	 *         priority between 1 and 9, and a description. When the user enters
	 *         the command add priority description, the program adds a new
	 *         task. When the user enters next, the program removes and prints
	 *         the most urgent task. The quit command quits the program. Use a
	 *         priority queue in your solution.
	 */
	public static void main(String[] args) {

		PriorityQueue<ToDoItem> q = new PriorityQueue<ToDoItem>();
		q.add(new ToDoItem(3, "Shampoo carpets"));
		q.add(new ToDoItem(7, "Empty trash"));
		q.add(new ToDoItem(8, "Water plants"));
		q.add(new ToDoItem(9, "Remove pencil sharpener shavings"));
		q.add(new ToDoItem(6, "Replace light bulb"));
		q.add(new ToDoItem(1, "Fix broken sink"));
		q.add(new ToDoItem(9, "Clean coffee maker"));
		q.add(new ToDoItem(2, "Order cleaning supplies"));

		Scanner in = new Scanner(System.in);
		System.out.println("Valid commands are :");
		System.out.println("1 - add priority description");
		System.out.println("2 - next");
		System.out.println("3 - quit");

		boolean newCommand = true;

		while (newCommand) {
			System.out.print("Please enter a command: ");
			String command = in.next();

			ToDoItem headToDoItem;
			String taskInput = "";
			String nextWord = "";

			if (command.equals("1")) {
				System.out.print("Please enter a priority between 1 and 9: ");
				int priorityInput = in.nextInt();
				if (priorityInput > 0 && priorityInput < 10) {
					System.out
							.print("Please enter the task description (one word because I can't get more than 1 word to work): ");
					taskInput = in.next();
					/*
					 * while (in.hasNext()) { nextWord = in.next(); taskInput =
					 * taskInput + " " + nextWord; }
					 */
					q.add(new ToDoItem(priorityInput, taskInput));
					System.out.println(taskInput
							+ " has been added with priority " + priorityInput
							+ ":");
					System.out.println(q.toString());
				} else {
					System.out.println("Invalid priority");
				}
			} else if (command.equals("2")) {
				headToDoItem = q.peek();
				System.out.println(headToDoItem.toString());
				q.remove();
				System.out
						.println("The highest priority item has been removed.");
				System.out.println(q.toString());
			} else if (command.equals("3")) {
				System.out.println("The program has ended");
				newCommand = false;
			} else {
				System.out.println("Invalid command");
			}
		}
	}
}
