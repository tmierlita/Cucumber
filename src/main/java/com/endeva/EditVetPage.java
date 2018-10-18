package com.endeva;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditVetPage {

    public WebElement specialties;
    public WebElement neurology;
    public WebElement saveVet;

    public EditVetPage (WebDriver webDriver){
        specialties=webDriver.findElement(By.id("spec"));
        saveVet=webDriver.findElement(By.xpath("//button[@type='submit']"));
    }

    public void editSpecialities (WebDriver webDriver){
        specialties.click();
        neurology=webDriver.findElement(By.xpath("//span[contains(text(),'neurology')]"));
        neurology.click();
        specialties.sendKeys(Keys.ESCAPE);
        saveVet.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
