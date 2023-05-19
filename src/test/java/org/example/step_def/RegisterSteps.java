package org.example.step_def;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.RegisterPage;

import static org.junit.Assert.assertEquals;

public class RegisterSteps {
    RegisterPage registerpage = new RegisterPage();


    @And("^I press on female radio btn$")
    public void iPressOnFemaleRadioBtn() {
        registerpage.clickRadioBtn();
    }

    @And("^I enter the valid first name$")
    public void iEnterTheValidFirstName() {
        registerpage.writeName1();
    }

    @And("^I enter the valid last name$")
    public void iEnterTheValidLastName() {
        registerpage.WriteName2();
    }

    @And("^I enter the date of birth$")
    public void iEnterTheDateOfBirth() {
        registerpage.clickDate();
    }

    @And("^I enter the month of birth$")
    public void iEnterTheMonthOfBirth() {
        registerpage.clickOnMonth();

    }

    @And("^I enter the year of birth$")
    public void iEnterTheYearOfBirth() {
        registerpage.clickOnYear();
    }

    @And("^I enter the valid email address$")
    public void iEnterTheValidEmailAddress() {
        registerpage.clickOnEmail();
    }

    @And("^I enter the password$")
    public void iEnterThePassword() {
        registerpage.clickOnPassword();
    }

    @And("^I enter the  confirm password$")
    public void iEnterTheConfirmPassword() {
        registerpage.clickConfirmPassword();
    }

    @Then("^I click on Register btn$")
    public void iClickOnRegisterBtn() {
        registerpage.clickOnRegister();
    }
    @And("^I should see this text on registration page\"([^\"]*)\" text$")
    public void i_should_see_text(String expectedText) throws Throwable  {
        String actualText = registerpage.getRegistrationText();
        assertEquals(expectedText, actualText);
    }


}
