package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 14
 * Dated 31st December 2014
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testReduceMoneyDifferentCurrency() {
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result= bank.reduce(Money.franc(2), "USD");
		assertEquals(Money.dollar(1), result);
	}
	
	/*@Test
	public void testArrayEquals() {
		assertEquals(new Object[] {"abc"}, new Object[] {"abc"});
	}*/
	
	@Test
	public void testIdentityRate() {
		assertEquals(1, new Bank().rate("USD", "USD"));
	}
	
}
