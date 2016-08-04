package com.nationwide.blackjack3.defenbaugh;

public class Player {
	
	private String playerName;
	private int playerNumber;
		
	private String[] playerArray = new String[5];
	
	private Card[] playerHand = new Card[10];
	
	//private ArrayList<Card> playerHand;
	private int numberOfCards;
	
	public Player (String name){
		
		playerName = name;
		resetHand();
		
	}
	
	public void resetHand(){
		for (int c = 0; c < 10; c++) {
			this.playerHand[c] = null;
		}
		this.numberOfCards = 0;
	}
	
	/*
	public void resetHand(){
		int i = 0;
		while (i < playerHand.size()) {      
			playerHand.remove(i);   
			i++;   
		}
		numberOfCards = 0;
	}
	*/
	
	
	public boolean addCard(Card aCard){
		
		//playerHand.add(aCard);
		if (this.numberOfCards == 10) {
			System.out.println("The maximum number of cards in this hand have been reached.");
		} else {
			// numberOfCards identifies the element of the playerHand array to populate
			// aCard is the card to be added
			playerHand[numberOfCards] = aCard;
			numberOfCards++;
		}
		return (getHandTotal() <= 21);
	}
	
	public int getHandTotal(){
		
		int handTotal = 0;
		int cardValue = 0;
		int numberOfHighAces = 0;
		
		for (int c = 0; c < numberOfCards; c++){
						
			//Card thisCard = playerHand[c].getNumber();
			
			cardValue = this.playerHand[c].getNumber();
		
			if (cardValue == 1){				
				numberOfHighAces++;
				handTotal += 11;
			} else if (cardValue > 10) {
				handTotal += 10;
			} else {
				handTotal += cardValue;
			}	
		}
		
		while (handTotal > 21 && numberOfHighAces > 0){
			handTotal -= 10;
			numberOfHighAces--;
		} 
		
		return handTotal;
	}
	
	public void showHand(boolean showFirstCard){
		
		System.out.printf("%s's cards:\n", playerName);
		
		for (int c = 0; c < numberOfCards; c++) {
			if (c == 0 && !showFirstCard) {
				System.out.println("[hidden]");
			} else {
				System.out.println( playerHand[c].toString());
			}
		}
		System.out.println();
	}
}

