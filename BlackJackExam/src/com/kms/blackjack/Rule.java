package com.kms.blackjack;

public class Rule {
	public void whoIsWin(Gamer gamer, Dealer dealer) {
		System.out.println("게이머 점수");
		int gamerScore = gamer.open();
		System.out.println("딜러 점수");
		int dealerScore = dealer.open();
		final int STAND_SCORE = 21;

		if (gamerScore > STAND_SCORE && dealerScore > STAND_SCORE || gamerScore == dealerScore) {
			System.out.println("비김");
		} else if (gamerScore <= STAND_SCORE && dealerScore <= STAND_SCORE) {
			if(gamerScore<dealerScore) {
				System.out.println("딜러 승");
			}else {
				System.out.println("게이머 승");
			}
		}else {
			if(gamerScore>STAND_SCORE) {
				System.out.println("딜러 승");
			}else {
				System.out.println("게이머 승");
			}
		}
	}
}
