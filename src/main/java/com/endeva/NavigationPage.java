package com.endeva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage {

    public WebElement homeButton;
    public WebElement ownerButton;
    public WebElement allOwnerButton;
    public WebElement addOwnerButton;
    public WebElement veterinariansButton;
    public WebElement allVeterinariansButton;
    public WebElement addVeterinariansButton;
    public WebElement petTypesButton;
    public WebElement specialtiesButton;

    public NavigationPage(WebDriver webDriver){
        homeButton=webDriver.findElement(By.linkText("HOME"));
        ownerButton=webDriver.findElement(By.xpath("//a[text()='Owners']"));
        veterinariansButton=webDriver.findElement(By.xpath("//a[text()='Veterinarians']"));
        petTypesButton=webDriver.findElement(By.linkText("PET TYPES"));
        specialtiesButton=webDriver.findElement(By.linkText("SPECIALTIES"));
    }

    public void clickHome(){
        homeButton.click();
    }

    public void clickOwnerAll(WebDriver webDriver){
        ownerButton.click();
        allOwnerButton=webDriver.findElement(By.linkText("ALL"));
        allOwnerButton.click();
    }

    public void clickOwnerAdd(WebDriver webDriver){
        ownerButton.click();
        addOwnerButton=webDriver.findElement(By.linkText("ADD NEW"));
        addOwnerButton.click();
    }

    public void clickVeterinariansAll(WebDriver webDriver){
        veterinariansButton.click();
        allVeterinariansButton=webDriver.findElement(By.linkText("ALL"));
        allVeterinariansButton.click();
    }

    public void clickVeterinariansAdd(WebDriver webDriver){
        veterinariansButton.click();
        addVeterinariansButton=webDriver.findElement(By.linkText("ADD NEW"));
        addVeterinariansButton.click();
    }

    public void clickPetTypes(){
        petTypesButton.click();
    }

    public void clickSpecialties(){
        specialtiesButton.click();
    }

}
