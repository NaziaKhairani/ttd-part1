package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 15
 * Dated 31st December 2014
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMixedAddition() {
		Expression fiveBucks= Money.dollar(5);
		Expression tenFrancs= Money.franc(10);
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result= bank.reduce(fiveBucks.plus(tenFrancs), "USD");
		assertEquals(Money.dollar(10), result);
	}
	
	
}
