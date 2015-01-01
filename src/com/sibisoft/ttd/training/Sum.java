package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 15
 * Dated 31st December 2014
 */
public class Sum implements Expression{

	Expression augend;
	Expression addend;
	
	Sum(Expression augend, Expression addend) {
		this.augend= augend;
		this.addend= addend;
	}
	
	public Money reduce(Bank bank, String to) {
		int amount= augend.reduce(bank, to).amount
		+ addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}
	
	public Expression plus(Expression addend) {
		return null;
	}
}
