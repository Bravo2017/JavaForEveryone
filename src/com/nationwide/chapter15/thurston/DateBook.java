package com.nationwide.chapter15.thurston;

import java.util.PriorityQueue;
import java.util.Scanner;

import com.nationwide.chapter15.WorkOrder;

public class DateBook {

	public DateBook() {
		Scanner input = new Scanner(System.in);
		PriorityQueue<WorkOrder> queue = new PriorityQueue<WorkOrder>();
		String task;
		int priority;
		String needtoadd = "Y";
		while (needtoadd != "N") {
			System.out.println("Please enter a task.");
			task = input.next();
			System.out.println("What is the task Priority (between 1 and 9)?");
			priority = input.nextInt();
			queue.add(new WorkOrder(priority, task));
			System.out.println("");
			System.out
					.println("Do you want to ender another item? HitY to enter, N to quit");
			needtoadd = input.next();
			needtoadd = needtoadd.toUpperCase();
		}

	}

	public static void main(String args[]) {

		DateBook newdate = new DateBook();
		System.out.println(newdate);

	}

}
