package org.example.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.pages.HomePage;

public class HomeSteps {

    HomePage homePage=new HomePage();


    @Given("^I an on homepage$")
    public void i_an_on_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I click on login btn on home page$")
    public void when_I_click_on_login_btn_on_home_page() throws Throwable {
        homePage.clickOnLoginBtn();
    }
    @When("^I click on registration btn on home page$")
    public void iClickOnRegistrationBtnOnHomePage() {
        homePage.clickRegisterBtn1();
    }

}
