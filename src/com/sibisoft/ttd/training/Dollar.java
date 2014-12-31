package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 08
 * Dated 31st December 2014
 */
public class Dollar extends Money{
	
	Dollar(int amount){
		this.amount= amount;
	}
	
	Money times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
}
