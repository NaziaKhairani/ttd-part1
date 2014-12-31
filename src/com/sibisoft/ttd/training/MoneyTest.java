package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 09
 * Dated 31st December 2014
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testCurrency() { // test currency of dollar and franc
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
	/*@Test
	public void testMultiplicationForDollar() { //multiplication for dollar
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}
	
	@Test
	public void testMultiplicationForFranc() { //multiplication for franc
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test
	public void testEquality() { //check equality cases for dollar and franc
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}*/
	
}
