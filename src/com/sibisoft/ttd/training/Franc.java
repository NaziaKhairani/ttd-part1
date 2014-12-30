package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 05
 * Dated 30th December 2014
 */
public class Franc {

	private int amount;
	
	Franc(int amount){
		this.amount= amount;
	}
	
	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Franc franc= (Franc) object;
		return amount == franc.amount;
	}
}
