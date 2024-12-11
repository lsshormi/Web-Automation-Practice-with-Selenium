package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {

    public WebDriver driver;
    @BeforeSuite
    public void openABrowser() {
        // open a browser
        driver = new ChromeDriver();
    }
    @AfterSuite
    public void closeBrowser() {
        // close browser
        driver.quit();
    }
}
