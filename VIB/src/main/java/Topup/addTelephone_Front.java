package Topup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addTelephone_Front extends BasePage{
    public addTelephone_Front(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath="//span[@class='ico_plus']")
    private WebElement butPay;

    @FindBy(xpath="//div[@class='topup_item'][@style='display: block;']/div[@class='topup_item_content']/form[@id='topup-form-prepaid']/div/div/img[@src='/mfast_assets/img/topup//viettel.png']")
    private WebElement checkViettel_Add;

    @FindBy(xpath = "//div[@class='topup_item'][@style='display: block;']/div[@class='topup_item_content']/form[@id='topup-form-prepaid']/div[3]/div/div/div[2]")
    private  WebElement checkMoney_Add;

    @FindBy(xpath = "//div[@class='topup_item'][@style='display: block;']/div[@class='topup_item_content']/form[@id='topup-form-prepaid']/div[4]/div/input[@name='phone']")
    private  WebElement txtPhone_Add;

    @FindBy(xpath = "//a[@class='js-continue_payment continue_payment']")
    private  WebElement butContinue;

    public void goToInfo_Topup() throws InterruptedException {

        butPay.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1000)");
        //Thread.sleep(2000);
        checkViettel_Add.click();
        //Thread.sleep(2000);
        checkMoney_Add.click();
        //Thread.sleep(2000);
        txtPhone_Add.sendKeys("0938058692");
        //Thread.sleep(2000);
        butContinue.click();
    }
}
