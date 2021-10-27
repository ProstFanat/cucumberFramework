package cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.testng.reporters.jq.Main;
import pageObjects.MainPage;
import pageObjects.businessObjects.MainBO;
import pageObjects.businessObjects.SearchedBO;

public class MyStepdefs {
    private MainPage mainPage;

    public MyStepdefs(){
        mainPage = new MainPage();
    }

    @Given("open page cucumber")
    public void openPageCucumber() {
        new MainBO().openPage();
    }

    @When("user click on button search")
    public void clickOnButtonSearch() {
        mainPage.clickBtnSearch();
    }

    @And("user input {string} in search field")
    public void inputInSearchField(String searchText) {
        mainPage.inputInSearchInput(searchText);
    }

    @When("user filter results by Blog parameter")
    public void filterResultsByBlog() {
        mainPage.filterByBlog();
    }

    @When("user open first link")
    public void userOpenFirstLink() {
        mainPage.clickOnFirstSearchedLink();
    }

    @Then("page with title from first link is opened")
    public void pageWithTitleFromFirstLinkIsOpened() {
        new SearchedBO().verifyThatPAgeTitleEqualsWithFirstLink();
    }
}
