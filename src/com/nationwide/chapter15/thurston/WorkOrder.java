package com.nationwide.chapter15.thurston;

public class WorkOrder {

	private int priority;
	private String description;

	/**
	 * Constructs a work order with a given priority and description.
	 * 
	 * @param aPriority
	 *            the priority of this work order
	 * @param aDescription
	 *            the description of this work order
	 */
	public WorkOrder(int aPriority, String aDescription) {
		priority = aPriority;
		description = aDescription;
	}

	public String toString() {
		return "priority=" + priority + ", description=" + description;
	}

	public int compareTo(Object otherObject) {
		WorkOrder other = (WorkOrder) otherObject;
		if (priority < other.priority)
			return -1;
		if (priority > other.priority)
			return 1;
		return 0;
	}

	// (Horstmann 692W)
	// Horstmann, Cay S. Java for Everyone: Late Objects, Interactive eBook, 2nd
	// Edition. Wiley, 02/2011. VitalBook file.
	// The citation provided is a guideline. Please check each citation for
	// accuracy before use.

}
