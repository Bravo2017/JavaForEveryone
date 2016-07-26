package com.nationwide.blackjack.feight;

import java.util.ArrayList;
import java.util.Scanner;

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
		
		showTopCards();
		System.out.println();
		
		processStayHit();
		System.out.println();
		
		showHands();
		System.out.println();
		
		System.out.println("Did you win???");
		boolean win = evaluateHands();
		System.out.println(win);
		if(win) {
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
			
			player1.getHand().addCard(gameDeck.get(0));
			gameDeck.remove(0);
			
			dealer.getHand().addCard(gameDeck.get(0));
			gameDeck.remove(0);
		}
		
	}
	
	private static void showTopCards() {

		System.out.println(player1.getPlayerName() + "'s hand.");
		player1.getHand().showTopCards();
		
		System.out.println();
		System.out.println("Dealer's hand.");
		dealer.getHand().showTopCards();

	}
	
	private static void processStayHit() {
		System.out.println("Enter 'H' for Hit or 'S' for Stay");
		System.out.println("____________________________________________");
		String stayHit = null;
		
		do {
			
			System.out.println(player1.getPlayerName() + ", do you want to Hit or Stay?");
			stayHit = in.next();

			if ("H".equalsIgnoreCase(stayHit)) {
				processHit();
				processDealerStayHit();
			} else if ("S".equalsIgnoreCase(stayHit)) {
				processDealerStayHit();
			} else {
				System.out.println("Invalid entry. Please enter 'H' or 'S'.");
			}
			
			showTopCards();
			System.out.println("____________________________________________");
			
		} while ((!"H".equalsIgnoreCase(stayHit) && !"S".equalsIgnoreCase(stayHit))
				|| "H".equalsIgnoreCase(stayHit));
		
	}
	
	private static void processDealerStayHit() {
		if (dealer.getHand().getTotal() < 17) {
			System.out.println("Dealer hits.\n");
			dealer.getHand().addCard(gameDeck.get(0));
			gameDeck.remove(0);
		} else {
			System.out.println("Dealer stays.\n");
		}
	}
	
	private static void processHit() {
		player1.getHand().addCard(gameDeck.get(0));
		gameDeck.remove(0);
	}
	
	private static void showHands() {
		
		System.out.println("Here is your hand " + player1.getPlayerName() + ".");
		player1.getHand().showHand();
		
		System.out.println();
		System.out.println("This is the dealer's hand.");
		dealer.getHand().showHand();
		
	}
	
	private static boolean evaluateHands() {
		
		int player1Total = player1.getHand().getTotal();
		int dealerTotal = dealer.getHand().getTotal();
		
		if (dealerTotal <= BLACKJACK && (dealerTotal == BLACKJACK || player1Total == dealerTotal || player1Total < dealerTotal)) {
			return false;
		} else if (player1Total <= BLACKJACK && (player1Total == BLACKJACK || dealerTotal > BLACKJACK)) {
			return true;
		} else if ((dealerTotal < BLACKJACK && player1Total < BLACKJACK) && player1Total > dealerTotal) {
			return true;
		}
		return false;
		
	}
	
}
