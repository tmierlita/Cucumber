package com.endeva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditSpecPage {

    public WebElement specname;
    public WebElement updateSpecButton;

    public EditSpecPage (WebDriver webDriver){
        specname=webDriver.findElement(By.xpath("//input[@id='name']"));
        updateSpecButton=webDriver.findElement(By.xpath("//button[@type='submit']"));
    }

    public void updateSpec(WebDriver webDriver){
        specname.clear();
        specname.sendKeys("neurologyEditTest");
        updateSpecButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
