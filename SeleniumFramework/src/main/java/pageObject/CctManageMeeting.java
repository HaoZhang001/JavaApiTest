package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.BasePage;
import framework.LogType.LogTypeName;
import framework.Logger;
public class CctManageMeeting extends BasePage{

    public String SET_AS_SPEAKER="设置主讲人成功！";
    public String CANCEL_SPEAKER="设置主讲人成功！";
    public String SET_AS_HOST="设置主讲人成功！";
    public String CANCEL_HOST="设置主讲人成功！";
    public String LOCK_MEETING="设置主讲人成功！";
    public String UNLOCK_MEETING="设置主讲人成功！";
    //*[@id="app"]/div[1]/div[1]/div[1]/span[1]
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[1]/div[1]/span[1]")
    WebElement 会议名称;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[1]/div[2]/span[1]")
    WebElement 会议时间;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[1]/div[2]/span[2]")
    WebElement 预约时长;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[1]/div[2]/span[3]")
    WebElement 会议号;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[1]/div[2]/span[4]")
    WebElement 参会密码;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[1]/div[2]/span[5]")
    WebElement 主持人密码;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[1]/div[2]/span[6]")
    WebElement 当前模式;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[2]/button")
    WebElement 视频入会;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]/span")
    WebElement 层级;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/label[2]/span")
    WebElement 列表;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]")
    WebElement 呼叫;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/button[2]")
    WebElement 通知;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/button[3]")
    WebElement 刷新;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div/i")
    WebElement 查询;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/span[1]/div/span/span")
    WebElement 入会自动静音;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/span[2]/span/i")
    WebElement 设置;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/label/span[1]/span")
    WebElement 列名_全选;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/span/span")
    WebElement 列名_参会者;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/span/span")
    WebElement 列名_角色;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]")
    WebElement 列名_在线状态;
    @FindBy(xpath = ".//*[@id='el-popover-2166']/div[1]/div[2]/div[2]/div[2]/div/label/span[1]/span")
    WebElement 在线状态_全部;
    @FindBy(xpath = ".//*[@id='el-popover-2166']/div[1]/div[2]/div[2]/div[2]/div/div/label[1]/span[1]/span")
    WebElement 在线状态_在线;
    @FindBy(xpath = ".//*[@id='el-popover-2166']/div[1]/div[3]/span[2]")
    WebElement 在线状态_确定;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[3]/span/span")
    WebElement 列名_静音;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[4]/span/span")
    WebElement 列名_通讯质量;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[5]/span/span")
    WebElement 列名_类型;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[6]/span/span")
    WebElement 列名_入会时间;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[2]/div/div/div[3]/div[7]/button[2]")
    WebElement 设为and取消主持人;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[2]/div/div/div[3]/div[7]/button[1]")
    WebElement 设为and取消主讲人;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[2]/div/div/div[3]/div[7]/button[3]")
    WebElement 静音;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[2]/div/div/div[3]/div[7]/button[5]")
    WebElement 挂断;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[2]/div/div/div[3]/div[7]/button[6]")
    WebElement 移除;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/span[1]/span")
    WebElement 在线人数;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/span[2]/span")
    WebElement 离线人数;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/span[3]/span")
    WebElement 总人数;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[1]/span")
    WebElement 全部静音text;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[1]/button")
    WebElement 全部静音btn;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[2]/span")
    WebElement 取消全部静音text;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[2]/button")
    WebElement 取消全部静音btn;

    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[3]/span[2]")
    WebElement 直播and取消直播text;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[3]/button")
    WebElement 直播and取消直播btn;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[4]/span")
    WebElement 录制and取消录制text;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[4]/button")
    WebElement 录制and取消录制btn;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[5]/span")
    WebElement 分屏text;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[5]/button")
    WebElement 分屏btn;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[6]/span")
    WebElement 呼叫离线text;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[6]/button")
    WebElement 呼叫离线btn;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[7]/span")
    WebElement 锁定会议text;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[7]/button")
    WebElement 锁定会议btn;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[8]/span")
    WebElement 延长会议text;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[8]/button")
    WebElement 延长会议btn;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[9]/span")
    WebElement 结束会议text;
    @FindBy(xpath = ".//*[@id='app']/div[1]/div[3]/div[2]/div[9]/button")
    WebElement 结束会议btn;

    public void allElementExitCk() {
        WebElement[] elementArray = { 会议名称, 会议时间, 预约时长, 会议号, 参会密码, 主持人密码, 当前模式, 视频入会, 层级, 列表, 呼叫,
                通知, 刷新, 查询, 入会自动静音, 设置, 列名_全选, 列名_参会者, 列名_角色, 列名_在线状态, 列名_静音, 列名_通讯质量, 列名_类型,
                列名_入会时间,在线人数, 离线人数, 总人数, 全部静音text, 取消全部静音text,
                直播and取消直播text, 录制and取消录制text, 分屏text, 呼叫离线text, 锁定会议text, 延长会议text, 结束会议text};
        for(WebElement x:elementArray) {
            //verifyElementIsPresent(x);

        }
    }

    public void enterVideoMeeting() {
        Logger.Output(LogTypeName.INFO,"***视频入会***");
        click(视频入会);
    }
    public void filterOnlinePeople() {
        Logger.Output(LogTypeName.INFO,"***筛选在线参会者***");
        click(列名_在线状态);
        click(在线状态_全部);
        click(在线状态_在线);
        click(在线状态_确定);
    }
    public void setAsSpeaker(WebDriver driver) {
        click(设为and取消主讲人);
        alertGetText(driver, SET_AS_SPEAKER);
    }

    public void cancelSpeaker(WebDriver driver) {
        click(设为and取消主讲人);
        alertGetText(driver, CANCEL_SPEAKER);
    }

    public void setAsHost(WebDriver driver) {
        click(设为and取消主持人);
        alertGetText(driver, SET_AS_HOST);
    }

    public void cancelHost(WebDriver drivert) {
        click(设为and取消主持人);
        alertGetText(driver, CANCEL_HOST);
    }
    public CctManageMeeting(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
}
