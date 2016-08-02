package com.nationwide.chapter15.tekippe;

public class ToDoItem implements Comparable {

	/**
	 * A card with a suite, value
	 */
	private int priority;
	private String description;

	/**
	 * Constructs a cardn.
	 * 
	 * @param aName
	 *            the name of the card.
	 * @param aSuite
	 *            the suite of the card.
	 */
	public ToDoItem(int aPriority, String aDescription) {
		priority = aPriority;
		description = aDescription;
	}

	public String toString() {
		return "priority=" + priority + ", description=" + description;
	}

	public int compareTo(Object otherObject) {
		ToDoItem other = (ToDoItem) otherObject;
		if (priority < other.priority)
			return -1;
		if (priority > other.priority)
			return 1;
		return 0;
	}
}
