package Topup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class topup_Front_Viettel_10 extends BasePage{
    public topup_Front_Viettel_10(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath="//form[@id='topup-form-prepaid']/div[contains(@class, 'finance-company')]/div/img[@src='/mfast_assets/img/topup//viettel.png']")
    private WebElement checkViettel;

    @FindBy(xpath = "//div[@class='topup_option_contain']/div/div/div[1]")
    private  WebElement checkMoney;

    @FindBy(name = "phone")
    private  WebElement txtPhone;
    @FindBy(xpath = "//a[@class='js-continue_payment continue_payment']")
    private  WebElement butContinue;

    public void goToInfo_Topup() throws InterruptedException {
        checkViettel.click();
        //Thread.sleep(2000);
        checkMoney.click();
        //Thread.sleep(2000);
        txtPhone.sendKeys("0938058692");
        //Thread.sleep(2000);
        butContinue.click();
        //Thread.sleep(2000);
    }

}
