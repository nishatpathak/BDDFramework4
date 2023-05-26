package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {
    DriverManager drivermanager= new DriverManager();
    @Before
    public void setUp() throws InterruptedException {
        drivermanager.openLocalBrowser();
        drivermanager.maxWindow();
        drivermanager.getUrl();
       // drivermanager.getUrl();
        drivermanager.applyWait();
        drivermanager.sleepWindow(5000);
        drivermanager.getRandomString(12);
        drivermanager.generateRandomNumber();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            drivermanager.takeScreenshot(scenario);
        }
        drivermanager.closeWindow();
    }

}



