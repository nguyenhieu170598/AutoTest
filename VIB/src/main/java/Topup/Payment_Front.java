package Topup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment_Front extends BasePage{
    public Payment_Front(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath="//button[@class='topup-button-check js-goto_payment']")
    private WebElement butPay;

    public void verify_Topup() throws InterruptedException {
        //Thread.sleep(2000);
        butPay.click();

    }
}
