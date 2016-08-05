package com.nationwide.blackjack3.nelson;

/**
 * An implementation of a card which is defined by a suit and number
 * @author NELSOT17
  */
public class Card 
{
	
	private Suit mySuit;						
	private int myNumber;						
	
	/**
	 * Card Constructor
	 * @param aSuit		the suit of the card
	 * @param aNumber	the number of the card
	 */
	public Card(Suit aSuit, int aNumber)
	{
		this.mySuit   = aSuit;
		this.myNumber = aNumber;
	}
	
	/**
	 * Return the number of the card
	 * @return the number
	 */
	public int getNumber()
	{
		return myNumber;
	}

	/**
	 * Override String class for Card class to return number and suit string
	 */
	public String toString()
	{
		String numStr = " ";

		switch(this.myNumber)
		{
		case 1:
			numStr = "Ace";
			break;
		case 2:
			numStr = "Two";
			break;
		case 3:
			numStr = "Three";
			break;
		case 4:
			numStr = "Four";
			break;
		case 5:
			numStr = "Five";
			break;
		case 6:
			numStr = "Six";
			break;
		case 7:
			numStr = "Seven";
			break;
		case 8:
			numStr = "Eight";
			break;
		case 9:
			numStr = "Nine";
			break;
		case 10:
			numStr = "Ten";
			break;
		case 11:
			numStr = "Jack";
			break;
		case 12:
			numStr = "Queen";
			break;
		case 13:
			numStr = "King";
			break;
		}
		return numStr + " of " + mySuit.toString();
	}

}


