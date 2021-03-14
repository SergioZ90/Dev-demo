package com.devlabs.java.lab9;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttribute3 {
	@Test(dependsOnMethods= {"com.devlabs.testNG.lab1.LearnAttribute3.test3"}) 
	public void test1() {
		
		System.out.println("Test1");
	}
		@Test
	public void test2() {
		
			throw new RuntimeException();
	}
		@Test
	public void test3() {
		
		System.out.println("Test3");
	}
}
