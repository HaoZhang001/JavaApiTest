package pageObject;

import java.text.SimpleDateFormat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import framework.BasePage;
import framework.Logger;
import framework.LogType.LogTypeName;
public class CctMeeting extends BasePage{
    // 界面切换后，元素的位置也会发生改变
    @FindBy(xpath = "/html/body/div[2]/header/div[3]/div[2]/span[3]/a")
    WebElement 登出;
    @FindBy(xpath = ".//*[@id='acountedRelated']/i")
    WebElement 账户关联;
    @FindBy(xpath = ".//*[@id='pwd']/a/i")
    WebElement 修改密码;
    @FindBy(xpath = ".//*[@id='loginUser']")
    WebElement 用户名;
    @FindBy(xpath = ".//*[@id='container']/div/div[1]/div/a[1]")
    WebElement 组织会议;
    @FindBy(xpath = ".//*[@id='container']/div/div[2]/div[2]/div/div/div/div/a[2]")
    WebElement 立即开会;
    @FindBy(xpath = ".//*[@id='container']/div/div[2]/div[2]/div/div/div/div/a[1]")
    WebElement 安排会议;
    @FindBy(xpath = ".//*[@id='name']")
    WebElement 会议主题;
    @FindBy(xpath = ".//*[@id='startTime']")
    WebElement 开始时间;
    @FindBy(xpath = ".//*[@id='hour']")
    WebElement 计划时长小时;
    @FindBy(xpath = ".//*[@id='min']")
    WebElement 计划时长分钟;
    @FindBy(xpath = ".//*[@id='checkedUserCandidate']")
    WebElement 我是主持人;
    @FindBy(xpath = ".//*[@id='userInfo1']")
    WebElement 邀请参会者;
    @FindBy(xpath = ".//*[@id='addUser']")
    WebElement 添加参会者;
    @FindBy(xpath = ".//*[@id='applyForm']/div[2]/button[2]")
    WebElement 开始;
    @FindBy(xpath = ".//*[@id='container']/div/div[1]/div/a[2]")
    WebElement 我的会议;
    @FindBy(xpath = ".//*[@id='conferenceName']")
    WebElement 查询会议关键字;
    @FindBy(xpath = ".//*[@id='searchBtn']")
    WebElement 查询会议确定;

    @FindBy()
    WebElement 会控1;

    // *[@id="datagrid-row-r2-2-0"]/td[11]/div/button[2]
    //*[@id="datagrid-row-r1-2-0"]/td[11]/div/button[2]
    @FindBy(xpath = ".//*[@id='datagrid-row-r1-2-0']/td[11]/div/button[2]")
    WebElement 会控;
    @FindBy(xpath = ".//*[@id='datagrid-row-r2-2-0']/td[11]/div/button[2]")
    WebElement 会控2;
    @FindBy(xpath = ".//*[@id='datagrid-row-r3-2-0']/td[11]/div/button[2]")
    WebElement 会控3;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[2]/div/div/div[2]")
    WebElement 参会者名称;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]")
    WebElement 呼叫;
    @FindBy(xpath = ".//*[@id='conferenceStatusSelect']")
    WebElement 列名_会议状态;
    @FindBy(xpath = ".//*[@id='conferenceStatusSelect']/option[3]")
    WebElement 会议状态_正在进行中;
    @FindBy(xpath = ".//*[@id='container']/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[1]/table/tbody/tr/td[9]/a/span/span[2]")
    WebElement 刷新会议列表;

    // 生成不同的会议名称，方便定位到当前的会议
    static SimpleDateFormat df = new SimpleDateFormat("HHmmss");
    static String MeetName = "Auto-测试会议" + df.format(System.currentTimeMillis());
    static String CurrentDate = new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis());
    // 2018-03-29 10:53:54
    // static String MeetName=MeetingName;

    public CctMeeting(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public void enterMeeting(String meetingName) {
        Logger.Output(LogTypeName.INFO, "***执行" + Thread.currentThread().getStackTrace()[1].getMethodName() + "***");
        searchMeeting(meetingName);
        if(会控.isDisplayed()) {
            System.out.println("*********会控");
            click(会控);
            switchWindow(); //切换到新窗口
        }
        else if(会控1.isDisplayed()) {
            System.out.println("*********会控1");
            click(会控1);
            switchWindow(); //切换到新窗口
        }else {
            System.out.println("*********会控2");
            click(会控2);
            switchWindow(); //切换到新窗口
        }

    }

    public void LogOut() {
        Logger.Output(LogTypeName.INFO, "***执行" + Thread.currentThread().getStackTrace()[1].getMethodName() + "***");
        click(组织会议);
        wait(1);
        click(登出);
    }

    public void searchMeeting(String meetingName) {
        Logger.Output(LogTypeName.INFO, "***执行" + Thread.currentThread().getStackTrace()[1].getMethodName() + "***");
        click(我的会议);
        type(查询会议关键字, meetingName);
        click(查询会议确定);
        // click(刷新会议列表);
        wait(2);
        //	click(会控);
    }

    public String immediateMeeting() {
        Logger.Output(LogTypeName.INFO, "***执行" + Thread.currentThread().getStackTrace()[1].getMethodName() + "***");
        click(组织会议);
        click(立即开会);
        type(会议主题, MeetName);
        click(我是主持人);
        // type(邀请参会者, "zhanghao01@citycloud.com.cn");
        // click(添加参会者);
        click(开始);
        return MeetName;
    }

    public String scheduleMeeting() {
        Logger.Output(LogTypeName.INFO, "***执行" + Thread.currentThread().getStackTrace()[1].getMethodName() + "***");
        click(组织会议);
        click(安排会议);
        type(会议主题, MeetName);
        type(开始时间, CurrentDate + " 23:00:00");
        click(我是主持人);
        // type(邀请参会者, "zhanghao01@citycloud.com.cn");
        // click(添加参会者);
        click(开始);
        return MeetName;
    }
}
