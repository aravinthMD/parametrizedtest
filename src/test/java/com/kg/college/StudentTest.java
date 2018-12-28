package com.kg.college;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest{
	Addition add=new Addition();
	// private Addition addition;
	// private Addition multi;

	/** * Initialization */
	// @BeforeClass
	// public static void  setUp() {
	// 	addition = new Addition();
	// 	multi=new Addition();

	// }

	/** * Test case for add method */
	@After
	public void test() {
	
		int i = add.add(3, 7);
		System.out.println("after method");
		System.out.println(i);
		assertEquals(10, i);
	}
	@Test
	 public void test1()
	{
		int e=add.multiplication(4,5);
		System.out.println("testttt");
		assertEquals(20, e);
	
	}

	/** * destroy the object */
	// @AfterClass
	// public static void tearDown() {
	// 	addition = null;
	// 	multi=null;

	}
