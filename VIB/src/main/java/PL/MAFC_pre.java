package PL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MAFC_pre extends BasePage{
    public MAFC_pre(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath="//a[@href='#tab-2']")
    private WebElement checkAdd;

    public void goToMAFC() throws InterruptedException {
        //Thread.sleep(2000);
       checkAdd.click();
    }
}
