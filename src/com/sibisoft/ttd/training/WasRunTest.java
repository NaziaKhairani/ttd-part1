package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 18
 * Dated 2nd January 2015
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class WasRunTest {

	@Test
	public void testRunning() {
		WasRun test = new WasRun("testMethod"); //by using wasRun class file
		//assertFalse(test.wasRun,true); this gives us red line because of failing
		assertFalse(test.wasRun,false);
		test.run();
		assertTrue(test.wasRun,true);
		assertTrue(new TestCase("testCase").run(),true);  //using TestCase constructor
		assertTrue(new TestCaseTest("running").run(),true);  //using TestCaseTest constructor
	}

}
