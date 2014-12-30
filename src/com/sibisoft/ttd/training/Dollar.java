package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 03
 * Dated 30th December 2014
 */
public class Dollar {

	int amount;
	
	Dollar(int amount){
		this.amount= amount;
	}
	
	public boolean equals(Object object) {
		Dollar dollar= (Dollar) object;
		return amount == dollar.amount;
	}
	
	
}
