package com.nationwide.blackjack3.vanwyk;

//creating one class for either player or dealer
public class Player {
private String name;
	
	private Card[] hand = new Card[10];
	
	private int cardTotal;
	
	//constructor
		public Player (String aName){
			this.name = aName;
			
		}
		

	public boolean addCard(Card aCard){
		
		// add new cards 
		this.hand[this.cardTotal] = aCard;
		this.cardTotal++;
		
		return(this.gethandTotal() <= 21);
	}
	
	public int gethandTotal(){
		
		int handTotal = 0;
		int cardValue;
		int numAces = 0;
		
		//calculate each cards total in hand
		for (int c = 0; c < this.cardTotal; c++){
			
			cardValue = this.hand[c].getNumber();
			
			if (cardValue == 1){ //Ace
				numAces++;
				handTotal += 11;
			} else if (cardValue > 10){ //face card
				handTotal += 10;
			}else {
				handTotal += cardValue;
			}
		}
		
		//loop to decide how Ace functions
		while (handTotal > 21 && numAces > 0){
			handTotal -= 10;
			numAces--;
			
		}
		
		return handTotal;
	}
	
	
	public void printHand(){
		System.out.println(this.name);
		for(int c = 0; c < this.cardTotal; c++){
				System.out.println(this.hand[c].toString());
			}
		}
	}
