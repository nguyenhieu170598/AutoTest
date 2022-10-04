package Mobile_Card;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class add_Card_Vina extends BasePage{
    public add_Card_Vina(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//img[@src='/mfast_assets/img/topup/vinaphone.png?time=2']")
    private WebElement chkVina;

    @FindBy(xpath = "//div[@data-amount='50000']")
    private WebElement chkMoney;

    @FindBy(xpath = "//div[@id='topup_list']/div[1]/form/div/div/div//img[@class='quantity-plus']")
    private WebElement butAdd;

    @FindBy(name = "email")
    private WebElement chkEmail;
    public void goToInfo_Card() throws InterruptedException {
        chkVina.click();
        Thread.sleep(2000);
        chkMoney.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1000)");
        butAdd.click();
        Thread.sleep(2000);
        chkEmail.click();
        Thread.sleep(1000);

    }
}
