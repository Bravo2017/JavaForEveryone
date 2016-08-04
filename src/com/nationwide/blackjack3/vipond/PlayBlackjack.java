package com.nationwide.blackjack3.vipond;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayBlackjack {

	public static void main(String[] args) {

		System.out.println("Welcome!!!   Let's play some blackjack!");
		Scanner in = new Scanner(System.in);

		/* Create a deck of cards */
		Deck deck1 = new Deck();
		ArrayList<String> currentDeck = new ArrayList<String>();
		currentDeck = deck1.createDeck();
		int MaxPlayers = 4;
		String[] HandName = new String[MaxPlayers];
		HandName[0] = "Player#1";
		HandName[1] = "Player#2";
		HandName[2] = "Player#3";
		HandName[3] = "Player#4";
		int[] betAmount;
		betAmount = new int[MaxPlayers];
		Hand player[];
		player = new Hand[MaxPlayers];
		int[] TotalHand;
		TotalHand = new int[MaxPlayers];

		/* Shuffle the deck of cards */
		deck1.shuffle(currentDeck);

		/* Determine the number of players */
		System.out.print("How many players do we have (1-4)??? ");
		int numPlayers = in.nextInt();
		do {
			if (numPlayers <= 0 || numPlayers > MaxPlayers) {
				System.out
						.print("Please enter a number between 1-4 for the number of players");
				numPlayers = in.nextInt();
			}
		} while (numPlayers <= 0 || numPlayers > MaxPlayers);
		
		/* Ask for bets */	
		for (int i = 0; i < numPlayers; i++) {
			System.out.println(HandName[i] + "......how much do you want to bet (5-100)?");	
			int betAmt = in.nextInt();
			do {
				if (betAmt < 5 || betAmt > 100) {
					System.out
							.print(HandName[i] + "  Please enter a number between 5-100 for the amount you want to bet.");
					betAmt = in.nextInt();
				}
			} while (betAmt < 5 || betAmt > 100);
			betAmount[i] = betAmt;
		}
		
		/*ArrayList<String> group[] = new ArrayList[numPlayers];*/ 
		/*ArrayList<String> group = new ArrayList<ArrayList<String>>();		*/
		/*ArrayList[] group = new ArrayList[numPlayers]; */
		ArrayList<String>[] group = (ArrayList<String>[])new ArrayList[numPlayers];

		/* Create player and dealer original hands */
		for (int i = 0; i < numPlayers; i++) {
			Hand playerxx = new Hand();
			player[i] = playerxx;
			ArrayList<String> playerHand = new ArrayList<String>();
			playerHand = player[i].createHand();
			group[i] = playerHand;
		}

		Hand dealer = new Hand();
		ArrayList<String> dealerHand = new ArrayList<String>();
		dealerHand = dealer.createHand();

		/* Deal 2 cards to each player */
		for (int i = 1; i <= 2; i++) {
			for (int x = 0; x < numPlayers; x++) {
				String nextCard = deck1.dealCard(currentDeck);
				group[x].add(nextCard);
			}
		}
		/* Deal 2 cards to the dealer */
		for (int i = 1; i <= 2; i++) {
			String newnextCard = deck1.dealCard(currentDeck);
			dealerHand.add(newnextCard);
		}

		/* Determine the hand value */
		boolean blackjack = false;
		boolean dealerblackjack = false;
		int dealerTotalofHand = dealer.HandTotal(dealerHand, deck1, "Dealer",
				false);
		for (int x = 0; x < numPlayers; x++) {
			TotalHand[x] = player[x].HandTotal(group[x], deck1, HandName[x],
					false);
			if (TotalHand[x] == 21) {
				System.out.print("BLACKJACK....." + HandName[x] + " wins!!");
				System.out.println("*************************************");
				blackjack = true;
			} else {
				if (dealerTotalofHand == 21 && blackjack == false) {
					System.out.print("BLACKJACK.....dealer wins!!");
					System.out.println();
					dealerblackjack = true;
				}
			}
		}

		/* hit or stand */
		boolean nextplayer = false;
		for (int x = 0; x < numPlayers; x++) {
			while ((dealerblackjack == false) && (nextplayer == false) && (TotalHand[x] < 21)) {
				System.out.println(HandName[x] + " current total of hand - " + TotalHand[x]);
				System.out.print("Hit (H) or Stand (S)??? ");
				char HitStand;
				String userinput = in.toString();
				HitStand = userinput.charAt(0);
				do {
					HitStand = Character.toUpperCase(in.next().charAt(0));
					if (HitStand != 'H' && HitStand != 'S') {
						System.out.print("Please respond H or S:  ");
					}
				} while (HitStand != 'H' && HitStand != 'S');
				if (HitStand == 'S') {
					nextplayer = true;
				} else {
					String nextCard = deck1.dealCard(currentDeck);
					group[x].add(nextCard);
					TotalHand[x] = player[x].HandTotal(group[x], deck1,
							HandName[x], false);
					if (TotalHand[x] > 21) {
						System.out.println("Busted....sorry, you lose");
						System.out.println();
						nextplayer = true;
					}
				}
			}
			nextplayer = false;
		}
		/* see if dealer needs to get more cards */
		if (dealerTotalofHand < 17) {
			boolean conthit = true;
			do {
				System.out.println();
				System.out.println("Dealer total of " + dealerTotalofHand
						+ " is less than 17 so they must hit.");
				String nextCard = deck1.dealCard(currentDeck);
				dealerHand.add(nextCard);
				dealerTotalofHand = dealer.HandTotal(dealerHand, deck1,
						"Dealer", false);
				if (dealerTotalofHand > 21) {
					System.out.println("Dealer is Busted....players that have not busted win!");
					conthit = false;
				}
			} while (dealerTotalofHand < 17);
			System.out.println();
		} else {
			dealerTotalofHand = dealer.HandTotal(dealerHand, deck1, "Dealer",
					true);
		}

		/* Show results */
		System.out.println("Dealer hand = " + dealerTotalofHand);
		for (int x = 0; x < numPlayers; x++) {
			if (TotalHand[x] > 21) {
				System.out.println(HandName[x] + " = " + TotalHand[x] + "....Busted....you lose $" + betAmount[x]);
			}
			if ((TotalHand[x] <= 21) && (dealerTotalofHand > 21)){
				System.out.println(HandName[x] + " = " + TotalHand[x] + "....Dealer Busted....you WIN $" + betAmount[x] + "!!!");
			}
			else {
				if ((TotalHand[x] < 21) && (TotalHand[x] < dealerTotalofHand) && (dealerTotalofHand <= 21)) {
					System.out.println(HandName[x] + " = " + TotalHand[x] + "....Dealer Wins....you lose $" + betAmount[x]);
				}
				if ((TotalHand[x] < 21) && (TotalHand[x] == dealerTotalofHand)) {
					System.out.println(HandName[x] + " = " + TotalHand[x] + "....Push....you can keep your original bet of $" + betAmount[x]);
				}
				if ((TotalHand[x] <= 21) && (TotalHand[x] > dealerTotalofHand) && (dealerTotalofHand <= 21)) {
					System.out.println(HandName[x] + " = " + TotalHand[x] + "....you WIN $" + betAmount[x] + "!!!");
				}
			}
			
		}
	}
}

