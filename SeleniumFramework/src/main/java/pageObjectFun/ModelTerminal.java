package pageObjectFun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ModelTerminal {

    @Test
    public void refresh() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("http://admin:123@10.12.102.148/sip/address");
        Thread.sleep(2000);
    for(int i=1;i<20;i++){
        driver.navigate().refresh();
    }

    }

}
