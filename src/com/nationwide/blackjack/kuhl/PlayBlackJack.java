package com.nationwide.blackjack.kuhl;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayBlackJack {

	private static int bet;
	private static int AceCounter;
	private static ArrayList<Card> playersHand;
	private static ArrayList<Card> dealersHand;

	private static String name;

	public static void main(String[] args) {
		System.out.println("Hi! What is your name?");
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		System.out.println("Hello, " + name + ", lets play some BlackJack!");
		System.out.println("What is Your Bet?");
		Scanner money = new Scanner(System.in);
		bet = money.nextInt();

	}
}
