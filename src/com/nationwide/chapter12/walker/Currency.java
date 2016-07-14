package com.nationwide.chapter12.walker;

public class Currency {
	
	private double value;
	private String name;
	
	
	public Currency(double value, String name){
		this.value = value;
		this.name = name;
	}


	public double getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

}
