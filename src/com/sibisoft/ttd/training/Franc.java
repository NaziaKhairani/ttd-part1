package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 06
 * Dated 30th December 2014
 */
public class Franc extends Money{

	//private int amount;  //now we dont need to declare amout field as it defined in Money class as protected and we see in a subclass too
	
	Franc(int amount){
		this.amount= amount;
	}
	
	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	//also no need to call this from here..Now we call this method from base class Money
	/*public boolean equals(Object object) {
		Money money= (Money) object;
		return amount == money.amount;
	}*/
}
