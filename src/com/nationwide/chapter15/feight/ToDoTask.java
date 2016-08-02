package com.nationwide.chapter15.feight;

/**
 * 
 * @author Suzanne Feight
 *
 */

public class ToDoTask implements Comparable{
	
	private final int priority;
	private final String description;
	
	public ToDoTask(int aPriority, String aDescription) {
		priority = aPriority;
		description = aDescription;
	}
	
	@Override
	public String toString() {
		return "priority=" + priority + ", description=" + description;
	}
	
	@Override
	public int compareTo(Object otherObject) {
		ToDoTask other = (ToDoTask) otherObject;
		
		int result = 0;
		if (priority < other.priority) {
			result = -1;
		}
		
		if (priority > other.priority) {
			result = 1;
		}
		
		return result;
	}

}
