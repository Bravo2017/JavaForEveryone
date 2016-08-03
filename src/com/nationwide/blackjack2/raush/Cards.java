package com.nationwide.blackjackFinal2;
/**
 * 
 * Cards suit and number
 * 
 * @author D. Raush
 *
 */

public class Cards {
	
	private Suits cardSuit;
	private int cardNum;
	private String[] numString = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	
	/**
	 * Cards constructor
	 * @param sType
	 * @param sNum
	 */
	public Cards(Suits stype, int svalue){
		 
		this.cardSuit = stype;
		
		if(svalue >=1 && svalue <= 13)
			this.cardNum  = svalue;
		else{
			
			System.err.println(svalue  +" is not a valid card number\n");
			System.exit(1);
		}
	}
	
	public int getCardNumber(){
		
		return this.cardNum;
	}
	
	public String toString(){
		
		return this.numString[this.cardNum - 1] + " of " + this.cardSuit.toString();
	}
	
	
	
}