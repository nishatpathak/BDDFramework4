package org.example.step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.LetsCodeItLoginPage;
import org.example.pages.LoginPage;

public class LetsCodeItLoginSteps {
    LetsCodeItLoginPage letsCodeItLoginPage=new LetsCodeItLoginPage();
HomePage homePage=new HomePage();
    @When("^I click on login btn on let's codeit home page$")//lets coad it
    public void i_click_on_login_btn_on_home_page() throws Throwable {
        homePage.clickLogin();}

    @And("^I enter valid username$")
    public void i_enter_valid_username() throws Throwable {
letsCodeItLoginPage.email();
    }

    @And("^I enter valid password$")
    public void i_enter_valid_password() throws Throwable {
letsCodeItLoginPage.Password();
    }

    @And("^I click on login btn$")
    public void i_click_on_login_btn() throws Throwable {
letsCodeItLoginPage.pressLogin();
    }

}
