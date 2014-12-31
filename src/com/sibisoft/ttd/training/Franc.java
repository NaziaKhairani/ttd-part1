package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 11
 * Dated 31st December 2014
 */
public class Franc extends Money{
	
	Franc(int amount, String currency) {
		super(amount, currency);
	}
	
	/*static Money franc(int amount) {
		return new Money(amount, "CHF");
	}*/
	
	/*Money times(int multiplier) {
		return new Franc(amount * multiplier, currency);
	}*/
	
	//returning money instead of France
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	String currency() {
		return currency;
	}
	
}
