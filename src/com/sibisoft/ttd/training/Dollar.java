package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 04
 * Dated 30th December 2014
 */
public class Dollar {

	private int amount;
	
	Dollar(int amount){
		this.amount= amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Dollar dollar= (Dollar) object;
		return amount == dollar.amount;
	}
}
