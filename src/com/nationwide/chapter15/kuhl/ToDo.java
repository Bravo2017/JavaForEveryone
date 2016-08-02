package com.nationwide.chapter15.kuhl;

public class ToDo implements Comparable {
	private int priority;
	private String description;

	/**
	 * Constructs a To Do list with a given priority and description.
	 * 
	 * @param aPriority
	 *            the priority of this work order
	 * @param aDescription
	 *            the description of this work order
	 */
	public ToDo(int aPriority, String aDescription) {
		priority = aPriority;
		description = aDescription;
	}

	public String toString() {
		return "priority=" + priority + ", description=" + description;
	}

	public int compareTo(Object otherObject) {
		ToDo other = (ToDo) otherObject;
		if (priority < other.priority)
			return -1;
		if (priority > other.priority)
			return 1;
		return 0;
	}

}
