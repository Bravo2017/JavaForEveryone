package com.nationwide.blackjack3.nelson;

import java.util.Random;						//needed to do deck shuffling

/**
 * An implementation of a deck of cards
 * @author NELSOT17
 */
public class Deck 
{
	/**
	 * The array of cards in the deck, where the top card is in the first index.
	 */
	private Card[] myCards;												// do I want to use an Array
	//private ArrayList<Card> myCards;									// or an ArrayList
	
	// number of cards currently in the deck							// multiple decks - future use
	private int numCards;
	
	/**
	 * Constructor with a default of one deck and no shuffling
	 */
		public Deck()
	{
		// call the other constructor, defining one deck without shuffling
 		this(1, false);													// 1 deck with no shuffling for now 
	}
	
	/**
	 * Constructor that defines the number of decks and whether it should be shuffled.
	 * @param numDecks	number of individual decks in dealers deck
	 * @param shuffle   whether to shuffle the cards
	 */
	public Deck(int numDecks, boolean shuffle)
	{
		this.numCards = numDecks * 52;
		this.myCards = new Card[this.numCards];
		
		int c = 0;														// initialize card index
		
		for (int d = 0; d < numDecks; d++)								// for each deck
		{
			for (int s = 0; s < 4; s++)									// for each suit
			{
				for (int n = 1; n <= 13; n++)							// for each number
				{
					this.myCards[c] = new Card(Suit.values()[s], n);	// add card to deck
					c++;
				}
			}
		}
		
		if (shuffle)													// shuffle, if necessary
		{
			this.shuffle();
		}
	}

	/**
	 * Shuffle deck by randomly swapping pairs of cards
	 */
	public void shuffle() 
	{
		Random rng = new Random();										// initialize random number generator
		
		Card temp;														// temporary card for shuffling
		
		int j;
		for (int i = 0; i < this.numCards; i++)
		{
			j = rng.nextInt(this.numCards);								// get random card j to swap i's value
																		// swap cards:
			temp = this.myCards[i];										// store card value in temp card
			this.myCards[i] = this.myCards[j];							// store random j's value in i
			this.myCards[j] = temp;										// store temp (holds i) to j
						
		}
	}

	/**
	 * Deal the next card from the top of the deck
	 * @return the next card
	 */
	public Card dealNextCard()
	{
		Card top = this.myCards[0];										//get top card in position 0
		
		for (int c = 1; c < this.numCards; c++)							//shift all cards up 1 position
		{
			this.myCards[c-1] = this.myCards[c];						
		}
		this.myCards[this.numCards-1] = null;							//clear out last card to remove it
		this.numCards--;												//reduce number of cards in deck by 1
				
		return top;
	}

	/**
	 * Print the top cards in the deck
	 * 	 @param numToPrint	the number of cards from the top of the deck to print
	 */
	public void printDeck(int numToPrint)
	{
		for (int c = 0; c < numToPrint; c++)
		{																
			System.out.printf("% 3d/%d %s\n", c+1, this.numCards, this.myCards[c].toString());
		}
		System.out.println("  ");
	}
	
}

