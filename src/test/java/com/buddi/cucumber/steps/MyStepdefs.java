package com.buddi.cucumber.steps;

import com.buddi.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    @Given("^user is on the buddi home page and verify the title \"([^\"]*)\"$")
    public void userIsOnTheBuddiHomePageAndVerifyTheTitle(String arg0) {
        System.out.println("userIsOnTheBuddiHomePageAndVerifyTheTitle");
       String expectedTitle= "Buddi Limited | Buddi: Personal Alarm Services For The Elderly";
       String actualTitle= new HomePage().getHomePageTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println(actualTitle);
    }
    @When("^user click on the Login tab on the homepage$")
    public void userClickOnTheLoginTabOnTheHomepage() {
      System.out.println("userClickOnTheLoginTabOnTheHomepage");
        new HomePage().clickOnTheLoginTab();
    }
    @Then("^user should navigate to the Login Page$")
    public void userShouldNavigateToTheLoginPage() {
        System.out.println("user should navigate to the Login Page");
        //new HomePage().getTextMessage();

    }


}
