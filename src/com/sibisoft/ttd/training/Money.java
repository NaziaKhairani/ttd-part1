package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 11
 * Dated 31st December 2014
 */
public class Money {

	//abstract Money times(int multiplier); //make the times method abstract
	//abstract String currency();
	
	protected int amount;
	protected String currency;
	
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	//returning money instead of dollar and franc individually
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	String currency() {
		return currency;
	}
	
	//helps in debugging
	public String toString() {
		return amount + " " + currency;
	}
	
	//check if both amounts and classes are equal
	/*public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
		&& getClass().equals(money.getClass());
	}*/
	
	//compare currencies
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
		&& currency().equals(money.currency());
	}
}
