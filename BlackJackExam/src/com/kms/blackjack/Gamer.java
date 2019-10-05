package com.kms.blackjack;

public class Gamer {
	protected Card cardList[];

	public Gamer() {
		cardList = new Card[49];
	}

	public Gamer(int num) {
		cardList = new Card[num];
	}

	// 카드 받기
	public void receive(Card card) {
		for (int i = 0; i < cardList.length; i++) {
			if (cardList[i] == null) {
				cardList[i] = card;
				return;
			}
		}
	}

	// 받은 카드 출력
	public void print() {
		for (Card c : cardList) {
			if (c != null) {
				System.out.println(c);
			}
		}
	}

	// 카드 오픈
	public int open() {
		int sum = 0;
		for (Card c : cardList) {
			if (c != null) {
				System.out.println(c);
				sum += c.getCalcValue();
			}
		}
		System.out.println("sum : "+sum);
		return sum;
	}

}
