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

        newPage
                .runChrome();
    }

   @Test
    public void testCase002(){
        newPage
                .runChrome()
                .stopDriver();

    }

   @Test
    public void testCase003(){
        newPage
                .runChrome()
                .openPage();

    }

    @Test
    public void testCase004(){
        newPage
                .runChrome()
                .openPage()
                .clickLoginButton();

    }

    @Test
    public void testCase005(){
        newPage
                .runChrome()
                .openPage()
                .closeAd()
                .clickLoginButton();

    }






    @After
    public void After() {
        //after method
    }



}
