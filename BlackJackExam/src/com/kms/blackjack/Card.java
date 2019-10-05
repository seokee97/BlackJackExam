package com.kms.blackjack;

public class Card {
	private String shape;
	private String dispalyValue;
	private int calcValue;

	public Card(String shape, String dispalyValue, int calcValue) {
		this.shape = shape;
		this.dispalyValue = dispalyValue;
		this.calcValue = calcValue;
	}
	
	public int getCalcValue() {
		return calcValue;
	}

	@Override
	public String toString() {
		return String.format("shape : %s, displayValue : %s, calcValue : %d",shape, dispalyValue, calcValue);
	}

}
