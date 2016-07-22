package com.nationwide.blackjack.walker;

import java.util.Scanner;

public class StartBlackjack {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String dealNewHand = "";

		System.out.println("Welcome to Blackjack!");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");

		Gameplay.inputPlayerCount();
		Gameplay.addPlayers();

		while (dealNewHand != "n") {

			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------");
			System.out.println("");

			Gameplay.placeBets();

			System.out.println("");

			Gameplay.dealHands();
			Gameplay.printAllHands();

			Gameplay.checkForBlackjack();
			System.out.println("");

			Gameplay.startTurns();
			Gameplay.settleBets();

			System.out.println("");
			System.out.print("Deal again? (y/n): ");
			dealNewHand = input.next();
			System.out.println("");

			// For some reason the loop control doesn't work without
			// a second assignment statement?
			if (dealNewHand.equals("n")) {
				dealNewHand = "n";
			} else {
				Gameplay.resetTable();
			}

		}

		input.close();
		Gameplay.input.close();

	}

}
