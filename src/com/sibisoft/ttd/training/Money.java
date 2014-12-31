package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 07
 * Dated 31st December 2014
 */
public class Money {

	protected int amount;
	
	//check if both amounts and classes are equal
	public boolean equals(Object object) { 
		Money money = (Money) object;
		return amount == money.amount
		&& getClass().equals(money.getClass());
	}
}
