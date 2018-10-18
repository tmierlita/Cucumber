package com.endava;

import com.endeva.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class HomepageTest extends TestBaseClass {

    public HomePage homePage;

    @Test

    public void homeSuccessful(){
        homePage=new HomePage(webdriver);
        Assert.assertTrue("Error!",homePage.welcomeDisplayed());
        Assert.assertEquals("Welcome",homePage.headerDisplayed());
        Assert.assertTrue("Error!",homePage.imageDisplayed());
    }

}
