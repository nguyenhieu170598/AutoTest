package Ins_Umployment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class otp extends BasePage{
    public otp(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath="//input[@type='tel']")
    private WebElement otp_Text;

    @FindBy(xpath="//button[@type='button']")
    private WebElement otp_Confirm;

    public void gotootp() throws InterruptedException {
       // Thread.sleep(2000);
        otp_Text.sendKeys("1","2","3","4");
        //Thread.sleep(5000);
        //Thread.sleep(2000);
        //otp_Confirm.click();
        //Thread.sleep(2000);
    }
}
