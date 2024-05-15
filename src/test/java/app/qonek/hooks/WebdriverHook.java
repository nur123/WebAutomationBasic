package app.qonek.hooks;

import app.qonek.driver.WebDriverPool;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebdriverHook {

    @Before
    public void webDriverInit() {
        WebDriverPool.setupDriver();
    }

    @After
    public void webDriverDestroy() {
       WebDriverPool.tearDownDriver();
    }
}
