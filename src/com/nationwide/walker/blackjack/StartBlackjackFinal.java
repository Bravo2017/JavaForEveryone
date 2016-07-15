package com.nationwide.walker.blackjack;

import java.util.ArrayList;

public class StartBlackjackFinal {
	
	
	public static void main(String[] args) {

		Deck deck = new Deck();
		Dealer dealer = new Dealer();
		ArrayList<Player> players = new ArrayList<Player>();
		
		int playerCount = 0;
		playerCount = Gameplay.getPlayerCount();
		
		
		dealer.equals(Gameplay.addDealer());
		players.equals(Gameplay.addPlayers(playerCount));
		
		Gameplay.dealHands(deck);
		Gameplay.printAllHands();
		Gameplay.startPlayerTurns();
		
		
		
	}
		
	
}
