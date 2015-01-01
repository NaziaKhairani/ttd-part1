package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 16
 * Dated 1st January 2015
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	/*@Test
	public void testMixedAddition() {
		Expression fiveBucks= Money.dollar(5);
		Expression tenFrancs= Money.franc(10);
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result= bank.reduce(fiveBucks.plus(tenFrancs), "USD");
		assertEquals(Money.dollar(10), result);
	}
	
	@Test
	public void testSumPlusMoney() {
		Expression fiveBucks= Money.dollar(5);
		Expression tenFrancs= Money.franc(10);
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Expression sum= new Sum(fiveBucks, tenFrancs).plus(fiveBucks);
		Money result= bank.reduce(sum, "USD");
		assertEquals(Money.dollar(15), result);
	}*/
	
	@Test
	public void testSumTimes() {
		Expression fiveBucks= Money.dollar(5);
		Expression tenFrancs= Money.franc(10);
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Expression sum= new Sum(fiveBucks, tenFrancs).times(2);
		Money result= bank.reduce(sum, "USD");
		assertEquals(Money.dollar(20), result);
	}
	
	@Test
	public void testPlusSameCurrencyReturnsMoney() {
		Expression sum= Money.dollar(1).plus(Money.dollar(1));
		assertTrue(sum instanceof Money);
	}
}
