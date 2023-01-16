package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class FacebookPage {
    public FacebookPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);

}
@FindBy(xpath = "//*[@id='u_0_0_7r']")
public WebElement createACCBtn;
@FindBy(xpath = "//button[@type='submit'][@name='websubmit'][text()='Sign Up']")
public WebElement creatNewAccountBtn;

    @FindBy(xpath = "//input[@type='radio' and @value='1']")
    public WebElement femaleSel;

}