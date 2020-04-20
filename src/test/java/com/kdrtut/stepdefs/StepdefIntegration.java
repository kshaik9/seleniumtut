package com.kdrtut.stepdefs;

import com.kdrtut.base.DriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepdefIntegration {
    DriverInit driverInstance = null;
    WebDriver driver;

    @Before
    public void setuUp() {
        driverInstance = DriverInit.getDriverInstance();
    }

    @Given("browser is opened")
    public void browser_is_opened() {
        driver = driverInstance.openWebBrowser();
    }

    @When("{string} is accessed")
    public void is_accessed(String string) {
        driver.get(string);
    }

    @Then("user see google home page")
    public void user_see_google_home_page() {
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
