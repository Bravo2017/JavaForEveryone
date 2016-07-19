package com.nationwide.blackjack.walker;


public class Dealer extends Player{
	
	public Dealer(){
		playerNumber = 0;
	}
	
	public void printHand(){
		
		// format this line?
		System.out.print("*Dealer*:     ");
		
		for (Card card : playerHand){
			
			String format = "";
			
			if ( !card.isFaceDown()){
				format = card.getValue() + " of " + card.getSuit();
			}
			else{
				format = "*Face Down*";
			}
			while (format.length() < 18){
					format = format + " ";
			}
			System.out.print(format);
		}
		
		System.out.println("");
		
	}

}
