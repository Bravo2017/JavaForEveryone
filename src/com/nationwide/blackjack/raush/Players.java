   package com.nationwide.blackjackFinal1;

/**
 * Players
 * 
 * @author D.Raush
 * 
 */
public class Players {

	private String playerName;
	private Cards[] playerHand = new Cards[2];
	private int numCardsInHand;

	public Players(String name) {

		this.playerName = name;
		this.emptyHand();
	}

	public void emptyHand() {

		for (int cnt = 0; cnt < 2; cnt++) {

			this.playerHand[cnt] = null;
		}

		this.numCardsInHand = 0;

	}

	public boolean addCardToPlayersHand(Cards card) {

		if (this.numCardsInHand == 2) {

			System.err.printf(
					"%s's hand already has 2 cards; cannot add more cards",
					this.playerName);
			System.exit(1);
		}

		this.playerHand[this.numCardsInHand] = card;
		this.numCardsInHand++;

		return (this.getPlayersHandTotal() <= 21);

	}

	public int getPlayersHandTotal() {

		int handTotal = 0;
		int cardNum;

		for (int c = 0; c < this.numCardsInHand; c++) {

			cardNum = this.playerHand[c].getCardNumber();

			if (cardNum == 1) { 				// Ace is always 11

				handTotal += 11;
			} else if (cardNum >= 10) {

				handTotal += 10;
			} else {

				handTotal += cardNum;

			}
		}
		return handTotal;
	}

	public void printCardsInHand() {

		System.out.printf("\n%s's cards\n\n", this.playerName);
		
		for (int c = 0; c < this.numCardsInHand; c++) {

			System.out.printf("\t%s\n\n", this.playerHand[c]);
		}
	}

}