package payment_Electric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class confirm_Payment extends BasePage{
    public confirm_Payment(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath ="//a[text()='Thanh toán ngay']")
    private WebElement butConfirm;

    public void goToConfirm() throws InterruptedException {
        //Thread.sleep(2000);
        butConfirm.click();
        //Thread.sleep(5000);
    }
}
