package com.nationwide.blackjack2.samudrala;

/**
 * Created by SAMUDRS1 on 7/17/2016.
 */
public enum FaceCardEnum {
	ACE("A", 1), JACK("J", 11), KING("K", 12), QUEEN("Q", 13);
	String value;
	int numericValue;

	FaceCardEnum(String value, int numericValue) {
		this.value = value;
		this.numericValue = numericValue;
	}

	public String getValue() {
		return value;
	}

	public int getNumericValue() {
		return numericValue;
	}

}