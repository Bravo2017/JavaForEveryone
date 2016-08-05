package com.nationwide.blackjack3.mardis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BlackJackGame {

	
	public DeckofCards newDeck;
	public Player dealer;
	public ArrayList<Player> players;
	

	
	public void PlayBlackJack(){ 
		startGame();
		
		//display dealer first card and full hand of player
		
		//if player has 21, stop player options
		//ask player to enter HIT or STAND
		//continue to loop through until STAND or BUST
		
		for (Player p : players){
			if (totalOfHand(p.hand) == 21){
				System.out.println(p.getName() + " has BLACKJACK");
			}
		}
		
		if (totalOfHand(dealer.hand) == 21){
			System.out.println(dealer.getName() + " has BLACKJACK");
		}
		
		Scanner in = new Scanner(System.in);
		String choice="";
		
		for (Player p : players){
			do {
				System.out.println(p.getName() + " Do you want to Hit(H) or Stand(S)");
				choice = in.next();
				if (choice.equalsIgnoreCase("H")){
					newDeck.addCardtoHand(p);
					System.out.println(p.getName() + " hand is " + displayHand(p.hand));
				}
			} while (choice.equalsIgnoreCase("H") && totalOfHand(p.hand) < 21);
		}
		
		//check dealer hand, if 17 or over stop
		//otherwise keep hitting until 17 or over or BUST
		
		if (totalOfHand(dealer.hand) < 17){
			do {
				newDeck.addCardtoHand(dealer);
			}
			while (totalOfHand(dealer.hand) < 17);
		}
		System.out.println(dealer.getName() + " hand is " + displayHand(dealer.hand));


		//check hand for winner
		for (Player p : players){
			String handThatWins = compareHands(dealer.hand, p.hand);
			if (handThatWins == "Dealer"){
				System.out.println(dealer.getName() + " wins");
			} else if (handThatWins == "Push"){
				System.out.println("Tie.  Hand is pushed");
			}
				else {
				System.out.println(p.getName() + " wins");
			}
		}
	
	}
	

	public void startGame (){
		
		shuffleDeck();
		assignPlayers();
		dealInitialHand();
	}
	
	public void shuffleDeck (){
		newDeck = new DeckofCards();
		Collections.shuffle(newDeck.deck);
		
	}
	
	public void assignPlayers (){
		//create a dealer and a player
		dealer = new Player();
		dealer.setName("Dealer");
		
		players = new ArrayList<Player>();
		
		Scanner pIn = new Scanner(System.in);
		System.out.println("How many players?");
		
		int numPlayers = 0;
		
		numPlayers = pIn.nextInt();
		pIn.nextLine();
		
		for (int x=1; x <= numPlayers; x++){
			System.out.println("What is the name of player " + x);
			Player player = new Player();
			player.setName(pIn.nextLine());
			players.add(player);
		}

		//pIn.close();
	}
	
	public void dealInitialHand (){

		// deal deck of cards
		//dealer.name = "Dealer";
		newDeck.addCardtoHand(dealer);
		newDeck.addCardtoHand(dealer);
		System.out.println(dealer.getName() + " hand is " + dealer.hand.get(0).cardNumber + " " + dealer.hand.get(0).suit + " and ?");

		for (Player p : players){
			newDeck.addCardtoHand(p);
			newDeck.addCardtoHand(p);
			System.out.println(p.getName() + " hand is " + p.hand.get(0).cardNumber + " " + p.hand.get(0).suit + " and " +
				p.hand.get(1).cardNumber + " " + p.hand.get(1).suit);
		}
		
		
	}
	
	
	public String compareHands (ArrayList<Card> dealerHand, ArrayList<Card> playerHand){

		int dealerTotal = totalOfHand(dealerHand);
		int playerTotal = totalOfHand(playerHand);

		System.out.println(dealer.getName() + " total is " + dealerTotal);
		//System.out.println(player1.getName() + " total is " + playerTotal);
		System.out.println("Player " + " total is " + playerTotal);
		
		if (dealerTotal > playerTotal){
			return "Dealer";
		}
		else if (dealerTotal == playerTotal){
			return "Push";
		}
		return "Player";
		
	}
	
	public int totalOfHand (ArrayList<Card> hand){
		int handTotal = 0;
		int acesCount = 0;
		
		// need to account for an ace being 1 or 11
		
		for (Card h: hand){
			handTotal = handTotal + h.cardValue;
			if (h.cardValue == 11){
				acesCount++;
			}
		}
		if (acesCount > 1){
			handTotal = handTotal - (10 * (acesCount -1));
		}

		if (handTotal > 21){
			if (acesCount > 0){
				handTotal = handTotal - 10;
			}
		}
		return handTotal;
		
	}
	
	public String displayHand (ArrayList<Card> hand){
		
		String displayHandLine = "";
		
		for (Card x : hand){
			displayHandLine = displayHandLine + x.cardNumber + " " + x.suit + ", ";
		}
		

		return displayHandLine;
	}
}

