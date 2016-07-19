package com.nationwide.blackjack.walker;

public class StartBlackjack {
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Blackjack!");
		System.out.println("");
		
		Gameplay.inputPlayerCount();
		Gameplay.addPlayers();
		
		Gameplay.placeBets();
		
		System.out.println("");
		
		Gameplay.dealHands();
		Gameplay.printAllHands();
		Gameplay.checkForBlackjack();
		
	}
		
}
