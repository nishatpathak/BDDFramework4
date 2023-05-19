package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverManager {


    public static WebDriver driver;
    String url = "https://demo.nopcommerce.com/";

    String browser = "Chrome";

    public DriverManager() {
        PageFactory.initElements(driver, this);
    }

    public void openLocalBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void getUrl() {
        driver.get(url);
    }


    public void applyWait() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void maxWindow() {
        driver.manage().window().maximize();
    }

    public void sleepWindow(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    public void closeWindow() {
        driver.quit();
    }


}
