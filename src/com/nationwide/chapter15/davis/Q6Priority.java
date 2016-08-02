package com.nationwide;

// Not really working but it's something

import java.util.HashMap;
import java.util.Scanner;

//P15.6 Implement a to do list. 
//Tasks have a priority between 1 and 9, and a description. 
//When the user enters the command add priority description, 
//the program adds a new task. 
//When the user enters next, 
//the program removes and prints the most urgent task. 
//The quit command quits the program. 
//Use a priority queue in your solution.

public class Q6PriorityList {
	static String newTask = "";
	static String task = "";
	static int priority = 0;
	static int taskNum = 0;
	String taskDone = "";
	int mainOption = 0;
	static int option = 0;
	static HashMap<Integer, String> taskList = new HashMap<Integer, String>();

	public static void main(String[] args) {
		System.out.println("TODAY'S PRIORITY LIST");

		while (taskNum < 10) {
			System.out.println("\nChoose one of the following option numbers:");
			System.out.println("1. Add priority description");
			System.out.println("2. Next most urgent task ");
			System.out.println("3. Quit");
			Scanner mainOption = new Scanner(System.in);
			option = mainOption.nextInt();

			if (option == 1) {
				System.out.println("Please, Add priority description: ");
				Scanner newTask = new Scanner(System.in);
				task = newTask.next();
				addTask();
				System.out.println("Task " + task
						+ " has been added as priority " + priority);

			} else if (option == 2) {
				nextTaskToDo();

			} else if (option == 3) {
				taskNum = 11;
				// System.out.println("1Q = " + task);
			}

		}
		System.out.println("OK, Time to Get'er Done");
		showList();

	}

	private static void nextTaskToDo() {

		showList();
		taskList.remove(1);
		System.out.println("Tasks remaining");
		showList();
		taskNum--;
		int taskReNum = 1;
		String taskReTask = "";
		while (taskReNum <= taskNum) {
			taskReTask = taskList.get(taskReNum + 1);
			taskList.put(taskReNum, taskReTask);
			taskReNum++;
		}
		taskList.remove(taskNum);
		showList();
	}

	private static void showList() {
		System.out.println(taskList);

	}

	private static void addTask() {
		taskNum++;
		priority = taskNum;
		taskList.put(priority, task);
	}
}
