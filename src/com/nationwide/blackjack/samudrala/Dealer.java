package com.nationwide.blackjack.samudrala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by SAMUDRS1 on 7/16/2016.
 */
public class Dealer {
	public Dealer() {

	}

	public void shuffleTheCards(ArrayList<Card> deckArray) {
		Collections.shuffle(deckArray);
	}

	public Map<String, Hand> distributeTheCards(ArrayList<Card> deckArray) {
		Map<String, Hand> currentHands = new HashMap();
		Hand playersHand = new Hand();
		Hand dealersHand = new Hand();

		for (int i = 1; i < 3; i++) {
			playersHand.currentHand.add(pickARandomCardFromTheDeck(deckArray));
			dealersHand.currentHand.add(pickARandomCardFromTheDeck(deckArray));
		}
		currentHands.put("playersHand", playersHand);
		currentHands.put("dealersHand", dealersHand);
		return currentHands;
	}

	public Card pickARandomCardFromTheDeck(ArrayList<Card> deckArray) {
		Random random = new Random();
		int randomIndex = random.nextInt(deckArray.size());
		Card randomCard = deckArray.get(randomIndex);
		deckArray.remove(randomIndex);
		return randomCard;
	}

}
