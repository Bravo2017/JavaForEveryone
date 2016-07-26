package com.nationwide.chapter14.vipond;

public class SelectionSorter {

	public SelectionSorter(Coins[] a) {

		for (int i = 0; i < a.length; i++) {
			// find the smallest unsorted element
			int smallestIndex = i; // the first unsorted element
			for (int j = i + 1; j < a.length; j++)
				if (a[j].getValue() < a[smallestIndex].getValue()) {
					smallestIndex = j;
				}

			// we've now found the smallest element, and now we swap
			double temp = a[smallestIndex].getValue();
			String tempstr = a[smallestIndex].getName();
			a[smallestIndex] = a[i];
			a[i] = new Coins(temp, tempstr);
		}
	}
}