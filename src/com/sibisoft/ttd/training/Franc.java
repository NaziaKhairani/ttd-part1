package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 07
 * Dated 30th December 2014
 */
public class Franc extends Money{

	//private int amount; 
	
	Franc(int amount){
		this.amount= amount;
	}
	
	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	/*public boolean equals(Object object) {
		Money money= (Money) object;
		return amount == money.amount;
	}*/
}
