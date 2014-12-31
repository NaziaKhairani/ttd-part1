package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 06
 * Dated 31st December 2014
 */
public class Dollar extends Money{

	//private int amount; //now we dont need to declare amount field as it defined in Money class as protected and we see in a subclass too
	
	Dollar(int amount){
		this.amount= amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
	//also no need to call this from here..Now we call this method from base class Money
	/*public boolean equals(Object object) {
		Money money= (Money) object;
		return amount == money.amount;
	}*/
}
