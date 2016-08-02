package com.nationwide.chapter15.nelson;

/**
 * 15.6 Implement a To Do List Priority queue needs to be able to tell which
 * element is smallest value (most urgent), so added tasks should belong to a
 * class that implements the Comparable interface.
 */

public class Task implements Comparable<Object> {
	private int priority;
	private String description;

	public Task(int priority, String description) {
		this.priority = priority;
		this.description = description;
	}

	public int getPriority() {
		return this.priority;
	}

	public String getDescription() {
		return this.description;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Task other = (Task) o;

		if (this.priority > other.priority) {
			return 1;
		} else if (this.priority < other.priority) {
			return -1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return String.format("Priority: %d,  Description: %s", this.priority,
				this.description);
	}
}
