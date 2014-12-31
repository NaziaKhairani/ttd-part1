package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 06
 * Dated 31st December 2014
 */
public class Money {

	protected int amount;
	
	public boolean equals(Object object) {
		Money money= (Money) object;
		return amount == money.amount;
	}
}
