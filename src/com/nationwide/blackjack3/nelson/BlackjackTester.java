package com.nationwide.blackjack3.nelson;

import java.util.Scanner;

public class BlackjackTester {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				
		//Deck myDeck = new Deck(1, false);			// 1 deck with no shuffle
		//myDeck.printDeck(52);						// print first deck pre shuffle
		Deck myDeck = new Deck(1, true);			// 1 deck with shuffle
		//myDeck.printDeck(52);						// print first deck post shuffle

		System.out.println("Number of players including dealer?  (Enter 1 - 4): ");
		int numPlayers = sc.nextInt();
		if (numPlayers < 2 || numPlayers > 4)
		{
			System.out.println("Number of players incorrect, defaulting to 2");
			numPlayers = 2;
		}

		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		Player player3 = new Player("Player3");
		Player dealer  = new Player("Dealer");
		
		//deal two cards to each player
		player1.addCard(myDeck.dealNextCard());		//deal first card to player1
		if (numPlayers == 3 || numPlayers == 4)
		{
			player2.addCard(myDeck.dealNextCard());	//deal first card to player2
		}
		if (numPlayers == 4)
		{
			player3.addCard(myDeck.dealNextCard());	//deal first card to player3
		}
		dealer.addCard(myDeck.dealNextCard());		//deal first card to dealer
		
		player1.addCard(myDeck.dealNextCard());		//deal second card to player1
		if (numPlayers == 3 || numPlayers == 4)
		{
			player2.addCard(myDeck.dealNextCard());	//deal second card to player2
		}
		if (numPlayers == 4)
		{
			player3.addCard(myDeck.dealNextCard());	//deal second card to player3
		}
		dealer.addCard(myDeck.dealNextCard());		//deal second card to dealer
		
		//print initial hands for each player
		System.out.println("Cards are dealt\n");
		player1.printHand(true);					//show first card for player1
		if (numPlayers == 3 || numPlayers == 4)
		{
			player2.printHand(true);				//show first card for player2
		}
		if (numPlayers == 4)
		{
			player3.printHand(true);				//show first card for player3
		}
		
		dealer.printHand(false);					//don't show first card for dealer
		System.out.println("  ");
		
		// set flags needed 
		boolean player1Done = false;				// flag for when player1 is finished hitting
		boolean player2Done = false;				// flag for when player2 is finished hitting
		boolean player3Done = false;				// flag for when player3 is finished hitting
		boolean dealerDone = false;					// flag for when dealer is finished hitting
		String answer;								

		System.out.println("Player1's turn  ");
		while (!player1Done)
		{
			System.out.println("Hit or Stay?  (Enter H or S): ");
			answer = sc.next();
			System.out.println();
				
			// if the player1 hits
			if (answer.compareToIgnoreCase("H") == 0)
			{
				//add next card in deck and store whether player1 is busted
				player1Done = !player1.addCard(myDeck.dealNextCard());
				player1.printHand(true);			//print player1's hand
			}
			else
			{
				player1Done = true;					// player1 entered S for stay so done
			}
		}
	
		if (numPlayers == 3 || numPlayers == 4)
		{
			System.out.println("Player2's turn  ");
			while (!player2Done)
			{
				System.out.println("Hit or Stay?  (Enter H or S): ");
				answer = sc.next();
				System.out.println();
				
				// if the player2 hits
				if (answer.compareToIgnoreCase("H") == 0)
				{
					//add next card in deck and store whether player2 is busted
					player2Done = !player2.addCard(myDeck.dealNextCard());
					player2.printHand(true);		//print player2's hand
				}
				else
				{
					player2Done = true;				// player2 entered S for stay so done
				}
			}
		}
			
