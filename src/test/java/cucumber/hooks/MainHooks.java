package cucumber.hooks;

import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MainHooks {
    @Before
    public void setup(){
        DriverFactory.initDriver();
    }

    @After
    public void close(){
        DriverFactory.quitDriver();
    }
}
