package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 12
 * Dated 31st December 2014
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testSimpleAddition() {
		Money five= Money.dollar(5);
		Expression sum= five.plus(five);
		Bank bank= new Bank();
		Money reduced= bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);
	}
	
}
