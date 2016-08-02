package com.nationwide.jfe.chapter15homework;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
* Implement a to do list. Tasks have a priority between 1 and 9, and a description. 
* When the user enters the command add priority description, the program adds a new task. 
* When the user enters next, the program removes and prints the most urgent task. 
* The quit command quits the program. Use a priority queue in your solution.
*/


public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<WorkOrder> q = new PriorityQueue<WorkOrder>();
		q.add(new WorkOrder(3, "Shampoo carpets"));
		q.add(new WorkOrder(7, "Empty trash"));
		q.add(new WorkOrder(8, "Water plants"));
		q.add(new WorkOrder(10, "Remove pencil sharpener shavings"));
		q.add(new WorkOrder(6, "Replace light bulb"));
		q.add(new WorkOrder(1, "Fix broken sink"));
		q.add(new WorkOrder(9, "Clean coffee maker"));
		q.add(new WorkOrder(2, "Order cleaning supplies"));

		while (q.size() > 0) {
			System.out.println(q.remove());
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your next wish...");
		
		Scanner sc = null;
		String command = sc.next();
		if(command.compareToIgnoreCase("next") == 0){
			
			this.dealTheGame();			
		}
		else{
					
			gameOver = true;
		}	
	}
}