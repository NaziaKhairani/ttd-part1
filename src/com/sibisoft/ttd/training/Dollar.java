package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 13
 * Dated 31st December 2014
 */
public class Dollar extends Money{
	
	Dollar(int amount, String currency) {
		super(amount, currency);
	}
	
	//returning money instead of dollar
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	String currency() {
		return currency;
	}
}
