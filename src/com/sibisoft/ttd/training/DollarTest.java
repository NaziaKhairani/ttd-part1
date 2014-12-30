package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 03
 * Dated 30th December 2014
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest {
	
	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}

}
