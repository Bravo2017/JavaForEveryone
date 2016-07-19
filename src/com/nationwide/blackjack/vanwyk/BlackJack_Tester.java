package com.nationwide.blackjack.vanwyk;

public class BlackJack_Tester {

	/*
	 * Create a BlackJack game w/requirements: 1.2 players (one dealer) 2.Create
	 * a hand for each 3.hand is two cards 4.52 card deck/no suits. 5.Evaluate
	 * winner
	 * 
	 * @author VANWYKA1
	 */

	public static void main(String[] args) {

		int[] cardValue = { 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6,
				6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10,
				10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11 };

		// String[] suitValue = {" Hearts ", " Spades ", " Diamonds ",
		// " Clubs "};

		int oneLength = cardValue.length;
		// int twoLength = suitValue.length;

		int rand1 = (int) (Math.random() * oneLength);
		// int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * oneLength);
		// int rand4 = (int) (Math.random() * twoLength);
		int rand5 = (int) (Math.random() * oneLength);
		// int rand6 = (int) (Math.random() * twoLength);
		int rand7 = (int) (Math.random() * oneLength);
		// int rand8 = (int) (Math.random() * twoLength);

		int dealerHand = cardValue[rand1]; // + "" + suitValue[rand2] + " & ";
		int dealerHand2 = cardValue[rand3];// + "" + suitValue[rand4];

		int playerHand = cardValue[rand5];// + "" + suitValue[rand6] + " & ";
		int playerHand2 = cardValue[rand7];// + "" + suitValue[rand8];

		System.out
				.println("Dealer hand is " + dealerHand + " & " + dealerHand2);

		System.out
				.println("Player hand is " + playerHand + " & " + playerHand2);

		int dealerHandAdded = (dealerHand + dealerHand2);
		int playerHandAdded = (playerHand + playerHand2);

		System.out.println("Dealer has " + dealerHandAdded);
		System.out.println("Player has " + playerHandAdded);

		if (dealerHandAdded >= playerHandAdded) {
			System.out.println("Dealer Wins :(");
		} else {
			System.out.println("Player Wins :)");
		}

	}
}