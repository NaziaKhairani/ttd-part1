package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 15
 * Dated 31st December 2014
 */
public interface Expression {

	Money reduce(Bank bank, String to);
	Expression plus(Expression addend);
}
