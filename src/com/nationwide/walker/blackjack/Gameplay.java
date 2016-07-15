package com.nationwide.walker.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Gameplay {
	
	static int winnerIndex;
	static ArrayList<Player> players = new ArrayList<Player>();
	
	
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

	
	
	public static int getWinner(){
		return winnerIndex;
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
	
	static Deck addPlayersCreateDeck(int playerCount, Deck deck){
		
		players.add(new Player(deck)); //Add dealer
		
		for (int i = 1; i <= playerCount; i++){
			players.add(new Player(deck));
		}
		
		for (Player p : players){
			p.setPlayerNumber(players.indexOf(p));
		}
		return deck;
	}
	
	static void startPlayerTurns(Scanner input){
		
		int playerAction;
		
		for (Player p : players){
			
			if (p.getPlayerNumber() == 0){
				;	//Do nothing if player is the Dealer
			}
			else{
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
	
	int playerCount;
	Scanner input = new Scanner(System.in);
	
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
	
	input.close();
	
	return playerCount;
	
	}
}
