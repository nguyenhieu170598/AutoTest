package payment_Electric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class electric extends BasePage {

    public electric(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(name = "billCode")
    private WebElement nameCode;

    @FindBy(xpath = "//input[@class='btn-success']")
    private WebElement butSuccess;

    public void goToSuccess() throws InterruptedException {

        nameCode.sendKeys("Pd02t21768168101_s");
        Thread.sleep(5000);
        butSuccess.click();
        Thread.sleep(10000);
    }

}
