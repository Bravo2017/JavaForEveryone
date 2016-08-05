package com.nationwide.blackjack3.mardis;

import java.util.ArrayList;

public class Player {

	String name;
	ArrayList<Card> hand;
	int total;
	
	public Player (){
		hand = new ArrayList<Card>();
		
		name = "none";
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public ArrayList<Card> getHand() {
		return hand;
	}


	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}



	

}


