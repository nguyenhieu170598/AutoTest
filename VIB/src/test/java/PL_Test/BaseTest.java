package PL_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {
    protected WebDriver webDriver;

   @BeforeMethod
    public void beforeMethod() {
        System.out.println("----- Before Method -----");
//        webDriver = WebDriverManager.getInstance("Chrome").create();
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        //ImplicitWait - Which applied for all Element
        //SHOUD NOT use both ImplicitWait and ExplicitWait
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        webDriver.navigate().to("https://appay-rc.cloudcms.vn/finance/home?projectID=383&accessToken=20c5dd9f4584c781ca27cb67e383f7fceae28961");
    }

   /*

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        System.out.println("----- After Method -----");
        if (webDriver != null) {
            System.out.println("Closing Browser...");
            webDriver.quit();
        }
        Thread.sleep(5000);
    }

    */
}

