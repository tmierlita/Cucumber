package com.endava;

import com.endeva.AddOwnerPage;
import com.endeva.NavigationPage;
import com.endeva.OwnersPage;
import org.junit.Assert;
import org.junit.Test;


public class AddOwnerTest extends TestBaseClass {

    public AddOwnerPage ownerPage;
    public NavigationPage navigationPage;
    public OwnersPage owner;

    @Test

    public void addOwnerTest(){
        navigationPage = new NavigationPage(webdriver);
        navigationPage.clickOwnerAdd(webdriver);
        ownerPage = new AddOwnerPage(webdriver);
        ownerPage.insert(webdriver);
        ownerPage.changeTelephone(webdriver);
        Assert.assertFalse(ownerPage.checkError(webdriver));
        ownerPage.submitAddOwner(webdriver);
        owner = new OwnersPage(webdriver);
        Assert.assertTrue(owner.ownerListStr("Teodor Mierlita"));
    }
}
