package com.endava;

import com.endeva.AddOwnerPage;
import com.endeva.NavigationPage;
import org.junit.Assert;
import org.junit.Test;

public class AddOwnerErrorTest extends  TestBaseClass{
    public AddOwnerPage ownerPage;
    public NavigationPage navigationPage;

    @Test

    public void addOwnerErrorDisplayed(){
        navigationPage = new NavigationPage(webdriver);
        navigationPage.clickOwnerAdd(webdriver);
        ownerPage=new AddOwnerPage(webdriver);
        ownerPage.insert(webdriver);
        Assert.assertTrue(ownerPage.checkError(webdriver));
    }
}
