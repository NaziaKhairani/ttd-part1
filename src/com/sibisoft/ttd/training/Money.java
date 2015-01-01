package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 15
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
	
	Expression times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}
		
	public Expression plus(Expression addend) {
		return new Sum(this, addend);
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
