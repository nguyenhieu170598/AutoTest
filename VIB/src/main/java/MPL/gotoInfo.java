package MPL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class gotoInfo extends BasePage{
    public gotoInfo(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath ="//a[@class='btn_regis_account']")
    private WebElement butGotoInfo;

    public void goToInfo() throws InterruptedException {
        Thread.sleep(2000);
        butGotoInfo.click();
        Thread.sleep(3000);
    }
}
