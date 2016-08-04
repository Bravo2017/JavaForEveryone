package com.nationwide.blackjack3.defenbaugh;

import java.util.Scanner;

public class PlayBlackjack {

	/**
	 * Phase 1 Requirements:
	 * 2 players (one dealer)
	 * Create a hand for each player
	 * A hand is two cards
	 * 52 card deck
	 * Evaluate winner

	 * Phase 2 Requirements:
	 * Add suit 
	 * Add options to hit and stay
	 * The dealer must draw on 16 and stay on 17
	 * Add the Ace value determination
	  
	 * Bust if over 21
	 * Multiple players(1-4)
	 * Betting with standard pay out, double your money if you win
	 * Deal from the top of the deck


	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numberOfPlayers = 0;

		while (numberOfPlayers < 1 || numberOfPlayers > 4){
			System.out.print("How many people are playing blackjack (1 - 4)?:");
			numberOfPlayers = in.nextInt();
			
			if (numberOfPlayers > 4) {
				System.out.println("The number of players must be between 1 and 4.");
			} 
		}
		
		for (int i = 1; i <= numberOfPlayers; i++) {
			System.out.println("What is the name of player " + i + "?");
			String inPlayerName = in.next();
		}
		
		Deck theDeck = new Deck(1, true);
		
		Player playerOne = new Player("Val");
		Player dealer = new Player("Dealer");
		
		// The addCard method is defined in the Player class
		// Add cards to the player and dealer hands
		// The DealCard method is in the Deck class
		playerOne.addCard(theDeck.DealCard());
		dealer.addCard(theDeck.DealCard());
		playerOne.addCard(theDeck.DealCard());
		dealer.addCard(theDeck.DealCard());
		
		System.out.println("The cards have been dealt");
		System.out.println();
		playerOne.showHand(true);
		System.out.println();
		dealer.showHand(false);
		System.out.println("\n");
		
		boolean playerOneDone = false;
		boolean dealerDone = false;
		String ans;
		
		while (!playerOneDone || !dealerDone) {
			
			if (!playerOneDone) {
				System.out.print("Hit or Stay? (Enter H or S)");
				ans = in.next();
				System.out.println();
				
				if (ans.compareToIgnoreCase("H") == 0) {
					
					playerOneDone = !playerOne.addCard(theDeck.DealCard());
					playerOne.showHand(true);
				} else {
					playerOneDone = true;
				}
			}
			
			if (!dealerDone) {
				if (dealer.getHandTotal() < 17) {
					System.out.println("The Dealer hits\n");
					dealerDone = !dealer.addCard(theDeck.DealCard());
					dealer.showHand(false);
				} else {
					System.out.println("The Dealer stays");
					dealerDone = true;
				}
			}
			System.out.println();			
		}
		in.close();
		
		playerOne.showHand(true);
		dealer.showHand(true);
		
		int playerOneSum = playerOne.getHandTotal();
		int dealerSum = dealer.getHandTotal();
		
		if (playerOneSum > dealerSum && playerOneSum <=21 || dealerSum > 21) {
			System.out.println("Player one wins!");
		} else if (playerOneSum > 21) {
			System.out.println("Player one busts. Dealer wins!");
		} else {
			System.out.println("Dealer wins!");
		}
	}

}

