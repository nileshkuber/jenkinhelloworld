package com.autodesk.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyUtilityTest {

    @Test
    public void getString_test()
    {
        assertEquals(MyUtility.getString(0), "harsh");
        assertEquals(MyUtility.getString(1), "nilesh");
    }
}