package Topup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addTelephone_Behind extends BasePage{
    public addTelephone_Behind(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath="//a[@class='btn-more_topup js-more_topup']")
    private WebElement butPay;

    @FindBy(xpath="//div[@style='display: block;']/div[2]/form[2]//img[@src='/mfast_assets/img/topup//viettel.png']")
    private WebElement checkViettel_Add;

    @FindBy(xpath = "//div[@style='display: block;']/div[2]/form[2]//div[@data-amount='200000']")
    private  WebElement checkMoney_Add;

    @FindBy(xpath = "//div[@style='display: block;']/div[2]/form[2]//input[@name='phone']")
    private  WebElement txtPhone_Add;

    @FindBy(xpath = "//a[@class='js-continue_payment continue_payment']")
    private  WebElement butContinue;

    public void goToInfo_Topup() throws InterruptedException {
        //Thread.sleep(2000);
        butPay.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1000)");
        checkViettel_Add.click();
        //Thread.sleep(2000);
        checkMoney_Add.click();
        //Thread.sleep(2000);
        txtPhone_Add.sendKeys("0938058692");
        //Thread.sleep(2000);
        butContinue.click();
    }

}
