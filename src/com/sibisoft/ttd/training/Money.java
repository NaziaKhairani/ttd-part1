package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 08
 * Dated 31st December 2014
 */
public abstract class Money {

	abstract Money times(int multiplier); //make the times method abstract
	
	protected int amount;
	
	static Money dollar(int amount) {
		return new Dollar(amount);
	}
	
	static Money franc(int amount) {
		return new Franc(amount);
	}
	
	//check if both amounts and classes are equal
	public boolean equals(Object object) { 
		Money money = (Money) object;
		return amount == money.amount
		&& getClass().equals(money.getClass());
	}
}
