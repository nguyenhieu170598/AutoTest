package Ins_Umployment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class success_Payment extends BasePage {
    public success_Payment(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath="//div[text()='Ví tích luỹ MFast']")
    private WebElement checkChoose;

    @FindBy(xpath="//button[@class='checkout-btn active']")
    private WebElement btContinue;

    public void gotosuccess() throws InterruptedException {
        //Thread.sleep(3000);
        checkChoose.click();
        //Thread.sleep(3000);
        btContinue.click();
    }
}
