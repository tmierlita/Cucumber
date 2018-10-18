package com.endava;

import com.endeva.EditSpecPage;
import com.endeva.NavigationPage;
import com.endeva.SpecialtiesPage;
import org.junit.Assert;
import org.junit.Test;


public class SpecialtiesTest extends TestBaseClass {

    public NavigationPage navPage;
    public SpecialtiesPage specPage;
    public EditSpecPage editPage;

    @Test

    public void specTest(){
        navPage=new NavigationPage(webdriver);
        navPage.clickSpecialties();
        specPage=new SpecialtiesPage(webdriver);
        specPage.AddSpecialty(webdriver);
        specPage=new SpecialtiesPage(webdriver);
        Assert.assertTrue(specPage.checkSpecAdd(webdriver,"neurology"));
        specPage.editSpec("neurology", webdriver);
        editPage=new EditSpecPage(webdriver);
        editPage.updateSpec(webdriver);
        specPage=new SpecialtiesPage(webdriver);
        Assert.assertTrue(specPage.checkSpecAdd(webdriver,"neurologyEditTest"));
        specPage.deleteSpec("neurologyEditTest",webdriver);
        specPage=new SpecialtiesPage(webdriver);
        Assert.assertFalse(specPage.checkSpecAdd(webdriver,"neurologyEditTest"));
    }
}
