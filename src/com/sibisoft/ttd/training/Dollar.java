package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 07
 * Dated 31st December 2014
 */
public class Dollar extends Money{

	//private int amount; 
	
	Dollar(int amount){
		this.amount= amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
	/*public boolean equals(Object object) {
		Money money= (Money) object;
		return amount == money.amount;
	}*/
}
