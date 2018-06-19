package testSuite;

import framework.BrowserEngine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.CctLogin;
import pageObject.CctMeeting;
import pageObjectFun.ModelTerminal;

import java.io.IOException;

public class CCI_CallParticipants {

    WebDriver driver;
    @BeforeClass
    public  void setUp() throws IOException {
        CCI_Login cciLogin= new CCI_Login();
        cciLogin.setUp();
        cciLogin.Login();
    }

    @Test
    public void callParticipants() throws InterruptedException {
        //创建会议
        CctMeeting IM=PageFactory.initElements(driver, CctMeeting.class);
        String conferenceName=IM.immediateMeeting();
        IM.wait(2);
        //进入会控
        IM.enterMeeting(conferenceName);
        //在线注册
        ModelTerminal terminal=new ModelTerminal();
        terminal.refresh();
        //呼叫指定参会者

    }

    @AfterClass
    public void tearDown() {
        //结束会议

        //退出浏览器
        CctMeeting IM1=PageFactory.initElements(driver, CctMeeting.class);
        IM1.LogOut();
        driver.quit();
    }

}
