package com.endava;

import com.endeva.EditPetPage;
import com.endeva.NavigationPage;
import com.endeva.PetTypesPage;
import org.junit.Assert;
import org.junit.Test;

public class PetTypesTest extends TestBaseClass {

    public NavigationPage navPage;
    public PetTypesPage petPage;
    public EditPetPage editPage;

    @Test

    public void petTypesTest(){
        navPage=new NavigationPage(webdriver);
        navPage.clickPetTypes();
        petPage=new PetTypesPage(webdriver);
        petPage.clickAddPet(webdriver);
        petPage=new PetTypesPage(webdriver);
        Assert.assertTrue(petPage.checkPetAdd("cocostarc",webdriver));
        petPage.editPet("cocostarc",webdriver);
        editPage = new EditPetPage(webdriver);
        editPage.editPet(webdriver);
        petPage=new PetTypesPage(webdriver);
        Assert.assertTrue(petPage.checkPetAdd("cocostarcEditTest",webdriver));
        petPage.deletePet("cocostarcEditTest",webdriver);
        petPage=new PetTypesPage(webdriver);
        Assert.assertFalse(petPage.checkPetAdd("cocostarcEditTest",webdriver));
        petPage.clickHomeScr(webdriver);
    }
}
