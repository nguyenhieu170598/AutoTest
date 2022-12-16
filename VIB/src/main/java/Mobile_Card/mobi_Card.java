package Mobile_Card;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mobi_Card extends BasePage{
    public mobi_Card(WebDriver webDriver) {
        super(webDriver);
    }

    //Trường chọn mạng điện thoại
    @FindBy(xpath = "//img[@src='/mfast_assets/img/topup/mobifone.png?time=2']")
    private WebElement chkMobi;

    //Trường chọn số tiền
    @FindBy(xpath = "//div[@data-amount='50000']")
    private WebElement chkMoney;

    //Trường nhấn nút tiếp tục
    @FindBy(xpath = "//a[@class='js-continue_payment continue_payment']")
    private WebElement butContinue;

    public void goToInfo_Card() throws InterruptedException {
        chkMobi.click();
        Thread.sleep(2000);
        chkMoney.click();
        Thread.sleep(2000);
        butContinue.click();
        Thread.sleep(2000);
    }
}
