package com.kms.blackjack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		Rule rule = new Rule();
		Scanner scan = new Scanner(System.in);

		// 딜러 게이머 둘다 2장씩뽑기
		for (int i = 0; i < 2; i++) {
			gamer.receive(cd.pick());
			dealer.receive(cd.pick());
		}
		dealer.moreCard(cd);

		while (true) {
			System.out.println("게이머 점수");
			gamer.open();
			System.out.println("----------");

			System.out.print("카드를 더 뽑으시겠습니까? (No : 2)");
			int num = scan.nextInt();
			gamer.receive(cd.pick());

			if (num == 2) {
				break;
			}
		}
		scan.close();
		
		rule.whoIsWin(gamer, dealer);

	}
}
