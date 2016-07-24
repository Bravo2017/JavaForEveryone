package com.nationwide.chapter14.davis;

// P14.3 Write a program that automatically 
// generates the table of sample run times for 
// the selection sort algorithm. 
// The program should ask for the smallest and largest 
// value of n and the number of measurements 
// and then make all sample runs. 
// using System.currentTimeMillis

/**
 * @author DAVISK51
 * 
 */
public class P14Q3 {

	private long elapsedTime;
	private long startTime;
	private boolean isRunning;

	public P14Q3() {
		reset();

	}

	public void start() {
		if (isRunning) {
			return;
		}
		isRunning = true;
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		if (!isRunning) {
			return;
		}
		isRunning = false;
		long endTime = System.currentTimeMillis();
		elapsedTime = elapsedTime + endTime - startTime;
	}

	public long getElapsedTime() {
		if (isRunning) {
			long endTime = System.currentTimeMillis();
			return elapsedTime + endTime - startTime;
		} else {
			return elapsedTime;
		}
	}

	public void reset() {
		elapsedTime = 0;
		isRunning = false;
	}
}
