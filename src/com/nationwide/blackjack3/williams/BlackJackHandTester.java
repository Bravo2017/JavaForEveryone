package com.nationwide.blackjack3.williams;

import java.util.Scanner;

public class BlackJackHandTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x;
		boolean playerHit = false;
		BlackJackDeck deck = new BlackJackDeck();
		deck.shuffleDeck();
		BlackJackHand playersHand = new BlackJackHand();
		BlackJackHand dealersHand = new BlackJackHand();
		for (x = 0;x < 4;x++){
			BlackJackCard dealtCard = deck.getCard(x);
			if((x % 2) == 0){
				playersHand.addCard(dealtCard);
			}
			else{
				dealersHand.addCard(dealtCard);
			}
			deck.removeCard(dealtCard);
		}
		for (x = 0;x < playersHand.getLength();x++){
			BlackJackCard displayCard = playersHand.getCard(x);
			System.out.println("Your hand contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and has a numeric value of " + displayCard.getNumericValue());
		}
		for (x = 0;x < dealersHand.getLength();x++){
			BlackJackCard displayCard = dealersHand.getCard(x);
			System.out.println("The dealer's hand contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and has a numeric value of " + displayCard.getNumericValue());
		}
		Scanner console = new Scanner(System.in);
		System.out.print("Hit?(Yes/No):  ");
		String hit = console.next();
		if (hit.equals("yes")){
			playerHit = true;
		} else {
			playerHit = false;
		}
		while (playerHit){
			BlackJackCard playerHitCard = deck.getNextCard();
			playersHand.addCard(playerHitCard);
			deck.removeCard(playerHitCard);
			for (x = 0;x < playersHand.getLength();x++){
				BlackJackCard displayCard = playersHand.getCard(x);
				System.out.println("Your hand contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and has a numeric value of " + displayCard.getNumericValue());
			}
			System.out.print("Hit?(Yes/No):  ");
			hit = console.next();
			if (hit.equals("yes")){
				playerHit = true;
			} else {
				playerHit = false;
			}
		}
		if (playersHand.gethandValue() > 21){
			System.out.println("You busted!");
		}else if (dealersHand.gethandValue() > 21){
			System.out.println("Dealer busted!");
		}else if (dealersHand.gethandValue() > playersHand.gethandValue()){
			System.out.println("Dealer Won!");
		}else if (playersHand.gethandValue() > dealersHand.gethandValue()){
			System.out.println("You Won!");
		}else{
			System.out.println("Push!");
		}
	}

}

