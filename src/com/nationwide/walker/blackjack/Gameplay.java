package com.nationwide.walker.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Gameplay {
	
	static Dealer dealer = new Dealer();
	static ArrayList<Player> players = new ArrayList<Player>();

	static int playerCount;
	static int winnerIndex;
	
	static Scanner input = new Scanner(System.in);
	
	public static int highestHand(ArrayList<Player> players){
	    int highest = 0;

		for (Player p : players){
			if ((p.getValue() > highest) && (p.getValue() < 21)){
				highest = p.getValue();
				winnerIndex = players.indexOf(p);
			}
		}
		return highest;
	}
	
	static void printAllHands(){
		
		for (Player p : players){
			
			if (p.getPlayerNumber() == 0){
				System.out.print("Dealer:      ");
			}
			
			else {
				System.out.print("Player  " + p.getPlayerNumber() + ":   ");
			}
			
			p.printHand();
			
			if (p.getValue() > 21){
				System.out.println("Player " + p.getPlayerNumber() + " has gone bust.");
				players.remove(p);
			}
			
		}
	}
	
	static ArrayList<Player> addPlayers(int playerCount){
		
		players.add(new Player()); //Add dealer
		
		for (int i = 1; i < playerCount; i++){
			players.add(new Player());
		}
		
		for (Player p : players){
			p.setPlayerNumber(players.indexOf(p) + 1);
		}
		
		return players;
	}
	
	static Dealer addDealer(){
		dealer = new Dealer();
		return dealer;
	}
	
	static void startPlayerTurns(){
		
		int playerAction;
		
		for (Player p : players){
			
			if (p.getPlayerNumber() == 0){
				;	//Do nothing if player is the Dealer
			}
			
			else{
				//Scanner input = new Scanner(System.in);
				
				System.out.print("Player " + p.getPlayerNumber() + "'s turn (1. Hit 2. Stay)");
				
				playerAction = input.nextInt();

				while ((playerAction < 1) || (playerAction > 2)){
					System.out.print("Invalid action. Please re-enter: ");
					playerAction = input.nextInt();
				}
				
			if (playerAction == 1){
				p.playerHit();
			}
			
			else {}
			
			}
				
		}
			
	}
	
	static int getPlayerCount() {
	
		System.out.println("Welcome to Blackjack!");
		System.out.println("");
		System.out.println("");
		System.out.print("How many players (1-6)? ");
		
		playerCount = input.nextInt();
		
		while ((playerCount < 1) || (playerCount > 6)){
			System.out.print("Invalid player count. Please re-enter (1-6): ");
			playerCount = input.nextInt();
		} 
		
		System.out.println("");
		System.out.println("");
	
	
	return playerCount;
	
	}
	
	static void dealHands(Deck deck){
		
		dealer.dealerHand.add(deck.getTopCard());
		dealer.dealerHand.add(deck.getTopCard());
		
		for (Player p : players){
			p.addCard(deck.getTopCard());
			p.addCard(deck.getTopCard());
		}
		
	}
	
}
