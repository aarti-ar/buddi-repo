package com.buddi.pages;


import com.buddi.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {

//    //Page Object
    By loginTab= By.xpath("//nav[@id='header-navigation']//a[normalize-space()='Login']");
    By textMessage=By.xpath("//h3[normalize-space()='Welcome to your Buddi dashboard']");

    public String getHomePageTitle() {
       //String title="Buddi Limited | Buddi: Personal Alarm Services For The Elderly";
        return driver.getTitle();//returns the title of the page
    }
   public void clickOnTheLoginTab(){
        driver.findElement(loginTab).click();
  }

    public void getTextMessage(){
        //return driver.findElement(incredibleIndiaPage).getText();
       verifyThatTextIsDisplayed(textMessage,"Welcome to your Buddi dashboard");
   }
}
