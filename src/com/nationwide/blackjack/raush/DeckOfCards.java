package Blackjack1;

import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
	private Card cards[];
	
	public DeckOfCards() {
		this.card = new Card[52];
		for (int i= 0; i < 52; i++) { 
			Card card = new Card (.card....);    //instantiates a Card
			this.cards[i] = card;   // adding card to the deck
		}
	}

	/**
	 * @param args
	 */
	
	
	Scanner keyboard = new Scanner(System.in);

    //52 Cards, Aces = 11, Picture cards = 10, Ace's cannot be reduced to 1.
    int[] newCard = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,11,11,11,11};

 
}
    static void shuffleArray(int[] deckCards){

        /**
         * This code is obtained from the internet and is not my own though process
         * I need to understand it before I will be happy using it.
         * I'll have a try at explaining this, please correct me if I suckarino.
         * deckCards is a placeholder for the array I chose to use.
         * i = the length of the array which is 52, -1 would be 51.
         * i will be greater than 0 until the i-- completely loops it down to 0.
         * index is a random number between 1 & 52.
         * a is a random number in the array.
         * deckCards[i] is replaced with a; 
         * essentially shuffling 1 card in the array, this happens 51 times?
         */

        Random rnd = new Random();
        for (int i = deckCards.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Swap
            int a = deckCards[index];
            deckCards[index] = deckCards[i];
            deckCards[i] = a;
        }
