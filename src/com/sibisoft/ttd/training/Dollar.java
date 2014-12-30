package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 02
 * Dated 30th December 2014
 */
public class Dollar {

	int amount;
	
	Dollar(int amount){
		this.amount= amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
