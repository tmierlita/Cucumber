package com.endeva;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddOwnerPage {

    public WebElement FirstName;
    public WebElement Lastname;
    public WebElement Address;
    public WebElement City;
    public WebElement Telephone;
    public WebElement error;
    public WebElement AddOwnerButton;

    public AddOwnerPage(WebDriver webDriver){
        FirstName=webDriver.findElement(By.id("firstName"));
        Lastname=webDriver.findElement(By.id("lastName"));
        Address=webDriver.findElement(By.id("address"));
        City=webDriver.findElement(By.id("city"));
        Telephone=webDriver.findElement(By.id("telephone"));
    }

    public void insert(WebDriver webDriver){
        FirstName.sendKeys("Teodor");
        Lastname.sendKeys("Mierlita");
        Address.sendKeys("Brailita 1");
        City.sendKeys("Bucuresti");
        Telephone.sendKeys("abc");
    }

    public boolean checkError (WebDriver webDriver){
        try {
            error = webDriver.findElement(By.className("help-block"));
        }catch (NoSuchElementException e){
            return false;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  error.isDisplayed();
    }

    public void changeTelephone (WebDriver webDriver){
        Telephone.clear();
        Telephone.sendKeys("123456789");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void submitAddOwner(WebDriver webDriver){
        AddOwnerButton=webDriver.findElement(By.xpath("//button[@type='submit']"));
        AddOwnerButton.submit();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
