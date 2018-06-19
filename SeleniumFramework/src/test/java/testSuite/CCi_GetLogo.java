package testSuite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.BrowserEngine;
import pageObject.CctLogin;
import pageObject.CctMeeting;

public class CCi_GetLogo {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws IOException {
        //driver.deleteCookie("Cookie:administrator@istock.jrj.com.cn/", "c:/Administrator/AppData/local/Microsoft/Windows/Temporary Internet Files");
        BrowserEngine browserEngine = new BrowserEngine();
        browserEngine.initConfigData();
        driver = browserEngine.getBrowser();
        driver.manage().deleteAllCookies(); //删除所有的cookies
        CctLogin cLogin = PageFactory.initElements(driver, CctLogin.class);
        cLogin.Login();
    }

    @Test
    public void immediate_Meeting() {
        CctMeeting IM = PageFactory.initElements(driver, CctMeeting.class);
        IM.immediateMeeting();
        IM.wait(2);
    }

    @AfterClass
    public void tearDown() {
        CctMeeting IM1 = PageFactory.initElements(driver, CctMeeting.class);
        IM1.LogOut();
        driver.quit();
    }
}
