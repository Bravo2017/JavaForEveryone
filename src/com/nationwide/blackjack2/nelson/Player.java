package com.nationwide.blackjack2.nelson;

/**
 * An implementation of a blackjack player
 * 
 * @author NELSOT17
 */
public class Player {

	private String name; // player's name

	private Card[] hand = new Card[10]; // maximum number of cards a player can
										// have in one hand
										// hard-coding to 10 - if change, make
										// change below
	private int numCards; // the number of cards in the hand

	/*
	 * Constructor
	 * 
	 * @param aName the name of the player
	 */
	public Player(String aName) {
		this.name = aName;
		this.emptyHand(); // initialize an empty hand
	}

	/**
	 * Reset the player's hand to have no cards
	 */
	public void emptyHand() {
		for (int c = 0; c < 10; c++) // hard-coded maximum of 10 cards per hand
		{
			this.hand[c] = null;
		}
		this.numCards = 0;
	}

	/**
	 * Add a card to the player's hand
	 * 
	 * @param aCard
	 *            the card to add
	 * @return true/false whether the sum of the new hand if below or equal to
	 *         21
	 */
	public boolean addCard(Card aCard) {
		// print error if we already have the max number of cards
		if (this.numCards == 10) // hard-coded maximum of 10 cards per hand
		{
			System.err.printf("%s's hand already has 10 cards; "
					+ "cannot add another\n", this.name);
			System.exit(1);
		}

		// add new card in next slot and increase number of cards counter
		this.hand[this.numCards] = aCard;
		this.numCards++;

		return (this.getHandSum() <= 21); // return true if okay; false if bust

	}

	/**
	 * Get the sum of the cards in the player's hand
	 * 
	 * @return the sum
	 */
	public int getHandSum() {
		int handSum = 0;
		int cardNum = 0;
		int numAces = 0;

		for (int c = 0; c < this.numCards; c++) // loop to add card's points to
												// hand sum
		{
			cardNum = this.hand[c].getNumber(); // get current card number (see
												// Card class)

			if (cardNum == 1) // Ace card is worth 11 points
			{
				numAces++;
				handSum += 11;
			} else if (cardNum > 10) // face cards are worth 10 points
			{
				handSum += 10;
			} else {
				handSum += cardNum; // small cards are worth their value
			}
		}

		// if handSum is over 21 and we have aces, set some/all of them to value
		// 1
		while (handSum > 21 && numAces > 0) {
			handSum -= 10;
			numAces--;
		}

		return handSum;
	}

	/**
	 * Print the cards in the player's hand
	 * 
	 * @param showFirstCard
	 *            whether the first card is shown or not
	 */
	public void printHand(boolean showFirstCard) {
		System.out.printf("%s's cards:\n", this.name);
		for (int c = 0; c < this.numCards; c++) {
			if (c == 0 && !showFirstCard) {
				System.out.println(" card is face down");
			} else {
				System.out.printf(" %s\n", this.hand[c].toString());
			}
		}
	}
}
