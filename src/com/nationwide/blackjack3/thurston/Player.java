package com.nationwide.blackjack3.thurston;

public class Player {

	/**
	 * @param args
	 */

	int playerHand = 0;
	int playerAces = 0;
	int playerMoney = 100;
	int playerBet ;
	String playerName;

	public Player() {
	}
	
	public static void createPlayers(int x){
		if (x >= 1){
			Player player1 = new Player();
			player1.playerName = "Player 1";
			BlackJack6.allPlayerNames.add(player1.playerName);
		}

		if (x >= 2) {
			Player player2 = new Player();
			player2.playerName = "Player 2";
			BlackJack6.allPlayerNames.add(player2.playerName);

		}
		
		if (x >= 3){
			Player player3 = new Player();
			player3.playerName = "Player 3";
			BlackJack6.allPlayerNames.add(player3.playerName);
		
		}
	
		if (x >= 4){
			Player player4 = new Player();
			player4.playerName = "Player 4";
			BlackJack6.allPlayerNames.add(player4.playerName);
		}
	}
	

}
