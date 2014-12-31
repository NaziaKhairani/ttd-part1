package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 09
 * Dated 31st December 2014
 */
public class Franc extends Money{
	
	Franc(int amount, String currency) {
		super(amount, currency);
	}
	
	Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}
	
	String currency() {
		return currency;
	}
	
}
