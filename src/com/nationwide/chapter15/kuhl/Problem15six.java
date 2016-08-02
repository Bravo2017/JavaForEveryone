package com.nationwide.chapter15.kuhl;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem15six {

	/**
	 * Implement a to do list. Tasks have a priority between 1 and 9, and a
	 * description. When the user enters the command add priority description,
	 * the program adds a new task. When the user enters next, the program
	 * removes and prints the most urgent task. The quit command quits the
	 * program. Use a priority queue in your solution.
	 */
	public static void main(String[] args) {

		PriorityQueue<ToDo> q = new PriorityQueue<ToDo>();
		q.add(new ToDo(3, "Lunch"));
		q.add(new ToDo(7, "Clean"));
		q.add(new ToDo(8, "Sing"));
		q.add(new ToDo(9, "Dance"));
		q.add(new ToDo(6, "Supper"));
		q.add(new ToDo(1, "Breakfast"));
		q.add(new ToDo(9, "Shampoo"));
		q.add(new ToDo(2, "Dust"));

		Scanner in = new Scanner(System.in);
		System.out.println("Valid commands are :");
		System.out.println("1 - add priority description");
		System.out.println("2 - next");
		System.out.println("3 - quit");

		System.out.print("Please enter a command: ");
		String command = in.next();

		ToDo headToDo;
		String taskInput = "";
		String nextWord = "";

		if (command.equals("1")) {
			System.out.print("Please enter a priority between 1 and 9: ");
			int priorityInput = in.nextInt();
			if (priorityInput > 0 && priorityInput < 10) {
				System.out
						.print("Please enter the task description (correctly): ");
				taskInput = in.next();

				q.add(new ToDo(priorityInput, taskInput));
				System.out.println(taskInput + " added with priority of "
						+ priorityInput + ":");
				System.out.println(q.toString());
			} else {
				System.out.println("Invalid priority");
			}
		} else if (command.equals("2")) {
			headToDo = q.peek();
			System.out.println(headToDo.toString());
			q.remove();
			System.out.println("The highest priority item has been removed.");
			System.out.println(q.toString());
		} else if (command.equals("3")) {
			System.out.println("the end");
		} else {
			System.out.println("Invalid command");
		}
		if (q.size() == 0) {
			System.out.println("There are no more To Do items.");
		} else {
			System.out.println("Your session has ended.");
		}
	}
}
