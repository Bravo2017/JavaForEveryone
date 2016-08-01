package com.nationwide.chapter15.sharp;

import java.util.PriorityQueue;

import com.nationwide.chapter15.WorkOrder;

public class PriorityQueue1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * This program demonstrates a priority queue of work orders. The most
		 * important work orders are removed first.
		 */

		PriorityQueue<WorkOrder> errand = new PriorityQueue<WorkOrder>();
		errand.add(new WorkOrder(5, "Put gas in car"));
		errand.add(new WorkOrder(7, "Wash car"));
		errand.add(new WorkOrder(4, "Put groceries away"));
		errand.add(new WorkOrder(3, "Buy groceries"));
		errand.add(new WorkOrder(6, "Get oil change in car"));
		errand.add(new WorkOrder(1, "Make grocery list"));
		errand.add(new WorkOrder(8, "Go to dentist"));
		errand.add(new WorkOrder(2, "Go to bank"));
		while (errand.size() > 0) {
			System.out.println(errand.remove());
		}
	}
}