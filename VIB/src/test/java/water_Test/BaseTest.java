package water_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

    public class BaseTest {
        protected WebDriver webDriver;
        protected WebDriverWait webDriverWait;

        private final int timeOut = 60;
        @BeforeMethod
        public void beforeMethod() {
            System.out.println("----- Before Method -----");
//        webDriver = WebDriverManager.getInstance("Chrome").create();
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
            webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(timeOut));
            //ImplicitWait - Which applied for all Element
            //SHOUD NOT use both ImplicitWait and ExplicitWait
          //  webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

            webDriver.navigate().to("https://appay-rc.cloudcms.vn/baokim/payment?serviceType=water&accessToken=419edc8d7792104be090347a9a5a86f68ef3af73");
        }

        @AfterMethod
        public void afterMethod() throws InterruptedException {
            System.out.println("----- After Method -----");
            if (webDriver != null) {
                System.out.println("Closing Browser...");
                webDriver.quit();
            }
            Thread.sleep(5000);
        }
    }
