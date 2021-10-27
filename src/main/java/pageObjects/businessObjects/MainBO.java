package pageObjects.businessObjects;

import driver.DriverFactory;
import pageObjects.MainPage;
import resources.ConfProperties;

public class MainBO {
    private static MainPage mainPage;

    public MainBO(){
        mainPage = new MainPage();
    }

    public MainBO openPage(){
        DriverFactory.getDriver().get(ConfProperties.getProperty("BASE_URL"));
        return this;
    }
}
