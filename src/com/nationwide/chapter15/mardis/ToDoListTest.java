package com.nationwide.chapter15.mardis;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoListTest {

	/**
	 * Implement a to do list. Tasks have a priority between 1 and 9, and a
	 * description. When the user enters the command add priority description,
	 * the program adds a new task. When the user enters next, the program
	 * removes and prints the most urgent task. The quit command quits the
	 * program. Use a priority queue in your solution.
	 */
	public static void main(String[] args) {

		PriorityQueue<ToDoList> tdl = new PriorityQueue<ToDoList>();

		// tdl.add(new ToDoList(4, "Watch TV"));
		// tdl.add(new ToDoList(1, "Do Homework"));
		// tdl.add(new ToDoList(2, "Eat Lunch"));

		// while (tdl.size() > 0){
		// System.out.println(tdl.remove());
		// }

		Scanner in = new Scanner(System.in);
		String response;
		String desc;
		int priority = 0;

		do {
			System.out
					.println("Enter Add to add a new task, Next to display the next task, Quit to exit");
			response = in.next();
			if (response.equalsIgnoreCase("Add")) {
				System.out.println("Enter priorty");
				priority = in.nextInt();
				in.nextLine();
				System.out.println("Enter task description");
				desc = in.nextLine();
				tdl.add(new ToDoList(priority, desc));
			} else if (response.equalsIgnoreCase("Next")) {
				if (tdl.isEmpty()) {
					System.out
							.println("All tasks are complete.  Enter quit to exit");
				} else {
					System.out.println(tdl.remove());
				}
			}
		} while (!response.equalsIgnoreCase("Quit"));

		System.out.println("Goodbye");

	}

}
