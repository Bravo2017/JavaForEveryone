package com.nationwide.blackjack2.vipond;

import java.util.ArrayList;

public class Hand {

	public ArrayList<String> createHand() {
		ArrayList<String> HandofCards = new ArrayList<String>();
		return HandofCards;
	}

	public int HandTotal(ArrayList<String> xHand, Deck xDeck, String xHandname,
			boolean finaltime) {
		System.out.println();
		int TotalValue = 0;
		int numAcePlayer = 0;
		int numAceDealer = 0;
		int numAcePlayerUsed = 0;
		int numAceDealerUsed = 0;
		System.out.println(xHandname + " Hand:");
		for (int i = 0; i <= xHand.size() - 1; i++) {
			if (xHandname == "Player") {
				String x = xHand.get(i);
				boolean isAce = false;
				isAce = xDeck.evaluateAce(x);
				if (isAce == true) {
					numAcePlayer = numAcePlayer + 1;
				}

				int cardTotal = xDeck.evaluateCardValue(x, TotalValue);
				TotalValue = TotalValue + cardTotal;
				if ((TotalValue > 21) && (numAcePlayer != numAcePlayerUsed)) {
					TotalValue = TotalValue - 10;
					numAcePlayerUsed = numAcePlayerUsed + 1;
				}

				System.out.println(x);
			} else {
				String x = xHand.get(i);
				boolean isAce = false;
				isAce = xDeck.evaluateAce(x);
				if (isAce == true) {
					numAceDealer = numAceDealer + 1;
				}
				int cardTotal = xDeck.evaluateCardValue(x, TotalValue);
				TotalValue = TotalValue + cardTotal;
				if ((TotalValue > 21) && (numAceDealer != numAceDealerUsed)) {
					TotalValue = TotalValue - 10;
					numAceDealerUsed = numAceDealerUsed + 1;
				}
				if (i == 0 && xHand.size() == 2 && finaltime == false) {
					System.out.println("?????????");
				} else {
					System.out.println(x);
				}
			}
		}

		if (xHandname == "Player") {
			System.out.println(xHandname + " Total value = " + TotalValue);
		}
		System.out.println();
		return TotalValue;
	}

}
