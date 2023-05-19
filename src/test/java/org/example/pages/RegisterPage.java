package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends DriverManager {
    @FindBy(css = "#gender-female")//female radio button
    public WebElement clickOnRadioBtn;

    public void clickRadioBtn() {
        clickOnRadioBtn.click();
    }

    @FindBy(id = "FirstName")//first name
    public WebElement writeFirstName;

    public void writeName1() {
        writeFirstName.sendKeys("Nisha");
    }

    @FindBy(id = "LastName")//last name
    public WebElement WriteLastName;

    public void WriteName2() {
        WriteLastName.sendKeys("Pathak");
    }

    @FindBy(xpath = "//*[@name=\"DateOfBirthDay\"]/option[4]")//3 number selected
    public WebElement Date;

    public void clickDate() {
        Date.click();
    }

    @FindBy(xpath = "//*[@name=\"DateOfBirthMonth\"]/option[3]")//february
    public WebElement month;

    public void clickOnMonth() {
        month.click();
    }

    @FindBy(xpath = "//*[@name=\"DateOfBirthYear\"]/option[75]")//1986
    public WebElement year;

    public void clickOnYear() {
        year.click();
    }

    @FindBy(xpath = "//input[@id=\"Email\"]")//email
    public WebElement email;

    public void clickOnEmail() {
        email.sendKeys("nisha.pathak@yahoo.com");
    }

    @FindBy(id = "Password")
    public WebElement password;

    public void clickOnPassword() {
        password.sendKeys("123456");
    }

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmpassword;

    public void clickConfirmPassword() {
        confirmpassword.sendKeys("123456");
    }

    @FindBy(id = "register-button")
    public WebElement register;

    public void clickOnRegister() {
        register.click();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
    WebElement RegisterText;

    public String getRegistrationText() {
        String actualText = RegisterText.getText();//Your registration completed text
        return actualText;
    }

}
