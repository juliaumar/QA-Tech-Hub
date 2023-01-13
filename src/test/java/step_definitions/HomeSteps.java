package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();

    }

    @Given("I open url of homepage")
    public void i_open_url_of_homepage() {
        BrowserUtils.getDriver();

    }

    @When("Verify title of page {string}")
    public void verifyTitleOfPage(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);

    }

    @When("User opens url of Facebook {string}")
    public void userOpensUrlOfFacebook(String url) {
        BrowserUtils.getDriver().get(url);
        BrowserUtils.switchToNewWindow();
    }

    @Then("User verifies url of current page is {string}")
    public void userVerifiesUrlOfCurrentPageIs(String facebookUrl) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), facebookUrl);
    }

    @And("User navigates back to QA Tech Hub website")
    public void userNavigatesBackToQATechHubWebsite() {
        BrowserUtils.getDriver().navigate().back();
        BrowserUtils.switchToNewWindow();
    }

    @Then("User prints the URL of the current page")
    public void userPrintsTheURLOfTheCurrentPage() {
        String currentUrl = BrowserUtils.getDriver().getCurrentUrl();
        System.out.println("Current URL :: " + currentUrl);

    }

    @And("User navigates forward")
    public void userNavigatesForward() {
        BrowserUtils.getDriver().navigate().forward();

    }

    @Then("User reloads the page.")
    public void userReloadsThePage() {
        BrowserUtils.switchToNewWindow();
        BrowserUtils.getDriver().navigate().refresh();

    }

}