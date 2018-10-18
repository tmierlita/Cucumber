package com.endeva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class OwnersPage {

    public List<WebElement> ownerList;

    public OwnersPage (WebDriver webDriver) {
        ownerList=webDriver.findElements(By.className("ownerFullName"));
    }

    public boolean ownerListStr(String ownerName){
        List<String> textOwner= new ArrayList<String>();
        String presetnOwner = null;
        for(WebElement we:ownerList){
            textOwner.add(we.getText());
        }
        for(String owner : textOwner) {
            if(owner.equals(ownerName)){
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
}
