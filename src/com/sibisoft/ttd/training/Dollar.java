package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 09
 * Dated 31st December 2014
 */
public class Dollar extends Money{
	
	Dollar(int amount, String currency) {
		super(amount, currency);
	}
	
	Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}
	
	String currency() {
		return currency;
	}
}
