package com.nationwide.blackjack2.samudrala;

import java.util.ArrayList;

import com.nationwide.blackjack.samudrala.FaceCardEnum;
import com.nationwide.blackjack.samudrala.SuitEnum;

/**
 * Created by SAMUDRS1 on 7/16/2016.
 */
public class Deck {
	ArrayList<Card> deckArray = new ArrayList<Card>();

	public ArrayList<Card> getTheDeckReady() {
		for (SuitEnum suit : SuitEnum.values()) {
			for (int j = 1; j <= 13; j++) {
				int cardValue = j;
				String cardSuit = suit.getValue();
				String cardName = cardSuit + cardValue;
				if (j > 10) {
					cardValue = 10;
					cardName = cardName + getFaceCardValue(j);
				} else if (j == 1) {
					cardValue = 11;
					cardName = cardName + getFaceCardValue(j);
				}
				Card cardInstance = new Card(cardValue, cardName, cardSuit);
				deckArray.add(cardInstance);
			}
		}

		return deckArray;
	}

	public String getFaceCardValue(int j) {
		String tempCardName = "";
		for (FaceCardEnum faceCardEnum : FaceCardEnum.values()) {
			if (faceCardEnum.getNumericValue() == j) {
				tempCardName = faceCardEnum.getValue();
			}
		}

		return tempCardName;
	}
}