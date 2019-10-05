package com.kms.blackjack;

import java.util.Collections;
import java.util.LinkedList;

public class CardDeck {
	LinkedList<Card> cardList = new LinkedList<Card>();
	public CardDeck() {
		String[] shape = { "스페이드", "클럽", "다이아", "하트" };
		String displayValue = "";
		int calcValue;
		final int CARD_COUNT = 13;

		for (int i = 0; i < shape.length; i++) {
			for (int j = 0; j < CARD_COUNT; j++) {
				switch (j) {
				case 0:
					displayValue = "A";
					calcValue = 1;
					break;
				case 10:
					displayValue = "J";
					calcValue = 10;
					break;
				case 11:
					displayValue = "Q";
					calcValue = 10;
					break;
				case 12:
					displayValue = "K";
					calcValue = 10;
					break;
				default:
					displayValue = Integer.toString(j + 1);
					calcValue = j + 1;
				}
				Card c = new Card(shape[i],displayValue,calcValue);
				cardList.add(c);
			}
		}
		cardMix();
	}

	// 카드 섞기
	public void cardMix() {

		for (int i = 0; i < cardList.size(); i++) {
			int random = (int) (Math.random() * cardList.size());
			Collections.swap(cardList,i,random);
		}
	}

	// 카드 뽑기
	public Card pick() {
		for (int i = 0; i < cardList.size(); i++) {
			if (cardList.get(i) != null) {
				Card temp = cardList.get(i);
				cardList.remove(i);
				return temp;
			}
		}
		return null;

	}

	// 카드 출력
	public void print() {
		for (Card c : cardList) {
			if (c != null) {
				System.out.println(c);
			}
		}
	}

}
