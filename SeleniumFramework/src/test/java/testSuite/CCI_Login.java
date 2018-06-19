package testSuite;

import framework.BrowserEngine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.CctLogin;
import pageObject.CctMeeting;

import java.io.IOException;

public class CCI_Login {
    WebDriver driver = null;

    @BeforeClass
    public void setUp() throws IOException {
        BrowserEngine browserEngine = new BrowserEngine();
        browserEngine.initConfigData();
        driver = browserEngine.getBrowser();
    }

    @Test
    public void Login() {
        CctLogin cLogin = PageFactory.initElements(driver, CctLogin.class);
        cLogin.Login();
    }

    @Test
    public void LogOut() {
        CctMeeting IM1 = PageFactory.initElements(driver, CctMeeting.class);
        IM1.LogOut();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
