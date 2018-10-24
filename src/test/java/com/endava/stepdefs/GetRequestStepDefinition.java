package com.endava.stepdefs;

import com.endava.TestBaseClass;
import com.endeva.AddOwnerPage;
import com.endeva.NavigationPage;
import com.endeva.OwnersPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class GetRequestStepDefinition extends TestBaseClass {

    public AddOwnerPage ownerPage;
    public NavigationPage navigationPage;
    public OwnersPage ownersPage;

    @Given("^I have access to create new owner$")
    public void i_have_access_to_create_new_owner() throws Throwable {
        initialize();
        navigationPage = new NavigationPage(webdriver);
        navigationPage.clickOwnerAdd(webdriver);
    }

    @When("^I create the new owner$")
    public void i_create_the_new_owner() throws Throwable {
        ownerPage = new AddOwnerPage(webdriver);
        ownerPage.insert(webdriver);
        ownerPage.changeTelephone(webdriver);
        ownerPage.submitAddOwner(webdriver);
    }

    @Then("^The new owner will be present in the Owner list$")
    public void the_new_owner_will_be_present_in_the_Owner_list() throws Throwable {
            ownersPage=new OwnersPage(webdriver);
            Assert.assertTrue(ownersPage.ownerListStr("Teodor Mierlita"));
            tearDown();

    }
}
