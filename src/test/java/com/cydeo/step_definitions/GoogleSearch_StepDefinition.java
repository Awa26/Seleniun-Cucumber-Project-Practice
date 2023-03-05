package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDefinition {
GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @When("user is on the google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        BrowserUtils.sleep(3);
        String expectedTitle = "Google";
        String actualTile = Driver.getDriver().getTitle();
       // actualTile.getText
        Assert.assertEquals(expectedTitle,actualTile);
    }





    @When("user searches for apple")
    public void user_searches_for_apple() {
       googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }
    @Then("user should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String expected_Title = "apple";
        BrowserUtils.verifyTitleContains(expected_Title);
    }



}
