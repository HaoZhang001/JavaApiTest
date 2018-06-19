package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import framework.LogType.LogTypeName;

public class BasePage {
    public static WebDriver driver;
    public static String pageTitle;
    public static String pageUrl;

    /*
     * 构造方法
     */
    public BasePage(WebDriver driver) { // CctLogin 传过来的driver
        BasePage.driver = driver;
        // System.out.println("执行BasePage构造函数！！！！！！");

    }

    /**
     * 等待元素加载完成 等待时间（毫秒）,超过时间则报加载超时，例子: waitEleLoaded(element,10000);
     */
    public void waitEleLoaded(WebElement element, int timeout) {
        try {
            int i = 0;
            while (i < timeout) {
                if (element.isDisplayed()) {
                    // Logger.Output(LogType.LogTypeName.INFO,"等待了" + i*0.5+"s元素出现！");
                    return;
                } else
                    Thread.sleep(500);
                i++;
            }
            Logger.Output(LogTypeName.ERROR, "等待:" + timeout + "超时。");
            assertFalse(true, timeout + "S等待加载超时！");
        } catch (Exception e) {
            Logger.Output(LogType.LogTypeName.ERROR, "元素可能不存在！");
        }
    }

    public void wait(int i) {
        try {
            Thread.sleep(i * 1000);
            Logger.Output(LogTypeName.INFO, "等待" + i + "秒。");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*
     * 根据内容选择下拉框选项
     */
    public void select(WebElement element, String value) {

        try {
            if (element.isEnabled()) {
                Select sel = new Select(element);
                sel.selectByValue(value);
                Logger.Output(LogTypeName.INFO, "选择值为:" + value + "的下拉框选项.");
            }
        } catch (Exception e) {
            Logger.Output(LogType.LogTypeName.ERROR, "元素可能不存在！");
            // Logger.Output(LogType.LogTypeName.ERROR, e.getMessage() + ".");
        }
    }

    /*
     * 获取弹出框文本
     */
    public void alertGetText(WebDriver driver, String result) {
        String text = driver.switchTo().alert().getText();
        Logger.Output(LogTypeName.INFO, "获取弹出窗文本为:" + text);
        assertEquals(text, result);
        // assertNotNull(text, "未获取弹出框内容！");
    }

    /*
     * 点击弹出框确认
     */
    public void alertAceept(WebDriver driver) {
        driver.switchTo().alert().accept();
        Logger.Output(LogTypeName.INFO, "点击弹出框确认按钮！");
    }

    /*
     * 点击弹出框取消
     */
    public void alertCancel(WebDriver driver) {
        driver.switchTo().alert().dismiss();
        Logger.Output(LogTypeName.INFO, "点击弹出框取消按钮！");
    }

    /*
     * 弹出框存在返回true，不存在返回false
     */
    public boolean alertExit(WebDriver driver) {
        try {
            driver.switchTo().alert();
        } catch (Exception e) {
            Logger.Output(LogTypeName.INFO, "弹出窗不存在！");
            return false;
        }
        Logger.Output(LogTypeName.INFO, "弹出窗存在！");
        return true;
    }

    /*
     * 获取元素的文本信息
     */
    public void getText(WebElement element) {
        String text = null;
        try {
            if (element.isEnabled()) {
                // String tag= element.getTagName();
                text = element.getText();
                Logger.Output(LogType.LogTypeName.INFO, "获取元素的文本: " + text);

            }
        } catch (Exception e) {
            Logger.Output(LogType.LogTypeName.ERROR, "未获取元素的文本信息");
            assertNotNull(text, "未获取元素的文本信息");
        }

    }

    /*
     * 在文本框内输入字符
     */
    protected void type(WebElement element, String text) {
        try {
            if (element.isEnabled()) {
                Thread.sleep(1000);
                element.clear();
                element.sendKeys(text);
                Logger.Output(LogType.LogTypeName.INFO, "输入框填写: " + text + ".");
            }
        } catch (Exception e) {
            Logger.Output(LogType.LogTypeName.ERROR, "元素不存在或者不可操作！");
            assertFalse(true, "元素不存在或者不可操作!");
        }

    }

    /*
     * 点击元素，这里指点击鼠标左键
     */
    protected void click(WebElement element) {

        try {
            if (element.isEnabled() && element.isDisplayed()) {
                String str = element.getText();
                Logger.Output(LogType.LogTypeName.INFO, "鼠标单击元素: " + str + "。");
                element.click();
            }
        } catch (Exception e) {
            Logger.Output(LogType.LogTypeName.ERROR, "元素不存在或者无法操作！");
            assertFalse(true, "元素不存在或者无法操作！");
        }

    }

    /*
     * 双击指定元素
     */
    protected void doubleClick(WebElement element) {
        // 使用鼠标单击、双击、右击、拖拽等动作；或者键盘输入、快捷键使用、组合键使用等模拟键盘的操作。
        // 在 WebDeriver 中，有一个专门的类来负责实现这些测试场景，那就是 Actions 类

        try {
            if (element.isEnabled()) {
                Actions actions = new Actions(driver);
                actions.doubleClick(element);
                Logger.Output(LogType.LogTypeName.INFO, "鼠标双击元素: " + element.getText() + ".");
            }
        } catch (Exception e) {
            Logger.Output(LogType.LogTypeName.ERROR, "元素不存在或者无法操作！");
            assertFalse(true, "元素不存在或者无法操作！");

        }
    }

    /*
     * 鼠标移动到元素上
     */
    protected void mouseOver(WebElement element) {
        try {
            if (element.isEnabled()) {
                Actions actions = new Actions(driver);
                actions.moveToElement(element);
                Logger.Output(LogType.LogTypeName.INFO, "鼠标移动到元素上: " + element.getText());
            }
        } catch (Exception e) {
            Logger.Output(LogType.LogTypeName.ERROR, "元素不存在或者无法操作！");
            assertFalse(true, "元素不存在或者无法操作！");
        }

    }

    /*
     * 在文本输入框执行清除操作
     */
    protected void clean(WebElement element) {

        try {
            if (element.isEnabled()) {
                element.clear();
                Logger.Output(LogType.LogTypeName.INFO, "清空文本输入框: " + element.toString() + " was cleaned.");
            }
        } catch (Exception e) {
            Logger.Output(LogType.LogTypeName.ERROR, "元素不存在或者无法操作！");
            assertFalse(true, "元素不存在或者无法操作！");
        }

    }

    /*
     * 判断一个页面元素是否显示在当前页面
     */

    protected boolean verifyElementIsPresent(WebElement element) {

        try {
            if (element.isDisplayed()) {
                Logger.Output(LogType.LogTypeName.INFO, "元素存在当前页面 ：" + element.getText());
                return true;
            }
        } catch (Exception e) {
            Logger.Output(LogType.LogTypeName.ERROR, element.getText() + "元素不存在或者无法操作！");
            assertFalse(true, element.getText() + "元素不存在或者无法操作！");
        }
        return false;
    }

    /*
     * 获取页面的标题
     */
    protected String getCurrentPageTitle() {

        pageTitle = driver.getTitle();
        Logger.Output(LogType.LogTypeName.INFO, "获取页面标题： " + pageTitle);
        return pageTitle;
    }

    /*
     * 获取页面的url
     */
    protected String getCurrentPageUrl() {

        pageUrl = driver.getCurrentUrl();
        Logger.Output(LogType.LogTypeName.INFO, "获取页面URL: " + pageUrl);
        return pageUrl;
    }

    public void switchSpecifyWindow(String sw) {
        WebDriver window = driver.switchTo().window(sw);
        Logger.Output(LogType.LogTypeName.INFO, "切换到： " + window.getTitle());
    }

    /*
     * 处理多窗口之间切换
     */
    public void switchWindow() {
        String currentWindow = driver.getWindowHandle();// 获取当前窗口句柄
        Set<String> handles = driver.getWindowHandles();// 获取所有窗口句柄
        Logger.Output(LogType.LogTypeName.INFO, "当前窗口数量： " + handles.size());
        Iterator<String> it = handles.iterator();
        while (it.hasNext()) {
            if (currentWindow == it.next()) {
                continue;
            }
            try {
                // driver.close();
                WebDriver window = driver.switchTo().window(it.next());// 切换到新窗口
                Logger.Output(LogType.LogTypeName.INFO, "新窗口是： " + window.getTitle());
                Logger.Output(LogType.LogTypeName.INFO, "当前窗口是： " + window.getTitle());
            } catch (Exception e) {
                Logger.Output(LogType.LogTypeName.ERROR, "无法切换到新打开窗口！");
                assertFalse(true, "无法切换到新打开窗口！");
            }
            // driver.close();//关闭当前焦点所在的窗口
        }
        // driver.switchTo().window(currentWindow);//回到原来页面
    }
}
