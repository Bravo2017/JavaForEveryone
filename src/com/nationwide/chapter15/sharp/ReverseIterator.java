package com.nationwide.chapter15.sharp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ReverseIterator<T> implements Iterator<T>, Iterable<T> {

	private static final List<String> List = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	private final List<T> list;
	private int position;

	public ReverseIterator(List<T> list) {
		this.list = list;
		this.position = list.size() - 1;
	}

	public Iterator<T> iterator() {
		return this;
	}

	public boolean hasNext() {
		return position >= 0;
	}

	public T next() {
		return list.get(position--);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	public static List<String> getList() {
		return List;
	}

	{

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// for (final String someString : list.listIterator(list)) {
		// do something

		System.out.println(list);
	}

}