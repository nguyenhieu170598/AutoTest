package Topup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class addTelephone_Behind_Viettel extends BasePage{
    public addTelephone_Behind_Viettel(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath="//div[@data-type='postpaid']")
    private WebElement chkBehind;

    @FindBy(xpath="//form[@id='topup-form-postpaid']/div[contains(@class, 'finance-company')]/div/img[@src='/mfast_assets/img/topup//viettel.png']")
    private WebElement checkViettel;

    @FindBy(xpath = "//form[@id='topup-form-postpaid']//div[@data-amount='500000']")
    private  WebElement checkMoney;

    @FindBy(xpath = "//form[@id='topup-form-postpaid']/div[4]/div//input")
    public WebElement txtPhone;

    public void check_Behind() throws InterruptedException {

        chkBehind.click();
        //Thread.sleep(2000);
        checkViettel.click();
        //Thread.sleep(2000);
        checkMoney.click();
        //Thread.sleep(2000);
        txtPhone.sendKeys("0948339596");
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1000)");
    }
}
