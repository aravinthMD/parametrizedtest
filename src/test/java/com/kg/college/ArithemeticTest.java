package com.kg.college;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * ArithemeticTest
 */
/**
 * InnerArithemeticTest
 */

@RunWith(Parameterized.class)
public class ArithemeticTest {
private int first;
private int second;
private int expected;
private  Arithemetic arithemetic;   
public ArithemeticTest(int a,int b,int c)
{
    // super();
this.first=a;
this.second=b;
this.expected=c;
System.out.println("Running constructor");

}
@Parameterized.Parameters
public static Collection test() {
    System.out.println("Running Collection method");
        return Arrays.asList(new Object[][]{{1,2,5},{2,3,5}});
    
}
@Before
public void  beforemethod() {
    System.out.println("Running before method");
    arithemetic=new Arithemetic();
    
}
@Test
public void testmethod()
{
    System.out.println("Running Test method");
 assertEquals(expected,arithemetic.sum(first,second));
}

}