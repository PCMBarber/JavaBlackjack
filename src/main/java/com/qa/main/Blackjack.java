package com.qa.main;

public class Blackjack {
	
	public int win(int player, int dealer) {
		if(player > 21 && dealer > 21) {
			return 0;
		} else if(player > 21) {
			return dealer;
		} else if(dealer > 21) {
			return player;
		}
		
		if (player > dealer) {
			return player;
		} else {
			return dealer;
		}
	}
}
