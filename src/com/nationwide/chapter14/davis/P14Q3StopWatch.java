package com.nationwide;

public class P14Q3StopWatch {

	
	public static void main(String[] args) {
		// Use stopwatch to time selection sort

		P14Q3 timer = new P14Q3();
		timer.start();
		P14Q2SortDemo p14q00 = new P14Q2SortDemo();
		p14q00.P14Q2Sort();
		p14q00.P14Q2Sort();
		p14q00.P14Q2Sort();
		timer.stop();

		System.out.println("Elapsed time: " + timer.getElapsedTime()
				+ " milliseconds");
	}

}
