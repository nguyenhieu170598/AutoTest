package Ins_Umployment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment extends BasePage {
    public Payment(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id="check_comfirm")
    private WebElement check_Confirm;

    @FindBy(xpath="//div[@class='action_payment end_payment']/a[@class='btn-primary']")
    private WebElement btContinue;

    public void gotoPayment() throws InterruptedException {
        Thread.sleep(3000);
        check_Confirm.click();
        Thread.sleep(3000);
        btContinue.click();
    }
}
