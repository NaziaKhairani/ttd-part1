package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 14
 * Dated 31st December 2014
 */
public class Franc extends Money{
	
	Franc(int amount, String currency) {
		super(amount, currency);
	}
	
	//returning money instead of France
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	String currency() {
		return currency;
	}
	
}
