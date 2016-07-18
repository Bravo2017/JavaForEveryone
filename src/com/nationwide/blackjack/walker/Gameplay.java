package com.nationwide.blackjack.walker;

import java.util.ArrayList;
import java.util.Scanner;

public class Gameplay {
	
	static Dealer dealer = new Dealer();
	static ArrayList<Player> players = new ArrayList<Player>();
	static Deck deck = new Deck();

	static int playerCount;
	static int winnerIndex;
	
	static Scanner input = new Scanner(System.in);
	
	public static void highestHand(){
	    int highest = 0;

		for (Player p : players){
			if ((p.getValue() > highest) && (p.getValue() <= 21)){
				highest = p.getValue();
				winnerIndex = players.indexOf(p);
			}
		}
		
		if (dealer.getValue() > highest){
			highest = dealer.getValue();
			System.out.println("The Dealer wins.");
		}
		else{
			System.out.println("Player " + players.get(winnerIndex).getPlayerNumber() + " wins.");
		}
		
	}
	
	
	static void printAllHands(){

		dealer.printHand();
		
		for (Player p : players){
			System.out.print("Player  " + p.getPlayerNumber() + ":   ");
			
			p.printHand();
			
			if (p.getValue() > 21){
				System.out.println("Player " + p.getPlayerNumber() + " has gone bust.");
				players.remove(p);
			}
		}
	}
	
	
	static ArrayList<Player> addPlayers(){
		
		players.add(new Player()); //Add dealer
		
		for (int i = 1; i < playerCount; i++){
			players.add(new Player());
		}
		
		for (Player p : players){
			p.setPlayerNumber(players.indexOf(p) + 1);
		}
		
		return players;
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
				p.playerHit();
			}
			
			else {}
			
		}
			
	}
	
	static void inputPlayerCount() {
	
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
	
	}
	
	static void dealHands(){
		
		dealer.addCard(deck.getTopCard());
		dealer.addCard(deck.getTopCard());
		
		for (Player p : players){
			p.addCard(deck.getTopCard());
			p.addCard(deck.getTopCard());
		}
		
	}
	
}
