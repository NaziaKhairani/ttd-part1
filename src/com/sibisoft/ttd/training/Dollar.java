package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 11
 * Dated 31st December 2014
 */
public class Dollar extends Money{
	
	Dollar(int amount, String currency) {
		super(amount, currency);
	}
	
	/*static Money dollar(int amount) {
		return new Money(amount, "USD");
	}*/
	
	/*Money times(int multiplier) {
		return new Dollar(amount * multiplier, currency);
	}*/
	
	//returning money instead of dollar
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	String currency() {
		return currency;
	}
}
