package com.nationwide.walker.blackjack;
import java.util.ArrayList;



public class StartBlackjack {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player(deck));
		players.add(new Player(deck));
		int highestHand;
		
		for (Player p : players){
			if (players.indexOf(p) == 0){
				System.out.print("Dealer:      ");
			}
			else {
				System.out.print("Player  " + players.indexOf(p) + ":   ");
			}
			p.printHand();
		}
		
		Player.highestHand(players);
		highestHand = Player.getWinner();
		if (highestHand == 0){
			System.out.println("Dealer wins.");
		}
		else {
			System.out.println("Player wins.");
		}
	}

}
