package com.nationwide.walker.blackjack;

public class StartBlackjackFinal {
	
	
	public static void main(String[] args) {

		Deck deck = new Deck();
		int playerCount = 0;
	
		playerCount = Gameplay.getPlayerCount();
		deck.equals(Gameplay.addPlayersCreateDeck(playerCount, deck));
		
		
		//ADD LOOP

		

	}
		
	
}
