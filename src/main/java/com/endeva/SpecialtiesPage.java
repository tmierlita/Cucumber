package com.endeva;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SpecialtiesPage {

    public WebElement homeScr;
    public WebElement addSpec;
    public List<WebElement> specList;
    public List<WebElement> editButtonList;
    public List<WebElement> deleteButtonList;
    public WebElement nameSpecialty;
    public WebElement saveButton;

    public SpecialtiesPage(WebDriver webDriver){
        homeScr=webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"));
        addSpec=webDriver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        editButtonList=webDriver.findElements(By.xpath("//tbody/tr/td[2]/button[1]"));
        specList=webDriver.findElements(By.xpath("//tbody/tr/td[1]"));
        deleteButtonList=webDriver.findElements(By.xpath("//tbody/tr/td[2]/button[2]"));
    }

    public void AddSpecialty (WebDriver webDriver){
        addSpec.click();
        nameSpecialty=webDriver.findElement(By.xpath("//input[@id='name']"));
        saveButton=webDriver.findElement(By.xpath("//button[@type='submit']"));
        nameSpecialty.sendKeys("neurology");
        saveButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean checkSpecAdd(WebDriver webDriver, String spec){
        JavascriptExecutor e = (JavascriptExecutor) webDriver;
        for (int i=0;i<specList.size();i++){
            String specName = (String) e.executeScript("return document.getElementById('"+i+"').value");
            if(specName.equals(spec)){
                return true;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException g) {
            g.printStackTrace();
        }
        return false;

    }

    public void editSpec (String spec, WebDriver webDriver){
        JavascriptExecutor e = (JavascriptExecutor) webDriver;
        for(int i=0;i<specList.size();i++){
            String specName = (String) e.executeScript("return document.getElementById('"+i+"').value");
            if(specName.equals(spec)){
                editButtonList.get(i).click();
                break;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    public void deleteSpec (String spec, WebDriver webDriver){
        JavascriptExecutor e = (JavascriptExecutor) webDriver;
        for(int i=0;i<deleteButtonList.size();i++){
            String specName = (String) e.executeScript("return document.getElementById('"+i+"').value");
            if(specName.equals(spec)){
                deleteButtonList.get(i).click();
                break;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    public void clickHome(WebDriver webDriver){
        homeScr.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
