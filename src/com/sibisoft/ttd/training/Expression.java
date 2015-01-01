package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 16
 * Dated 1st January 2015
 */
public interface Expression {

	Money reduce(Bank bank, String to);
	Expression plus(Expression addend);
	Expression times(int multiplier);
}
