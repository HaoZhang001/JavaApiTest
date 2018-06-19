package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.BasePage;
import framework.LogType;
import framework.Logger;

public class CctLogin extends BasePage{
    public CctLogin(WebDriver driver) {
        super(driver);
        //System.out.println("执行CctLogin构造函数！！！！！！");
        // TODO Auto-generated constructor stub
    }
    @FindBy (xpath="html/body/header/div[3]/span")
    WebElement 登录链接;
    @FindBy (xpath=".//*[@id='userName']")
    WebElement 用户名;
    @FindBy (xpath=".//*[@id='password']")
    WebElement 密码;
    @FindBy (xpath=".//*[@id='login']/div[5]/button")
    WebElement 提交;
    @FindBy (xpath="html/body/header/div[2]/a[1]")
    WebElement 产品与解决方案;
    @FindBy (xpath="html/body/header/div[2]/a[2]")
    WebElement 下载应用与手册;
    @FindBy (xpath="html/body/header/div[2]/a[3]")
    WebElement 联系我们;
    @FindBy (xpath="html/body/header/div[2]/a[4]")
    WebElement 直播Live;
    @FindBy (xpath="html/body/header/div[3]/a[1]")
    WebElement 我要试用;
    @FindBy (xpath="html/body/header/div[3]/a[2]")
    WebElement 加入会议;
    @FindBy (xpath="html/body/header/div[3]/select")
    WebElement 语言选择;
    @FindBy (xpath="html/body/div[1]/div/div[1]")
    WebElement 微信登录;
    @FindBy (xpath="html/body/div[1]/div/div[2]/div[1]/img")
    WebElement 二维码图片;
    @FindBy (xpath=".//*[@id='wx_default_tip']/p[1]")
    WebElement 二维使用描述;
    @FindBy (xpath=".//*[@id='wx_default_tip']/p[2]")
    WebElement 云际会议;

    public void Login() {
        try {
            click(登录链接);
            //type(用户名, "user01@xncs.onecc.net");
            type(用户名, "zhanghao@citycloud.com.cn");
            type(密码, "123456");
            click(提交);
        } catch (Exception e) {
            Logger.Output(LogType.LogTypeName.ERROR, e.getMessage()+".");
        }

    }
    //	public WebDriver Init() {
//		BrowserEngine browserEngine = new BrowserEngine();
//		try {
//			browserEngine.initConfigData();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return browserEngine.getBrowser();
//	}
    public void checkElementExist() {

    }
}
