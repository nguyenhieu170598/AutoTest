package Mobile_Card;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class viettel_Card extends BasePage{
    public viettel_Card(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//img[@src='/mfast_assets/img/topup/viettel.png?time=2']")
    private WebElement chkViettel;

    @FindBy(xpath = "//div[@data-amount='50000']")
    private WebElement chkMoney;

    @FindBy(xpath = "//a[@class='js-continue_payment continue_payment']")
    private WebElement butContinue;

    public void goToInfo_Card() throws InterruptedException {
        chkViettel.click();

        chkMoney.click();

        butContinue.click();

    }

}
