package com.nationwide.chapter15.feight;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Implement a to do list. Tasks have a priority between 1 and 9, and a description. 
 * When the user enters the command add priority description, the program adds a new task.
 * When the user enters next, the program removes and prints the most urgent task.
 * The quit command quits the program. Use a priority queue in your solution.
 * 
 * @author Suzanne Feight
 *
 */

public class ToDoPriorityList {
	
	private static PriorityQueue<ToDoTask> toDoList = new PriorityQueue<ToDoTask>();
	private static Scanner in1 = new Scanner(System.in);
	private static Scanner in2 = new Scanner(System.in);
	private static boolean continueProgram = true;
	
	public static void main(String[] args) {
		
		String command = null;
		System.out.println("This is your To Do List:\n" + (toDoList.isEmpty() ? "List is Empty!\n" : toDoList.toString() + "\n"));
		
		while (continueProgram) {
			System.out.println("Please enter a command: (A)dd Priority Description.  (N)ext Task.  (Q)uit");
			command = in1.next();
			
			switch (command) {
				case "a":
				case "A":
					addTask();
					break;
				case "n":
				case "N":
					getNextTask();
					break;
				case "q":
				case "Q":
					System.out.println("Good-Bye");
					continueProgram = false;
					break;
				default:
					System.out.println("Invalid command.");
					break;
			}
		}
	}
	
	private static void addTask() {
		int priority = 0;
		String description = "";
		
		do {
			System.out.println("Please enter the priority (1:Highest Priority - 9:Lowest Priority)");
			priority = in1.nextInt();
		} while (priority < 1 || priority > 9);
		
		do {
			System.out.println("Please enter the description.");
			description = in2.nextLine();
		} while ("".equalsIgnoreCase(description));
		
		System.out.println();
		
		toDoList.add(new ToDoTask(priority, description));
		System.out.println("This is your new To Do List:\n" + (toDoList.isEmpty() ? "List is Empty!\n" : toDoList.toString() + "\n"));
		
	}
	
	private static void getNextTask() {
		
		if (toDoList.size() > 0) {
			System.out.println(toDoList.remove());
			System.out.println();
		} 
		
		System.out.println("This is your new To Do List:\n" + (toDoList.isEmpty() ? "Well Done! List is Empty!\n" : toDoList.toString() + "\n"));
		
		if (toDoList.isEmpty()) {
			System.out.println("Good-Bye");
			continueProgram = false;
		}
	}

}
