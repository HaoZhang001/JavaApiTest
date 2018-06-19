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
public class CCI_ScheduleConference {
    WebDriver driver;

    @BeforeClass
    public  void setUp() throws IOException{
        CCI_Login cciLogin= new CCI_Login();
        cciLogin.setUp();
        cciLogin.Login();
    }

    @Test
    public void schedule_Meeting() {
        CctMeeting IM=PageFactory.initElements(driver, CctMeeting.class);
        IM.scheduleMeeting();
        IM.wait(2);
    }

    @AfterClass
    public void tearDown() {
        CctMeeting IM1=PageFactory.initElements(driver, CctMeeting.class);
        IM1.LogOut();
        driver.quit();
    }
}
