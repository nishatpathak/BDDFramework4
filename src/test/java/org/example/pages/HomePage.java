package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;

    public class HomePage extends DriverManager {
        @FindBy(css = ".ico-login")
        public WebElement loginBtn;

        public void clickOnLoginBtn() {
            loginBtn.click();
        }

        @FindBy(css = ".ico-register")
        public WebElement register1;

        public void clickRegisterBtn1() {
            register1.click();
        }
    }

