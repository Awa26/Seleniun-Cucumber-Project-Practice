package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {
        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);

        System.out.println(fruitsAndVegetables.get(1));

    }

    @Then("I will share my favorites pets")
    public void i_will_share_my_favorites_pets(List<String> pets_ILike) {
        System.out.println("pets_ILike = " + pets_ILike);
        System.out.println(pets_ILike.get(0));

    }

    @Then("user should see all teammates in the list")
    public void user_should_see_all_teammates_in_the_list(List <String> teammates) {
        System.out.println("teammates = " + teammates);
        System.out.println(teammates.get(10));
        System.out.println(teammates.size());
        // teammates.add("Emma");
       // System.out.println(teammates);
    }

    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {
        System.out.println("driverInfo = " + driverInfo);

        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"address\") = " + driverInfo.get("address"));
        System.out.println("driverInfo.size() = " + driverInfo.size());

    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }



    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expected_months) {
        DropDownPage dropDownPage = new DropDownPage();

        System.out.println("months = " + expected_months);

        List<String> actualMonth = BrowserUtils.dropdownOptions_as_STRING(
                dropDownPage.dropdowns_months);
        Assert.assertEquals(expected_months,actualMonth);

    }




}
