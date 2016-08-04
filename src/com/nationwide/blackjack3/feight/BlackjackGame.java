package com.nationwide.blackjack3.feight;

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
	private static ArrayList<Card> gameDeck;
	private static boolean playGame = true;

	public static void main(String[] args) {
		
		startGame();
		
		while (playGame) {
		
			gameDeck = deck.getNewDeck();
			deck.shuffleDeck(gameDeck);
			System.out.println("Starting the game.");
			
			dealCards(2);
			System.out.println();
			
			showTopCards();
			System.out.println();
			
			processStayHit();
			System.out.println();
			
			System.out.println("Let's see how eveyone did!\n");
			
			for (Player player : playerList) {
				if (player.getHand().getCardCount() > 0) {
					int playerTotal = player.getHand().getTotal();
					showHands(player);

					System.out.println();
					System.out.println(player.getPlayerName() + ", did you win???");

					boolean win = evaluateHands(player, playerTotal);
					System.out.println(win);
					if (win) {
						System.out.println("Good play!");
						player.winChips(player.getCurrentBet() * 2);
					} else {
						System.out.println("Darn...better luck next time.");
					}

					System.out
							.println("____________________________________________");
				}
			}
			
			String playAgain = null;
			do {
				System.out.println("Would you like to play another hand? (Y : N)");
				playAgain = in.next();
				
				if ("Y".equalsIgnoreCase(playAgain)) {
					playGame = true;
					resetPlayers();
					if (playGame) {
						System.out.println("Okay...Let's Play!");
					}
				} else if ("N".equalsIgnoreCase(playAgain)) {
					playGame = false;
					System.out.println("Thanks for playing. Good-bye.");
				} else {
					System.out.println("Invalid response. Pleaase enter Y or N.");
				}
				
			} while (!"Y".equalsIgnoreCase(playAgain) && !"N".equalsIgnoreCase(playAgain));
		}
		
		in.close();
	}
	
	private static void startGame() {
		
		System.out.println("Hello. Welcome to the Blackjack table.");
		int numPlayers = 0;
				
		do {
			System.out.println("How many players will we have. I can seat up to 4 players.");
			numPlayers = in.nextInt();
			if(numPlayers < 1 || numPlayers > 4) {
				System.out.println("Invalid number of players.");
			}
		} while (numPlayers < 1 || numPlayers > 4);
		
		System.out.println("Which seat number would you like to sit it?");
		int seatNumber = in.nextInt();
		
		System.out.println("Please tell me your name.");
		String userName = in.next();
		
		System.out.println("Okay, I will seat the others.");
		
		for (int i = 0; i < numPlayers; i++) {
			
			if( i == (seatNumber - 1)) {
				playerList.add(new Player(userName));
			} else {
				playerList.add(new Player("Player"+(i+1)));
			}
		}
	
		for (Player player : playerList) {
			System.out.println("Hello " + player.getPlayerName() + ".");
		}
		
		System.out.println("I am the Dealer. Now let's play!\n");
	}
	
	private static void dealCards(int number) {

		for (int i = 1; i <= number; i++) {

			System.out.println("Dealing card #" + i);

			for (Player player : playerList) {

				if (player.getChips() > 0) {
					player.getHand().addCard(gameDeck.get(0));
					gameDeck.remove(0);
				}
			}

			dealer.getHand().addCard(gameDeck.get(0));
			gameDeck.remove(0);
		}
	}
	
	private static void showTopCards() {
		
		for (Player player : playerList) {
			if (player.getHand().getCardCount() > 0) {
				System.out.println(player.getPlayerName() + "'s hand.");
				player.getHand().showTopCards();
				System.out.println();
			}
		}

		System.out.println("Dealer's hand.");
		dealer.getHand().showTopCards();
	}
	
	private static void processStayHit() {
		
		System.out.println("____________________________________________\n");

		for (Player player : playerList) {
			if (player.getHand().getCardCount() > 0) {
				String stayHit = null;
				System.out.println(player.getPlayerName() + ", it is your turn. Here is your Hand.");
				System.out.println("Enter 'H' for Hit or 'S' for Stay");

			do {
				player.getHand().showHand();
				
				int chipResult = 0;
				do {
					System.out.println("Your chip balance: " + player.getChips());
					System.out.println("How many chips do you want to bet? Each chip is $1");
					int betChips = in.nextInt();
					chipResult = player.getChips() - betChips;
					if (chipResult >= 0) {
						player.betChips(betChips);
					} else {
						System.out.println("You do not have enough chips for that bet.");
					}
				} while (chipResult < 0);
				
				System.out.println(player.getPlayerName() + ", do you want to Hit or Stay?");
				stayHit = in.next();

				if ("H".equalsIgnoreCase(stayHit)) {
					processHit(player);
					if (player.getHand().getIsBust() || player.getHand().getIsBlackjack()) {
						player.getHand().showHand();
						
						if (player.getHand().getIsBust()) {
							System.out.println("BUSTED! Sorry.");
						}
						
						if (player.getHand().getIsBlackjack()) {
							player.getHand().getTotal();
							System.out.println("BLACKJACK! Congrats!");
						}
						
						stayHit = "S";
					}
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
				dealer.getHand().showHand();

				if (dealer.getHand().getIsBust() || dealer.getHand().getIsBlackjack()) {

					if (dealer.getHand().getIsBust()) {
						System.out.println("Dealer BUSTED!");
					}

					if (dealer.getHand().getIsBlackjack()) {
						System.out.println("Dealer has BLACKJACK!");
					}
				}
			} else {
				System.out.println("Dealer stays.\n");
			}
		} while (dealer.getHand().getTotal() < 17);

		System.out.println("____________________________________________");
	}
	
	private static void processHit(Player player) {
		player.getHand().addCard(gameDeck.get(0));
		gameDeck.remove(0);
		player.getHand().getTotal();
	}
	
	private static void showHands(Player player) {
		
		System.out.println("Here is your hand " + player.getPlayerName() + ".");
		player.getHand().showHand();
		
		if (player.getHand().getIsBust()) {
			System.out.println("BUSTED!");
		}
		
		if (player.getHand().getIsBlackjack()) {
			System.out.println("BLACKJACK!");
		}
		
		System.out.println();
		System.out.println("This is the dealer's hand.");
		dealer.getHand().showHand();
		
		if (dealer.getHand().getIsBust()) {
			System.out.println("BUSTED!");
		}
		
		if (dealer.getHand().getIsBlackjack()) {
			System.out.println("BLACKJACK!");
		}
		
	}
	
	private static boolean evaluateHands(Player player, int playerTotal) {
		
		int dealerTotal = dealer.getHand().getTotal();
		
		if (dealerTotal <= BLACKJACK && (dealerTotal == BLACKJACK || playerTotal == dealerTotal || playerTotal < dealerTotal)) {
			return false;
		} else if (playerTotal <= BLACKJACK && (playerTotal == BLACKJACK || dealerTotal > BLACKJACK)) {
			return true;
		} else if ((dealerTotal < BLACKJACK && playerTotal < BLACKJACK) && playerTotal > dealerTotal) {
			return true;
		}
		return false;
		
	}
	
	private static void resetPlayers() {
		
		boolean havePlayer = false;
		
		for (Player player : playerList) {
			player.getHand().reset();
			player.resetCurrentBet();
			
			System.out.println(player.getPlayerName() + ", your chip balance is: " + player.getChips());
			String addChips = null;
			do {
				System.out.println("Would you like to add more chips? (Y : N)");
				addChips = in.next();
				if ("Y".equalsIgnoreCase(addChips)) {
					System.out.println("How may chips to you want to add?\n");
					int newChips = in.nextInt();
					player.winChips(newChips);
				} else if ("N".equalsIgnoreCase(addChips)) {
					if (player.getChips() < 1) {
						System.out.println(player.getPlayerName() + ", you will not be able to play the next hand. Please feel free to watch.\n");
					}
				} else {
					System.out.println("Invalid response. Pleaase enter Y or N.");
				}
			} while (!"Y".equalsIgnoreCase(addChips) && !"N".equalsIgnoreCase(addChips));
			
			if (player.getChips() > 0) {
				havePlayer = true;
			}
		}
		
		dealer.getHand().reset();
		if (!havePlayer) {
			playGame = false;
			System.out.println("No players are eligible to play. Good-Bye.");
		}
	}
	
}
