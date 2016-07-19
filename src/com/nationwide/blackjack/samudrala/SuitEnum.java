package com.nationwide.blackjack.samudrala;

/**
 * Created by SAMUDRS1 on 7/17/2016.
 */
public enum SuitEnum {
	CLUB("club"), DIAMOND("diamond"), HEART("heart"), SPADE("spade");
	private String value;

	SuitEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
