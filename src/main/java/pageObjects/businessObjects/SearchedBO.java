package pageObjects.businessObjects;

import org.testng.Assert;
import pageObjects.MainPage;
import pageObjects.SearchedPage;

public class SearchedBO {
    private SearchedPage searchedPage;

    public SearchedBO(){
        searchedPage = new SearchedPage();
    }

    public void verifyThatPAgeTitleEqualsWithFirstLink(){
        Assert.assertEquals(MainPage.getPageTitle(), new SearchedPage().getPageTitle());
    }
}
