package com.nationwide.blackjack.walker;

import java.util.ArrayList;
import java.util.Scanner;

public class Gameplay {
	
	static Deck deck = new Deck();
	static Dealer dealer = new Dealer();
	static ArrayList<Player> players = new ArrayList<Player>();

	static int playerCount;
	static int winnerPlayerNumber;
	
	static Scanner input = new Scanner(System.in);
	
	/*
	public static void findHighestHand(){
		
	    int highestHandValue = 0;

		for (Player p : players){
			if ((p.getHandValue() > highestHandValue) && (p.getHandValue() <= 21)){
				highestHandValue = p.getHandValue();
				winnerPlayerNumber = p.getPlayerNumber();
			}
		}
		
		if (dealer.getHandValue() > highestHandValue){
			highestHandValue = dealer.getHandValue();
			System.out.println("The Dealer wins.");
		}
		else{
			System.out.println("Player " + winnerPlayerNumber + " wins.");
		}
		
	}
	*/
	
	static void printAllHands(){

		dealer.printHand();
		
		for (Player p : players){

			p.printHand();
			
			if (p.getHandValue() == -1 ){
				System.out.println("Player " + p.getPlayerNumber() + " has gone bust.");
				players.remove(p);
			}
		}
		System.out.println("");
		
	}
	
	
	static void addPlayers(){
		
		for (int i = 1; i <= playerCount; i++){
			players.add(new Player(i));
		}
		
	}
	
	static void startPlayerTurns(){
		
		int playerAction;
		
		for (Player p : players){
			
			System.out.print("Player " + p.getPlayerNumber() + "'s turn (1. Hit 2. Stay)");
			playerAction = input.nextInt();

			while ((playerAction < 1) || (playerAction > 2)){
				System.out.print("Invalid action. Please re-enter: ");
				playerAction = input.nextInt();
			}
				
			if (playerAction == 1){
				p.addCard(deck.getTopCard());
			}
			
			else {}
			
		}
			
	}
	
	static void inputPlayerCount() {
	
		System.out.print("How many players (1-6)? ");
		
		playerCount = input.nextInt();
		
		while ((playerCount < 1) || (playerCount > 6)){
			System.out.print("Invalid player count. Please re-enter (1-6): ");
			playerCount = input.nextInt();
		} 
		
		System.out.println("");
	
	}
	
	static void dealHands(){
		
		boolean isFaceDown = true;
		
		for (Player p : players){
			p.addCard(deck.getTopCard());
		}
		
		dealer.addCard(deck.getTopCard());
		
		for (Player p : players){
			p.addCard(deck.getTopCard());
		}
		
		dealer.addCard(deck.getTopCard(isFaceDown));
		
	}
	
	static void checkForBlackjack(){
		
		for (Player p : players){
			if (p.getHandValue() == 21){
				double winnings = p.getBet() * 1.5;
				p.addWinnings(winnings);
				System.out.println("Player " + p.getPlayerNumber() + " has a blackjack and has won " + winnings + ".");
			}
		}
		
	}
	
	static void placeBets(){
		
		for (Player p : players){
			System.out.print("Player " + p.getPlayerNumber() + " enter bet: ");
			p.setBet(input.nextDouble());
			
			while ((p.getBet() < 1) || (p.getBet() > p.getChipValue())){
				System.out.print("Invalid bet. Please re-enter: ");
				p.setBet(input.nextDouble());
			}
			
		}
	}
	
}
