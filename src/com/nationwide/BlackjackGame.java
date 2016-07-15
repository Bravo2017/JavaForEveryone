package com.nationwide.blackjack.feight;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author Suzanne Feight
 *
 */

public class BlackjackGame {
	
	private final static int BLACKJACK = 21;
	private final static Scanner in = new Scanner(System.in);
	private final static Player dealer = new Player("Dealer");
	private final static Player player1 = new Player("");
	private static Deck deck = new Deck();
	private final static ArrayList<Card> gameDeck = deck.getNewDeck();

	public static void main(String[] args) {
		
		startGame();
		
		deck.shuffleDeck(gameDeck);
		System.out.println("Starting the game.");
		
		dealCards(2);
		System.out.println();
		
		showHands();
		System.out.println();
		
		System.out.println("Did you win???");
		System.out.println(evaluateHands());
		if(evaluateHands()) {
			System.out.println("Good play!");
		} else {
			System.out.println("Darn...better luck next time.");
		}
		
		in.close();

	}
	
	private static void startGame() {
		
		System.out.println("Hello. Welcome to the Blackjack table.");
		System.out.println("Please tell me your name.");
		String userName = in.next();
				
		player1.setPlayerName(userName);
		System.out.println("Nice to meet you " + player1.getPlayerName() + ". I am the Dealer");
		System.out.println("Now let's play!\n");
		
	}
	
	private static void dealCards(int number) {
		
		for (int i = 1; i <= number; i++) {
			
			System.out.println("Dealing card #" + i);
			
			int index = getRandomCard();
			player1.getHand().addCard(gameDeck.get(index).getSuit(), gameDeck.get(index).getFace());
			gameDeck.remove(index);
			
			index = getRandomCard();
			dealer.getHand().addCard(gameDeck.get(index).getSuit(), gameDeck.get(index).getFace());
			gameDeck.remove(index);
		}
		
	}
	
	private static void showHands() {
		
		System.out.println("Here is your hand " + player1.getPlayerName() + ".");
		player1.getHand().showHand();
		
		System.out.println();
		System.out.println("This is the dealer's hand.");
		dealer.getHand().showHand();
		
	}
	
	private static boolean evaluateHands() {
		
		boolean result = false;
		int player1Total = player1.getHand().getTotal();
		int dealerTotal = dealer.getHand().getTotal();
		
		if (dealerTotal <= BLACKJACK && (dealerTotal == BLACKJACK || player1Total == dealerTotal || player1Total < dealerTotal)) {
			result = false;
		} else if (player1Total == BLACKJACK || dealerTotal > BLACKJACK) {
			result = true;
		} else if ((dealerTotal < BLACKJACK && player1Total < BLACKJACK) && player1Total > dealerTotal) {
			result = true;
		}
		
		return result;
	}
	
	private static int getRandomCard() {
		
		int index = 0;
		index = ThreadLocalRandom.current().nextInt(0, gameDeck.size());
		
		return index;
	}
	
}
