package com.nationwide.blackjack.feight;

import java.util.ArrayList;

/**
 * @author Suzanne Feight
 */

public class Player {
	
	private final String playerName;
	private final ArrayList<Card> hand;
	private final int score = 0;
	
	public Player(String name) {
		playerName = name;
		hand = new ArrayList<Card>();
	}
	

}
