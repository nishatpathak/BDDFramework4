package org.example.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetsCodeItLoginPage extends DriverManager {
    @FindBy(id = "email")//username
    public WebElement enterEmailAddress;
    public void email(){
        enterEmailAddress.sendKeys("abc.def@yahoo.com");
    }

    @FindBy(xpath = "//*[@id=\"login-password\"]")
    public WebElement enterPassword;
    public void Password(){
        enterPassword.sendKeys("123456");
    }
    @FindBy(id="login")//press on login btn
    public WebElement pressLoginBtn;
    public void pressLogin(){
        pressLoginBtn.click();
    }
    @FindBy(xpath = "//*[@class=\"dynamic-heading\"]")//My Courses Text
    public WebElement text;

    public String getTextLetsCoadIt() {
        String actualText =text.getText();
        return actualText;
    }


}