		if (numPlayers == 4)
		{
			System.out.println("Player3's turn  ");
			while (!player3Done)
			{
				System.out.println("Hit or Stay?  (Enter H or S): ");
				answer = sc.next();
				System.out.println();
				
				// if the player3 hits
				if (answer.compareToIgnoreCase("H") == 0)
				{
					//add next card in deck and store whether player3 is busted
					player3Done = !player3.addCard(myDeck.dealNextCard());
					player3.printHand(true);		//print player3's hand
				}
				else
				{
					player3Done = true;				// player3 entered S for stay so done
				}
			}
		}
			
		System.out.println("Dealer's turn  ");
		while (!dealerDone)
		{
			if (dealer.getHandSum() < 17) 			//dealer will draw card if sum 16 or less
			{
				System.out.println("The Dealer hits\n");
				dealerDone = !dealer.addCard(myDeck.dealNextCard());
				dealer.printHand(true);				//print dealer's hand
			}
			else
			{
				System.out.println("The Dealer stays\n");
				dealerDone = true;
			}
		}
		System.out.println(" ");
			
		// close scanner
		sc.close();
		
		// print final hand
		System.out.println("Final hands");
		player1.printHand(true);
		if (numPlayers == 3 || numPlayers == 4)
		{
			player2.printHand(true);				
		}
		if (numPlayers == 4)
		{
			player3.printHand(true);				
		}
		dealer.printHand(true);

		// get final sums of hands
		int player1Sum = 0;
		int player2Sum = 0;
		int player3Sum = 0;
		int player4Sum = 0;
		int dealerSum  = 0;
		
		player1Sum = player1.getHandSum();
		if (numPlayers == 3 || numPlayers == 4)
		{
			player2Sum = player2.getHandSum();
		}
		if (numPlayers == 4)
		{
			player3Sum = player3.getHandSum();
		}
		dealerSum = dealer.getHandSum();
		
		//Print hand sums
		System.out.println("Dealer has " + dealerSum + " Player1 has " + player1Sum +
				" Player2 has " + player2Sum + " Player3 has " + player3Sum);
		
		//see who the winner is between the dealer and player1
		if (dealerSum == 21)
		{
			if (player1Sum == 21)
			{
				System.out.println("Dealer ties with Player1 - this is a Push");
			}
			else
			{
				System.out.println("Dealer wins blackjack to Player1's " + player1Sum);
			}
		}
		else if (player1Sum > dealerSum && player1Sum <= 21 || dealerSum > 21)
		{
			System.out.println("Player1 wins with " + player1Sum +
					" to Dealer's " + dealerSum);
		}
		else
		{
			System.out.println("Dealer wins with " + dealerSum +
					" to Player1's " + player1Sum);
		}
		
		//see who the winner is between the dealer and player2
		if (player2Sum > 0)
		{
			if (dealerSum == 21)
			{
				if (player2Sum == 21)
				{
					System.out.println("Dealer ties with Player2 - this is a Push");
				}
				else
				{
					System.out.println("Dealer wins blackjack to Player2's " + player2Sum);
				}
			}
			else if (player2Sum > dealerSum && player2Sum <= 21 || dealerSum > 21)
			{
				System.out.println("Player2 wins with " + player2Sum +
					" to Dealer's " + dealerSum);
			}
			else
			{
				System.out.println("Dealer wins with " + dealerSum +
					" to Player2's " + player2Sum);
			}
		}
		
		//see who the winner is between the dealer and playey3
		if (player3Sum > 0)
		{
			if (dealerSum == 21)
			{
				if (player3Sum == 21)
				{
					System.out.println("Dealer ties with Player3 - this is a Push");
				}
				else
				{
					System.out.println("Dealer wins blackjack to Player3's " + player3Sum);
				}
			}
			else if (player3Sum > dealerSum && player3Sum <= 21 || dealerSum > 21)
			{
				System.out.println("Player3 wins with " + player3Sum +
					" to Dealer's " + dealerSum);
			}
			else
			{
				System.out.println("Dealer wins with " + dealerSum +
					" to Player3's " + player3Sum);
			}
		}

	}
}
