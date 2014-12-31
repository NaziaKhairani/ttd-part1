package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 12
 * Dated 31st December 2014
 */
public class Money implements Expression{

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
	
	Expression plus(Money addend) {
		return new Money(amount + addend.amount, currency);
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
	
	//compare currencies
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
		&& currency().equals(money.currency());
	}
	
}
