package com.tinyProject.step_definitions;

import com.tinyProject.pages.EdwardJonesMainPage;
import com.tinyProject.utilities.BrowserUtils;
import com.tinyProject.utilities.ConfigurationReader;
import com.tinyProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class EdJonesLoginStepDefs {

    EdwardJonesMainPage loginPage = new EdwardJonesMainPage();

    @Given("user is on main page")
    public void user_is_on_main_page() {

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.loginLink.click();
        BrowserUtils.waitForPageToLoad(10);
    }

    @Then("User should see Login page")
    public void user_should_see_login_page() {
        String expectedTitle = "Logon: Enter User ID | Edward Jones Account Access";
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
        System.out.println("Actual Title matches Expected title");
    }

}
