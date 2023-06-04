package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

public class Day02_Assertions {

    @Test
    public void assertions(){
        /*
        Assertion is done to check if expected equals to action
        green check mark -> PASS
        yellow x -> fail

        Assert.assertTrue(true);// PASS
         Assert.assertTrue(false);// fail

          Assert.assertFalse(false);// PASS
           Assert.assertFalse(false);// PASS
         */
        Assert.assertEquals(5,5);
        Assert.assertEquals("apple","apple");
        Assert.assertEquals(false,false);

   //     Assert.assertTrue("Apple".equals("apple")); // THIS IS HARD ASSERTION test will fail
        if ("Apple".equals("apple")){
           // VERIFICATION: IF THE STATEMENT FAILS TEST CASE WILL CONTINUE TO EXECUTE
        }
        Assert.assertFalse("Apple".equals("apple"));//PASS



    }
}
