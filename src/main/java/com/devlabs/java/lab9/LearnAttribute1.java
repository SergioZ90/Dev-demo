package com.devlabs.java.lab9;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttribute1 {
	@Test
public void test1() {
	
	System.out.println("Test1");
}
	@Test(enabled=false) //to not execute a certain test
public void test2() {
	
	System.out.println("Test2");
}
	@Ignore /// annotation difference to enabled it's an attribute
	@Test
public void test3() {
	
	System.out.println("Test3");
}
}
