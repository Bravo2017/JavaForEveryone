package com.nationwide.blackjack.walker;

public class StartBlackjackFinal {
	
	
	public static void main(String[] args) {

		Gameplay.inputPlayerCount();
		Gameplay.addPlayers();
		
		Gameplay.dealHands();
		Gameplay.printAllHands();

		Gameplay.highestHand();
		
	}
		
}
