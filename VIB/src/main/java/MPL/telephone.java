package MPL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class telephone extends BasePage{
    public telephone(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath ="//input[@class='btn-primary w-50 ml5']")
    private WebElement butDangky;

    public void goToLead() throws InterruptedException {
        Thread.sleep(2000);
        butDangky.submit();
        Thread.sleep(3000);
    }
}
