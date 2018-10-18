package com.endeva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewVetPage {

    public WebElement FirstName;
    public WebElement Lastname;
    public WebElement SaveVet;

    public AddNewVetPage (WebDriver webDriver){
        FirstName=webDriver.findElement(By.id("firstName"));
        Lastname=webDriver.findElement(By.id("lastName"));
        SaveVet=webDriver.findElement(By.id("specialties"));
    }

    public void insert(WebDriver webDriver){
        FirstName.sendKeys("VetTeo");
        Lastname.sendKeys("VetMierlita");
        SaveVet.submit();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
