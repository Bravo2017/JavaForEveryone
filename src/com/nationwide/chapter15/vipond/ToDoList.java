package com.nationwide.chapter15.vipond;

/**
 * This class encapsulates a work order with a todolist.
 */
public class ToDoList implements Comparable {
	private int todolist;
	private String description;

	/**
	 * Constructs a work order with a given todolist and description.
	 * 
	 * @param atodolist
	 *            the todolist of this work order
	 * @param aDescription
	 *            the description of this work order
	 */
	public ToDoList(int atodolist, String aDescription) {
		todolist = atodolist;
		description = aDescription;
	}

	public String toString() {
		return "Priority" + todolist + ", description=" + description;
	}

	public int compareTo(Object otherObject) {
		ToDoList other = (ToDoList) otherObject;
		if (todolist < other.todolist)
			return -1;
		if (todolist > other.todolist)
			return 1;
		return 0;
	}
}
