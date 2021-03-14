package com.devlabs.java.lab9;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
public class LearnAttribute2 {


//atribute prioirty it's to manage which are executed in certain order
	// priority it's on ascending order minim priority first , max priority at the end right
//	priority it's an attribute


		@Test(priority= -1) //this would be ran first despite the order , in this case i used in the first
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

