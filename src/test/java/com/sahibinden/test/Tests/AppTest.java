package com.sahibinden.test.Tests;

import static org.junit.Assert.assertTrue;

import com.sahibinden.test.Pages.Page;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private Page newPage = new Page();

    @Before
    public void Before() {
        //before method
    }

    @Test
    public void testCase001(){

        newPage.startDriver();
    }

   @Test
    public void testCase002(){
        newPage
                .startDriver()
                .stopDriver();

    }






    @After
    public void After() {
        //after method
    }



}
