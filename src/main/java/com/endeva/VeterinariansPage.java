package com.endeva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VeterinariansPage {

    public List<WebElement> veterinariansList;
    public List<WebElement> editVet;
    public List<WebElement> deleteVet;
    public WebElement homeScr;

    public VeterinariansPage (WebDriver webDriver) {
        veterinariansList=webDriver.findElements(By.xpath("//table/tbody/tr/td[1]"));
        editVet=webDriver.findElements(By.xpath("//table/tbody/tr/td[3]/button[1]"));
        deleteVet=webDriver.findElements(By.xpath("//table/tbody/tr/td[3]/button[2]"));
        homeScr=webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"));
    }

    public boolean veterinarianListStr(String veterinarianName){
        List<String> textVet= new ArrayList<String>();
        String presentVet = null;
        for(WebElement we:veterinariansList){
            textVet.add(we.getText());
        }
        for(String vet : textVet) {
            if(vet.equals(veterinarianName)){
                return true;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void vetList(String vetNameInsert){
        for (int i=0;i<veterinariansList.size();i++){
            String vetName=veterinariansList.get(i).getText();
            if (vetNameInsert.equals(vetName)){
                editVet.get(i).click();
                break;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void deleteVet(String vetNameDelete){
        for (int i=0;i<veterinariansList.size();i++){
            String vetDelete=veterinariansList.get(i).getText();
            if(vetNameDelete.equals(vetDelete)){
                deleteVet.get(i).click();
                break;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickHomeScr(WebDriver webDriver){
        homeScr.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
