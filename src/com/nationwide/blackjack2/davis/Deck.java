package com.nationwide;

//this doesn't work
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	static ArrayList<Cards> deckCards;

	// String cn = deckCards.cardName;
	// String cs = deckCards.cardSuit;
	// int cp = deckcards.cardPoints;

	public Deck() { // constructor

		Cards ha = new Cards("ACE   HEARTS", "HEARTS", 11);
		Cards hk = new Cards("KING  HEARTS", "HEARTS", 10);
		Cards hq = new Cards("QUEEN HEARTS", "HEARTS", 10);
		Cards hj = new Cards("JACK  HEARTS", "HEARTS", 10);
		Cards h0 = new Cards("TEN   HEARTS", "HEARTS", 10);
		Cards h9 = new Cards("NINE  HEARTS", "HEARTS", 9);
		Cards h8 = new Cards("EIGHT HEARTS", "HEARTS", 8);
		Cards h7 = new Cards("SEVEN HEARTS", "HEARTS", 7);
		Cards h6 = new Cards("SIX   HEARTS", "HEARTS", 6);
		Cards h5 = new Cards("FIVE  HEARTS", "HEARTS", 5);
		Cards h4 = new Cards("FOUR  HEARTS", "HEARTS", 4);
		Cards h3 = new Cards("THREE HEARTS", "HEARTS", 3);
		Cards h2 = new Cards("TWO   HEARTS", "HEARTS", 2);

		Cards da = new Cards("ACE   DIAMONDS", "DIAMONDS", 11);
		Cards dk = new Cards("KING  DIAMONDS", "DIAMONDS", 10);
		Cards dq = new Cards("QUEEN DIAMONDS", "DIAMONDS", 10);
		Cards dj = new Cards("JACK  DIAMONDS", "DIAMONDS", 10);
		Cards d0 = new Cards("TEN   DIAMONDS", "DIAMONDS", 10);
		Cards d9 = new Cards("NINE  DIAMONDS", "DIAMONDS", 9);
		Cards d8 = new Cards("EIGHT DIAMONDS", "DIAMONDS", 8);
		Cards d7 = new Cards("SEVEN DIAMONDS", "DIAMONDS", 7);
		Cards d6 = new Cards("SIX   DIAMONDS", "DIAMONDS", 6);
		Cards d5 = new Cards("FIVE  DIAMONDS", "DIAMONDS", 5);
		Cards d4 = new Cards("FOUR  DIAMONDS", "DIAMONDS", 4);
		Cards d3 = new Cards("THREE DIAMONDS", "DIAMONDS", 3);
		Cards d2 = new Cards("TWO   DIAMONDS", "DIAMONDS", 2);

		Cards sa = new Cards("ACE   SPADES", "SPADES", 11);
		Cards sk = new Cards("KING  SPADES", "SPADES", 10);
		Cards sq = new Cards("QUEEN SPADES", "SPADES", 10);
		Cards sj = new Cards("JACK  SPADES", "SPADES", 10);
		Cards s0 = new Cards("TEN   SPADES", "SPADES", 10);
		Cards s9 = new Cards("NINE  SPADES", "SPADES", 9);
		Cards s8 = new Cards("EIGHT SPADES", "SPADES", 8);
		Cards s7 = new Cards("SEVEN SPADES", "SPADES", 7);
		Cards s6 = new Cards("SIX   SPADES", "SPADES", 6);
		Cards s5 = new Cards("FIVE  SPADES", "SPADES", 5);
		Cards s4 = new Cards("FOUR  SPADES", "SPADES", 4);
		Cards s3 = new Cards("THREE SPADES", "SPADES", 3);
		Cards s2 = new Cards("TWO   SPADES", "SPADES", 2);

		Cards ca = new Cards("ACE   CLUBS", "CLUBS", 11);
		Cards ck = new Cards("KING  CLUBS", "CLUBS", 10);
		Cards cq = new Cards("QUEEN CLUBS", "CLUBS", 10);
		Cards cj = new Cards("JACK  CLUBS", "CLUBS", 10);
		Cards c0 = new Cards("TEN   CLUBS", "CLUBS", 10);
		Cards c9 = new Cards("NINE  CLUBS", "CLUBS", 9);
		Cards c8 = new Cards("EIGHT CLUBS", "CLUBS", 8);
		Cards c7 = new Cards("SEVEN CLUBS", "CLUBS", 7);
		Cards c6 = new Cards("SIX   CLUBS", "CLUBS", 6);
		Cards c5 = new Cards("FIVE  CLUBS", "CLUBS", 5);
		Cards c4 = new Cards("FOUR  CLUBS", "CLUBS", 4);
		Cards c3 = new Cards("THREE CLUBS", "CLUBS", 3);
		Cards c2 = new Cards("TWO   CLUBS", "CLUBS", 2);

		deckCards.add(ha);
		deckCards.add(hk);
		deckCards.add(hq);
		deckCards.add(hj);
		deckCards.add(h0);
		deckCards.add(h9);
		deckCards.add(h8);
		deckCards.add(h7);
		deckCards.add(h6);
		deckCards.add(h5);
		deckCards.add(h4);
		deckCards.add(h3);
		deckCards.add(h2);
		deckCards.add(da);
		deckCards.add(dk);
		deckCards.add(dq);
		deckCards.add(dj);
		deckCards.add(d0);
		deckCards.add(d9);
		deckCards.add(d8);
		deckCards.add(d7);
		deckCards.add(d6);
		deckCards.add(d5);
		deckCards.add(d4);
		deckCards.add(d3);
		deckCards.add(d2);
		deckCards.add(sa);
		deckCards.add(sk);
		deckCards.add(sq);
		deckCards.add(sj);
		deckCards.add(s0);
		deckCards.add(s9);
		deckCards.add(s8);
		deckCards.add(s7);
		deckCards.add(s6);
		deckCards.add(s5);
		deckCards.add(s4);
		deckCards.add(s3);
		deckCards.add(s2);
		deckCards.add(ca);
		deckCards.add(ck);
		deckCards.add(cq);
		deckCards.add(cj);
		deckCards.add(c0);
		deckCards.add(c9);
		deckCards.add(c8);
		deckCards.add(c7);
		deckCards.add(c6);
		deckCards.add(c5);
		deckCards.add(c4);
		deckCards.add(c3);
		deckCards.add(c2);

	}

	public static int playerOneTotal = 0;
	public static int dealerTotal = 0;
	// need to allow for more than 1 Ace per player
	public static boolean aceDrawnPlayer = false;
	public static boolean aceDrawnDealer = false;
	public static int dealCard = 0;
	public static int rn = 0;
	public static int cardDrawn = 0;
	public static int playerHold = 18;

	public ArrayList<Cards> shuffleDeck() {
		Collections.shuffle(deckCards);
		// How do I know my deckCards worked?
		// System.out.println(Arrays.toString(deckCards));
		return deckCards;
	}

	public static void dealBlackJackCards() {
		System.out.print("Player 1's 1st ");
		dealCard();
		playerOneTotal = playerOneTotal + dealCard;

		System.out.print("\nDealer's 1st ");
		dealCard();
		dealerTotal = dealerTotal + dealCard;

		System.out.print("\nPlayer 1's 2nd ");
		dealCard();
		playerOneTotal = playerOneTotal + dealCard;

		System.out.print("\nDealer's 2nd ");
		dealCard();
		dealerTotal = dealerTotal + dealCard;
	}

	private static void dealCard() {
		// Random rn = new Random();
		// cardDrawn = rn.nextInt(deckCards.size() - 1);
		// dealCard = (int) deckCards.get(cardDrawn);
		// If my shuffle worked I don't need the random draw from above
		cardDrawn = deckCards[0][0][0];
		deckCards.remove(cardDrawn);
		System.out.println("Card is " + dealCard);
	}

	public static void hitOrStay() {
		System.out.println(" ");
		// here I need to add player interface to populate playerHold
		while (playerOneTotal < playerHold) {
			System.out.println("Player 1 total = " + playerOneTotal);
			System.out.println("Hit me");
			dealCard();
			if (dealCard == 11) {
				aceDrawnPlayer = true;
			}
			playerOneTotal = playerOneTotal + dealCard;
			if (playerOneTotal > 21 && aceDrawnPlayer) {
				playerOneTotal = playerOneTotal - 10;
				System.out
						.println("Ace is now a 1.  Total = " + playerOneTotal);
				aceDrawnPlayer = false;
			}
		}
		System.out.println("Player 1 total = " + playerOneTotal);
		if (playerOneTotal == 21) {
			System.out.println("Black Jack!!!");
		} else {
			System.out.println(" ");
			System.out.println("Dealer total = " + dealerTotal);
			while (dealerTotal < 17) {
				System.out.println("Dealer Hits ");
				dealCard();
				if (dealCard == 11) {
					aceDrawnDealer = true;
				}
				dealerTotal = dealerTotal + dealCard;
				if (dealerTotal > 21 && aceDrawnDealer) {
					dealerTotal = dealerTotal - 10;
					System.out
							.println("Ace is now a 1.  Total =" + dealerTotal);
					aceDrawnDealer = false;
				}
			}
		}
	}

	public static void soWhoWinsBlackJack() {
		System.out.println(" ");
		System.out.println("Player 1 total = " + playerOneTotal);
		System.out.println("Dealer   total = " + dealerTotal);

		System.out.println(" ");

		if (dealerTotal > 21) {
			dealerTotal = 0;
		}
		if (playerOneTotal > 21) {
			playerOneTotal = 0;
		}
		// What if both get Black Jack on first round?
		if ((dealerTotal >= playerOneTotal) && dealerTotal > 0) {
			System.out.print("Dealer Wins");
		} else {
			if (playerOneTotal > 0) {
				System.out.print(" ******* Player Wins");
			} else {
				System.out.println("it's a wash");
			}
		}
	}
}
