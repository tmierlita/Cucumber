package com.endava;

import com.endeva.HomePage;
import com.endeva.NavigationPage;
import com.endeva.OwnersPage;
import org.junit.Assert;
import org.junit.Test;

public class OwnersTest extends TestBaseClass {

    public OwnersPage ownerPage;
    public NavigationPage navigationPage;

    @Test

    public void ownerPresent(){
        navigationPage = new NavigationPage(webdriver);
        navigationPage.clickOwnerAll(webdriver);
        ownerPage=new OwnersPage(webdriver);
        Assert.assertTrue(ownerPage.ownerListStr("Betty Davis"));
    }
}
