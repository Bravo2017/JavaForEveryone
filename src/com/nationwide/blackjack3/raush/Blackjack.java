package com.nationwide.blackjackFinal3;

/* this class contains main function
 * @author D Raush
 *
 */
/*	Requirements
 2 players (one dealer)
 Create a hand for each
 hand is two cards
 52 card deck
 Evaluate winner

 xAdd suit
 xAdd options to hit and stay
 xThe dealer must draw on 16 and stay on 17
 xAdd the Ace value determination

 xBust if over 21
 Multiple players(1-4)
 xBetting with standard payout, double your money if you win
 xDeal from the top of the deck
 * 
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Blackjack {

	private Deck newDeck;
	private float balance;
	private float bet;
	private boolean playerDone;
	private boolean dealerDone;
	private Players dealer;
	private Players player;
	private Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {

		String numPlayers;
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many Players in game (1-4):\n");
		numPlayers = scanner.nextLine();

		int numPlayer = Integer.parseInt(numPlayers);

		new Blackjack(numPlayer);

		scanner.close();
	}

	Blackjack(int nPlayer){
		
		this.balance = 100;
		this.newDeck = new Deck();
		boolean gameOver = false;
		int numPlayers = nPlayer;
				
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Each Player has got 100 chips for playing. -");
		System.out.println("--------------------------------------------------------------------------------------");
		
		// Players init
		player = new Players("Player1");
		dealer = new Players("Dealer");
		
		
		// Game Starts here --->
		while(this.balance > 0 &&  !gameOver){
					
			System.out.println("\n" +  " Do you want to DEAL [D] or END [E] the game?");
			String gameInit = sc.next();
					
			if(gameInit.compareToIgnoreCase("D") == 0){
					
				this.dealTheGame();			
			}
			else{
						
				gameOver = true;
			}	
		}
		
		System.out.println("\n" + " Game Ended ");
		
		// To play again
		System.out.println("\n"+ "Do you want to play again [Y or N]");
		String Y = sc.next();
		if(Y.compareToIgnoreCase("Y") == 0){
			
			new Blackjack(numPlayers);
		}else {
				System.out.println("\n" + "Have a good day ");
			}
		
		//closing scanner
		sc.close();
		
}
	// Deal the game
	private void dealTheGame() {

		boolean blackjack = false;
		this.bet = 0;

		System.out.printf("\nBalance:$%.1f\n", this.balance);
		String msg = "Enter your bet for this game:";

		while (this.bet <= 0) {

			try {

				System.out.println("\n" + msg);
				this.bet = sc.nextFloat();
			} catch (InputMismatchException e) {

				// System.err.println("Caught InputMismatchException: " +
				// e.getMessage());
				// throw e;
				sc.nextLine();
			} finally {

				msg = "Enter your bet in whole dollars please:";
			}
		}

		if ((this.bet >= 1) && (this.bet % 1 == 0)
				&& (this.balance - this.bet >= 0)) {

			this.balance = this.balance - this.bet;

			// players start with empty hands
			player.emptyHand();
			dealer.emptyHand();

			this.playerDone = false;
			this.dealerDone = false;

			// Deal 2 cards to each player
			player.addCardToPlayersHand(newDeck.dealingNextCard());
			dealer.addCardToPlayersHand(newDeck.dealingNextCard());
			
			player.addCardToPlayersHand(newDeck.dealingNextCard());
			dealer.addCardToPlayersHand(newDeck.dealingNextCard());

			// Print the cards dealt
			dealer.printCardsInHand(false);
			player.printCardsInHand(true);

			System.out.printf("Your Score:%d\t", player.getPlayersHandTotal());
			System.out.printf("Bet:$%.0f\t", this.bet);
			System.out.printf("Balance:$%.1f\n\n", this.balance);

			// checking state on initial card -- if BlackJack
			blackjack = this.checkIfBlackJack();

			while (!this.playerDone || !this.dealerDone) {

				if (!this.playerDone) {

					this.playerPlay();

				} else if (!this.dealerDone) {

					this.dealersPlay();
				}

				System.out.println();
			}

			if (!blackjack) {

				this.evaluateWinner();
			}
		} else {

			System.out
					.println("\nYour bet amount is not valid, it must be a whole number and should not exceed your balance");
			System.out.printf("Your Balance:$%.1f\n\n", this.balance);
		}

	}

	// Check for 21 on initial cards
	private boolean checkIfBlackJack() {

		boolean blackJack = false;

		if (player.getPlayersHandTotal() == 21) {

			this.playerDone = true;
			this.dealerDone = true;
			blackJack = false;
			
			if (player.getPlayersHandTotal() > dealer.getPlayersHandTotal()	// player has 21, dealer does not
					|| dealer.getPlayersHandTotal() > 21) {

				System.out.println("\t- Blackjack, YOU WON            -");

				dealer.printCardsInHand(true);

				System.out.printf("Dealer's Score:%d\n\n",
						dealer.getPlayersHandTotal());
				
				System.out.printf("Your Bet was :$%.0f\t", this.bet);
				System.out.printf("Your Balance was:$%.1f\n", this.balance);
				System.out.printf("You win[3:2]:$%.1f\t", (3 * this.bet) / 2);

				this.balance = this.balance + (3 * this.bet) / 2 + this.bet;
				System.out
						.printf("Your Current Balance:$%0.1f\n", this.balance);

				blackJack = true;
			} else {														//Player has 21, dealer has 21

				dealer.printCardsInHand(true);

				System.out.printf("Dealer's Score:%d\n\n",
						dealer.getPlayersHandTotal());
				System.out.println("\t--- PUSH ---");
				
			}
		} else if (dealer.getPlayersHandTotal() == 21) {				//Dealer has 21, player does not
			this.playerDone = true;
			this.dealerDone = true;
			blackJack = false;
			

			dealer.printCardsInHand(true);
			System.out.printf("Dealer's Score:%d\n\n",
					dealer.getPlayersHandTotal());

			System.out.println("\t- Dealer's Blackjack, YOU LOST  -");

			this.dealerDone = true;
			
		}

		return blackJack;
	}

	// Player's Play Turn
	private void playerPlay() {

		String answer;
		
		if (this.balance >= this.bet) {

			System.out
					.print("Hit [H] or Stay [S]?");
		} 
		
		answer = sc.next();
		System.out.println();

		if (answer.compareToIgnoreCase("H") == 0) {

			this.hit();
		
		} else {

			this.stay();
		}
	}

	// Player's Hit
	private void hit() {

		System.out.println("\t Player Choose to Hit.\n");
		playerDone = !player.addCardToPlayersHand(newDeck.dealingNextCard());
		player.printCardsInHand(true);
		System.out.printf("Your Score:%d\t", player.getPlayersHandTotal());
		System.out.printf("Bet:$%.0f\t", this.bet);
		System.out.printf("Balance:$%.1f\n\n", this.balance);

		if (player.getPlayersHandTotal() > 21) {

			System.out.println("\t- YOU BUSTED -");
			dealer.printCardsInHand(true);
			System.out.printf("Dealer's Score:%d\n\n",
					dealer.getPlayersHandTotal());
			playerDone = true;
			dealerDone = true;
		}

	}

	// Player's Stay
	private void stay() {

		System.out.println("\tYou Choose to Stay, Dealer's turn \n");
		playerDone = true;
	}

	
	// Dealer's Play Turn
	private void dealersPlay() {

		if (dealer.getPlayersHandTotal() < 17) {

			dealer.printCardsInHand(true);
			System.out.printf("Dealer's Score:%d\n\n",
					dealer.getPlayersHandTotal());
			System.out.println("\tDealer Hits \n");
			dealerDone = !dealer
					.addCardToPlayersHand(newDeck.dealingNextCard());

			if (dealer.getPlayersHandTotal() > 21) {

				dealer.printCardsInHand(true);
				System.out.printf("Dealer's Score:%d\n\n",
						dealer.getPlayersHandTotal());
				System.out.println("\t- DEALER BUSTED -");
				dealerDone = true;
			}
		} else {

			dealer.printCardsInHand(true);
			System.out.printf("Dealer's Score:%d\n\n",
					dealer.getPlayersHandTotal());
			System.out.println("\tDealer Stays \n");
			dealerDone = true;
		}
	}

	// Deciding a Winner
	private void evaluateWinner() {

		int youSum = player.getPlayersHandTotal();
		int dealerSum = dealer.getPlayersHandTotal();

		if (youSum > dealerSum && youSum <= 21 || dealerSum > 21) {

			System.out.println("\t- YOU WON  -");
			System.out.printf("Your Bet was :$%.0f\t", this.bet);
			System.out.printf("Your Balance was:$%.1f\n", this.balance);
			System.out.printf("You win[1:1] :$%.0f\t", this.bet);

			this.balance = this.balance + this.bet + this.bet;
			System.out.printf("Your Current Balance:$%.1f\n", balance);

		} else if (youSum == dealerSum) {
			System.out.println("\t-   PUSH   -");
			this.balance = this.balance + this.bet;
			System.out.printf("Your Current Balance:$%.1f\n", this.balance);
		} else {

			System.out.println("\t- YOU LOST -");
			System.out.printf("You lose[1:1]: $%.0f!!\n", this.bet);
			System.out.printf("Your Current Balance:$%.1f\n", this.balance);
		}
	}

}