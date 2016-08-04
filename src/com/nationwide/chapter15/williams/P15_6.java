package com.nationwide.chapter15.williams;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P15_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean quit = false;
		int x = 0;
		Queue<Task> taskList = new LinkedList<Task>();
		Scanner console = new Scanner(System.in);
		System.out.println("Enter (A)dd(to add a task)");
		System.out.println("Enter (N)ext(to complete the most urgent task)");
		System.out.println("Enter (Q)uit(to quit the program)");
		while (!quit) {
			System.out.print("Command:  ");
			String command = console.next();
			switch (command) {
			case "Q":
				quit = true;
				break;
			case "A":
				x = x + 1;
				Task task = new Task();
				System.out.println("Enter task name:  ");
				command = console.next();
				task.setName(command);
				task.setPriority(x);
				taskList.add(task);
				printNextTask(taskList);
				break;
			case "N":
				taskList.remove();
				System.out.println("Next");
				printNextTask(taskList);
				break;
			default:
				System.out.println("Please enter a valid command");
				break;
			}
		}
	}

	public static void printNextTask(Queue<Task> taskList) {
		Task task = new Task();
		task = taskList.peek();
		System.out.println(task.getName());
	}
}
