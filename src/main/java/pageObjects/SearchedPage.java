package pageObjects;

import driver.DriverFactory;
import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchedPage {

    @FindBy(xpath = "//div[contains(@class, 'hero-header')]")
    private WebElement pageTitle;

    public SearchedPage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public String getPageTitle(){
        new BasePage().waitToVisibilityOf(5, pageTitle);
        return pageTitle.getText().trim();
    }
}
