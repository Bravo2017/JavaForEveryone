package com.nationwide.blackjack.mardis;

import java.util.ArrayList;

public class Player {

	String name;
	ArrayList<Card> hand;

	public Player() {
		hand = new ArrayList<Card>();

		name = "none";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

}
