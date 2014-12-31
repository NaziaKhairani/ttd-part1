package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 13
 * Dated 31st December 2014
 */
public class Sum implements Expression{

	Money augend;
	Money addend;
	
	Sum(Money augend, Money addend) {
		this.augend= augend;
		this.addend= addend;
	}
	
	public Money reduce(String to) {
		int amount= augend.amount + addend.amount;
		return new Money(amount, to);
	}
}
