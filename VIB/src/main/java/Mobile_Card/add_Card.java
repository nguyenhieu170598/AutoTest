package Mobile_Card;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class add_Card extends BasePage{
    public add_Card(WebDriver webDriver) {
        super(webDriver);
    }

    //Trường nhấn mua thêm thẻ cào
    @FindBy(xpath = "//a[@class='btn-more_topup js-more_topup']")
    private WebElement butPay;

    //Trường chọn nhà mạng điện thoại
    @FindBy(xpath = "//div[@style='display: block;'][@class='topup_item']/form/div//img[@src='/mfast_assets/img/topup/mobifone.png?time=2']")
    private WebElement chkMobi_Add;

    //Trường chọn số tiền
    @FindBy(xpath = "//div[@style='display: block;'][@class='topup_item']/form/div/div[1]/div[5]/div/div[@data-amount='100000']")
    private WebElement chkMoney_Add;

    //Trường nhấn nút tiếp tục
    @FindBy(xpath = "//a[@class='js-continue_payment continue_payment']")
    private WebElement butContinue;

    public void goToInfo_Card_Add() throws InterruptedException {
        butPay.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        chkMobi_Add.click();
        Thread.sleep(2000);
        chkMoney_Add.click();
        Thread.sleep(2000);
        butContinue.click();
        Thread.sleep(2000);

    }

}
