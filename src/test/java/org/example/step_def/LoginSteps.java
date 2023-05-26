
package org.example.step_def;

import cucumber.api.java.en.Then;
import org.example.pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    LoginPage loginPage=new LoginPage();
   @Then("^I should see \"([^\"]*)\" text$")
    public void i_should_see_text(String expectedText) throws Throwable {
       String actualText= loginPage.getWelcomeText();
       assertEquals(expectedText,actualText);
    }

    @Then("^the url should contain \"([^\"]*)\"$")
    public void the_url_should_contain(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
@Then("^the text \"([^\"]*)\"$")
public void the_text(String arg1) throws Throwable {

        }


}
