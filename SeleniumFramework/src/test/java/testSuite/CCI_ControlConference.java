package testSuite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.BrowserEngine;
import pageObject.CctLogin;
import pageObject.CctManageMeeting;
import pageObject.CctMeeting;
public class CCI_ControlConference {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws IOException {
        CCI_Login cciLogin=new CCI_Login();
        cciLogin.setUp();
        cciLogin.Login();
    }

    @Test
    public void allElementCheck() {
        String mN = null;
        CctMeeting cM = PageFactory.initElements(driver, CctMeeting.class);
        mN = cM.immediateMeeting();
        System.out.println("会议名称：   "+mN);
        cM.wait(2);
        cM.enterMeeting(mN);
        CctManageMeeting cMM = PageFactory.initElements(driver, CctManageMeeting.class);
        cMM.allElementExitCk();
    }

    @AfterClass
    public void tearDown() {
        //	CctMeeting IM1 = PageFactory.initElements(driver, CctMeeting.class);
        //	IM1.LogOut();
        driver.quit();
    }
}
