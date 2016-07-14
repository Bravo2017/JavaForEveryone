package com.nationwide.walker.blackjack;
//import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class StartBlackjackFinal {

	public static void main(String[] args) {

		Deck deck = new Deck();
		Scanner input = new Scanner(System.in);
		int playerCount = 0;
		ArrayList<Player> players = new ArrayList<Player>();
		
		System.out.println("Welcome to Blackjack!");
		System.out.println("");
		System.out.println("");
		System.out.print("How many players (1-6)? ");
		playerCount = input.nextInt();
		
		while ((playerCount < 1) || (playerCount > 6)){
			System.out.print("Invalid player count. Please re-enter (1-6): ");
			playerCount = input.nextInt();
		} 
		
		for (int i = 1; i <= playerCount; i++){
			players.add(new Player(deck));
		}
		
		for (Player p : players){
			p.setPlayerNumber(players.indexOf(p));
		}
		
		for (Player p : players){
			if (players.indexOf(p) == 0){
				System.out.print("Dealer:      ");
			}
			else {
				System.out.print("Player  " + players.indexOf(p) + ":   ");
			}
			p.printHand();
		}
		
	}

}
