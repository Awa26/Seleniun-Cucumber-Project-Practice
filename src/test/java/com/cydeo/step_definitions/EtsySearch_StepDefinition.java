package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;

public class EtsySearch_StepDefinition {
    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("user is on the Etsy homepage")
    public void user_is_on_the_etsy_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));
    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPage.search_box.sendKeys("Wooden Spoon" + Keys.ENTER);
    }

    @When("user click to Etsy search button")
    public void user_click_to_etsy_search_button() {
        etsySearchPage.search_button.click();
    }

    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedTile = "Wooden spoon";
        BrowserUtils.verifyTitleContains(expectedTile);
    }

    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
        etsySearchPage.search_box.sendKeys(string + Keys.ENTER);
    }

        @Then("user sees {string} is in the title")
        public void user_sees_is_in_the_title (String string){
            BrowserUtils.verifyTitleContains(string);
        }

    }

