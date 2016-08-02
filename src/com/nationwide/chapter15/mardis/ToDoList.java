package com.nationwide.chapter15.mardis;

public class ToDoList implements Comparable {

	private int priority;
	private String taskDescription;

	public ToDoList(int tPriority, String tDescription) {
		priority = tPriority;
		taskDescription = tDescription;
	}

	public String toString() {
		return "Priority " + priority + " Task is " + taskDescription;
	}

	@Override
	public int compareTo(Object o) {

		ToDoList td = (ToDoList) o;
		if (priority < td.priority)
			return -1;
		if (priority > td.priority)
			return 1;
		return 0;
	}

}
