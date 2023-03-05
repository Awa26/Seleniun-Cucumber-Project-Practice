package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiSearch_StepDefinition {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String name) {
wikiSearchPage.searchBox.sendKeys(name);
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
wikiSearchPage.searchButton.click();
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String expected_mainHeader) {
     String actual_mainHeader = wikiSearchPage.mainHeader.getText();
        Assert.assertEquals(expected_mainHeader,actual_mainHeader);

    }





    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String expected_imageHeader) {
        Assert.assertEquals(expected_imageHeader,wikiSearchPage.imageHeader.getText());
    }

}
