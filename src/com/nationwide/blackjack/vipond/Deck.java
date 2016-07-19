package com.nationwide.blackjack.vipond;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	int numCards = 52;

	public ArrayList<String> createDeck() {
		ArrayList<String> deckOfCards = new ArrayList<String>();
		for (int suit = 1; suit <= 4; suit++) {
			for (int value = 1; value <= 13; value++) {
				String aCard = cardType(value) + " of " + cardSuit(suit);
				deckOfCards.add(aCard);
			}
		}
		/*
		 *  *****SET THIS PART UP TO SHOW CARDS***** /*ArrayList to Array
		 * Conversion String array[] = new String[deckOfCards.size()]; for(int j
		 * =0;j<deckOfCards.size();j++){ array[j] = deckOfCards.get(j); }
		 * 
		 * /*Displaying Array elements for(String k: array) {
		 * System.out.println(k); }
		 * 
		 * System.out.println(); /* *****END OF PRINT SECTION*****
		 */
		return deckOfCards;

	}

	public ArrayList<String> shuffle(ArrayList<String> deckToShuffle) {
		Collections.shuffle(deckToShuffle);

		/*
		 *  *****SET THIS PART UP TO SHOW CARDS***** /*ArrayList to Array
		 * Conversion String array[] = new String[deckToShuffle.size()]; for(int
		 * j =0;j<deckToShuffle.size();j++){ array[j] = deckToShuffle.get(j); }
		 * 
		 * /*Displaying Array elements for(String k: array) {
		 * System.out.println(k); } /* *****END OF PRINT SECTION*****
		 */
		return deckToShuffle;
	}

	public String dealCard(ArrayList<String> currentDeck) {

		int topCardNum = currentDeck.size() - 1;
		String topCard = currentDeck.get(topCardNum);
		currentDeck.remove(topCardNum);
		return topCard;
	}

	public int evaluateCardValue(String cardType) {
		int value = 0;
		if (cardType.contains("Ace")) {
			value = 11;
		} else {
			if ((cardType.contains("King")) || (cardType.contains("Queen"))
					|| (cardType.contains("Jack")) || (cardType.contains("10"))) {
				value = 10;
			} else {
				if (cardType.contains("9")) {
					value = 9;
				} else {
					if (cardType.contains("8")) {
						value = 8;
					} else {
						if (cardType.contains("7")) {
							value = 7;
						} else {
							if (cardType.contains("6")) {
								value = 6;
							} else {
								if (cardType.contains("5")) {
									value = 5;
								} else {
									if (cardType.contains("4")) {
										value = 4;
									} else {
										if (cardType.contains("3")) {
											value = 3;
										} else {
											if (cardType.contains("2")) {
												value = 2;
											}
										}

									}

								}

							}

						}
					}

				}

			}
		}

		return value;
	}

	public String cardSuit(int suit) {
		switch (suit) {
		case 1:
			return "Hearts";
		case 2:
			return "Diamonds";
		case 3:
			return "Clubs";
		case 4:
			return "Spades";
		default:
			return "??";
		}
	}

	public String cardType(int card) {
		switch (card) {
		case 1:
			return "Ace";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		case 10:
			return "10";
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";
		default:
			return "??";
		}
	}

}
