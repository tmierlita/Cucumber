package com.endava;

import com.endeva.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditVetTest extends TestBaseClass {

    public AddNewVetPage addVetPage;
    public VeterinariansPage vetPage;
    public NavigationPage navpage;
    public EditVetPage editVet;
    public SpecialtiesPage specPage;

    @Test

    public void editVetTest(){
        navpage=new NavigationPage(webdriver);
        navpage.clickSpecialties();
        specPage=new SpecialtiesPage(webdriver);
        specPage.AddSpecialty(webdriver);
        specPage=new SpecialtiesPage(webdriver);
        specPage.clickHome(webdriver);
        navpage= new NavigationPage(webdriver);
        navpage.clickVeterinariansAdd(webdriver);
        addVetPage = new AddNewVetPage(webdriver);
        addVetPage.insert(webdriver);
        vetPage = new VeterinariansPage(webdriver);
        Assert.assertTrue(vetPage.veterinarianListStr("VetTeo VetMierlita"));
        vetPage.vetList("VetTeo VetMierlita");
        editVet = new EditVetPage(webdriver);
        editVet.editSpecialities(webdriver);
        vetPage = new VeterinariansPage(webdriver);
        vetPage.deleteVet("VetTeo VetMierlita");
        vetPage = new VeterinariansPage(webdriver);
        Assert.assertFalse(vetPage.veterinarianListStr("VetTeo VetMierlita"));
        vetPage.clickHomeScr(webdriver);
        navpage=new NavigationPage(webdriver);
        navpage.clickSpecialties();
        specPage=new SpecialtiesPage(webdriver);
        specPage.deleteSpec("neurology",webdriver);
    }
}
