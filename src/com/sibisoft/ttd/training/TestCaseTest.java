package com.sibisoft.ttd.training;
/*
 * By Nazia Khairani
 * Chapter # 18
 * Dated 2nd January 2015
 */
public class TestCaseTest {

	protected String name;
	protected String wasRun;
	
	TestCaseTest(String name){
		this.name = name;
	}
	
	public String testMethod(){
		return wasRun = "true";	
	}
	
	public String run(){
		return testMethod();
	}
}
