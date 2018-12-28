package com.kg.college;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Test;

public class Mainpac1
{
    
    @AfterClass

    void testclass(){
        
     
        int e = Mainpac.add( 5,6);
        System.out.println("add");

        assertEquals(11, e);

        
    }
}