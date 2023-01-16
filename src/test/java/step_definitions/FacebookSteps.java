package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.annotation.Contract;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import pages.FacebookPage;
import pages.HomePage;
import pojos.User;
import utils.BrowserUtils;

public class FacebookSteps implements CommonPage {
    FacebookPage facebookPage;

    public FacebookSteps() {
        facebookPage = new FacebookPage();

    }
    @Given("I open url of Facebook {string}")
    public void iOpenUrlOfFacebook(String facebookUrl) {
        BrowserUtils.getDriver().get(facebookUrl);
    }

    @Then("User verify url of current page is {string}")
    public void userVerifyUrlOfCurrentPageIs(String url) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), url);
    }

    @Then("Verify {string} section on the page")
    public void verifySectionOnThePage(String createAccBtn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, createAccBtn))));
    }

    @And("Fill in the First Name, Last name, email address, new password")
    public void fillInTheFirstNameLastNameEmailAddressNewPassword() {

       BrowserUtils.getDriver().findElement(By.name("firstname")).sendKeys(("Alima"));
        BrowserUtils.getDriver().findElement(By.name("lastname")).sendKeys("Yusufova");
        BrowserUtils.getDriver().findElement(By.name("reg_email__")).sendKeys("gloriya71@yandex.ru");
        BrowserUtils.getDriver().findElement(By.name("reg_passwd__")).sendKeys("Qwert!@#$%");
    }

    @Then("Update the date of birth in the drop-down.")
    public void updateTheDateOfBirthInTheDropDown() {
        Select selDate = new Select(BrowserUtils.getDriver().findElement(By.id("day")));
        selDate.selectByVisibleText("15");
        Select selMonth = new Select(BrowserUtils.getDriver().findElement(By.id("month")));
        selMonth.selectByVisibleText("Feb");
        Select selYear = new Select(BrowserUtils.getDriver().findElement(By.id("year")));
        selYear.selectByVisibleText("1995");
    }

    @And("Select gender")
    public void selectGender() {
        BrowserUtils.click(facebookPage.femaleSel);
        

    }




    @And("Verify that the account is created successfully")
    public void verifyThatTheAccountIsCreatedSuccessfully() {
    }


    @Then("Click on Create an account Sign Up")
    public void clickOnCreateAnAccountSignUp() {
        BrowserUtils.getDriver().findElement(By.name("reg_email_confirmation__")).sendKeys("gloriya71@yandex.ru");
      BrowserUtils.click(facebookPage.creatNewAccountBtn);



    }
}
