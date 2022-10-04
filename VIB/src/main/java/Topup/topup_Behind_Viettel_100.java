package Topup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class topup_Behind_Viettel_100 extends BasePage {
    public topup_Behind_Viettel_100(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath="//div[@data-type='postpaid']")
    private WebElement chkBehind;

    @FindBy(xpath="//form[@id='topup-form-postpaid']/div[contains(@class, 'finance-company')]/div/img[@src='/mfast_assets/img/topup//viettel.png']")
    private WebElement checkViettel;

    @FindBy(xpath = "//form[@id='topup-form-postpaid']//div[@data-amount='100000']")
    private  WebElement checkMoney;

    @FindBy(xpath = "//form[@id='topup-form-postpaid']/div[4]/div//input")
    private  WebElement txtPhone;
    @FindBy(xpath = "//a[@class='js-continue_payment continue_payment']")
    private  WebElement butContinue;
    public void check_Behind() throws InterruptedException {
        chkBehind.click();
        //Thread.sleep(2000);
        checkViettel.click();
        //Thread.sleep(2000);
        checkMoney.click();
        //Thread.sleep(2000);
        txtPhone.sendKeys("0948339596");
        //Thread.sleep(2000);
        butContinue.click();

    }

}
