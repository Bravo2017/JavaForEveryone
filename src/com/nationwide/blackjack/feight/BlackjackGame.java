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
	private final static ArrayList<Player> playerList = new ArrayList<Player>();
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
		
		
		for (Player player : playerList) {
			showHands(player);
			
			System.out.println();
			System.out.println("Did you win???");

			boolean win = evaluateHands();
			System.out.println(win);
			if (win) {
				System.out.println("Good play!");
			} else {
				System.out.println("Darn...better luck next time.");
			}
			
			System.out.println("____________________________________________");
		}
		
		in.close();
	}
	
	private static void startGame() {
		
		System.out.println("Hello. Welcome to the Blackjack table.");
		System.out.println("Please tell me your name.");
		String userName = in.next();
		
		playerList.add(new Player(userName));
		
		for (Player player : playerList) {
			System.out.println("Hello " + player.getPlayerName() + ".");
		}
		
		System.out.println("I am the Dealer. Now let's play!\n");
	}
	
	private static void dealCards(int number) {
		
		for (int i = 1; i <= number; i++) {
			
			System.out.println("Dealing card #" + i);
			
			for (Player player : playerList) {
				player.getHand().addCard(gameDeck.get(0));
				gameDeck.remove(0);
			}
			
			dealer.getHand().addCard(gameDeck.get(0));
			gameDeck.remove(0);
		}
	}
	
	private static void showTopCards() {
		
		for (Player player : playerList) {
			System.out.println(player.getPlayerName() + "'s hand.");
			player.getHand().showTopCards();
			System.out.println();
		}

		System.out.println("Dealer's hand.");
		dealer.getHand().showTopCards();
	}
	
	private static void processStayHit() {
		
		System.out.println("____________________________________________\n");

		for (Player player : playerList) {
			String stayHit = null;
			System.out.println(player.getPlayerName() + ", it is your turn. Here is your Hand.");
			System.out.println("Enter 'H' for Hit or 'S' for Stay");

			do {
				player.getHand().showHand();
				System.out.println("Do you want to Hit or Stay?");
				stayHit = in.next();

				if ("H".equalsIgnoreCase(stayHit)) {
					processHit(player);
				} else if ("S".equalsIgnoreCase(stayHit)) {
					System.out.println("____________________________________________");
					break;
				} else {
					System.out.println("Invalid entry. Please enter 'H' or 'S'.");
				}

				System.out.println("____________________________________________");

			} while ((!"H".equalsIgnoreCase(stayHit) && !"S".equalsIgnoreCase(stayHit))
					|| "H".equalsIgnoreCase(stayHit));
		}
		
		processDealerStayHit();
	}
	
	private static void processDealerStayHit() {
		
		System.out.println("Dealer's turn.");

		do {
			dealer.getHand().showHand();
			if (dealer.getHand().getTotal() < 17) {
				System.out.println("Dealer hits.\n");
				processHit(dealer);
			} else {
				System.out.println("Dealer stays.\n");
			}
		} while (dealer.getHand().getTotal() < 17);
		
		System.out.println("____________________________________________");
	}
	
	private static void processHit(Player player) {
		player.getHand().addCard(gameDeck.get(0));
		gameDeck.remove(0);
	}
	
	private static void showHands(Player player) {
		
		System.out.println("Here is your hand " + player.getPlayerName() + ".");
		player.getHand().showHand();
		
		System.out.println();
		System.out.println("This is the dealer's hand.");
		dealer.getHand().showHand();
		
	}
	
	private static boolean evaluateHands() {
		
		int player1Total = playerList.get(0).getHand().getTotal();
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
