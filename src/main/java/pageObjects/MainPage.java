package pageObjects;

import driver.DriverFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.lang.String.format;

public class MainPage {
    private static final Logger LOG = Logger.getLogger(MainPage.class);
    private static String pageTitle = "";

    @FindBy(xpath = "//a[contains(@class, 'sb-search-ico')][contains(@class, 'nav-link')]")
    private WebElement btnSearch;

    @FindBy(xpath = "//input[@placeholder = 'Search...']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@data-location = 'Cucumber_Blog' and @class = 'filter-item-name']")
    private WebElement btnFilterByBlog;

    @FindBy(xpath = "//div[@class='result-list']//div[@class='link-title']")
    private WebElement firstElementInList;

    @FindBy(xpath = "//div[@class='result-list']//div[@class='link-title']")
    private List<WebElement> listOfSearchTitles;

    public MainPage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public static String getPageTitle() {
        return pageTitle;
    }

    public MainPage clickBtnSearch(){
        new BasePage().waitToVisibilityOf(5, btnSearch);
        btnSearch.click();
        LOG.info("Btn search clicked!");
        return this;
    }

    public MainPage inputInSearchInput(String text){
        searchInput.clear();
        searchInput.sendKeys(text);
        searchInput.sendKeys(Keys.ENTER);
        LOG.info(format("Input '%s' in to search input", text));
        return this;
    }

    public MainPage filterByBlog(){
        btnFilterByBlog.click();
        LOG.info("Searched results filtered by Blog");
        return this;
    }

    public MainPage clickOnFirstSearchedLink(){
        new BasePage().waitToVisibilityOf(5000, firstElementInList);
        pageTitle = listOfSearchTitles.get(0).getText().trim();
        listOfSearchTitles.get(0).click();
        return this;
    }
}
