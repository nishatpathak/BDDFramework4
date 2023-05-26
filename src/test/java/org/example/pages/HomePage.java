package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;

    public class HomePage extends DriverManager {
        @FindBy(css = ".ico-login")//demo nopcommerce login btn
        public WebElement loginBtn;

       public void clickOnLoginBtn() {
            loginBtn.click();
        }

        @FindBy(css = ".ico-register")//demo nopcommerce registration btn
        public WebElement register1;

        public void clickRegisterBtn1() {
            register1.click();
        }
        @FindBy(xpath = "//*[@id=\"navbar-inverse-collapse\"]/div/div/a")//let's coadeit website login btn
        public WebElement loginButton;
        public void clickLogin(){
            loginButton.click();
        }
    }

