package com.kms.blackjack;

public class Dealer extends Gamer {
	
	public Dealer() {
		super(3);
	}
	
	public void moreCard(CardDeck card) {
		int sum = 0;
		for(Card c : cardList) {
			if(c != null) {
				sum += c.getCalcValue();
			}
		}
		
		if(sum <= 16) {
			card.pick();
		}
	}
}
