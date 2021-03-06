package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 15
 * Dated 31st December 2014
 */
public class Pair {
	
	private String from;
	private String to;
	
	Pair(String from, String to) {
		this.from= from;
		this.to= to;
	}
	
	public boolean equals(Object object) {
		Pair pair= (Pair) object;
		return from.equals(pair.from) && to.equals(pair.to);
	}
		
	public int hashCode() {
		return 0;
	}
}