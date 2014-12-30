package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 05
 * Dated 30th December 2014
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class FrancTest {

	@Test
	public void testEquality() {
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
	}

}
