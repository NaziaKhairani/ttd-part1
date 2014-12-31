package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 08
 * Dated 30th December 2014
 */
public class Franc extends Money{
	
	Franc(int amount){
		this.amount= amount;
	}
	
	Money times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
}
