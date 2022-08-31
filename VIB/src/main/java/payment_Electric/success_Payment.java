package payment_Electric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class success_Payment extends BasePage{
    public success_Payment(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath="//div[text()='Ví tích luỹ MFast']")
    private WebElement checkChoose;
}
