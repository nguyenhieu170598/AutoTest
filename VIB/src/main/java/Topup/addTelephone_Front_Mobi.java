package Topup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addTelephone_Front_Mobi extends BasePage{
    public addTelephone_Front_Mobi(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath="//form[@id='topup-form-prepaid']/div[contains(@class, 'finance-company')]/div/img[@src='/mfast_assets/img/topup//mobifone.png']")
    private WebElement checkMobi;

    @FindBy(xpath = "//div[@class='topup_option_contain']/div/div/div[6]")
    private  WebElement checkMoney;

    @FindBy(name = "phone")
    private  WebElement txtPhone;

    public void goToInfo_Topup() throws InterruptedException {
        checkMobi.click();
        //Thread.sleep(2000);
        checkMoney.click();
        //Thread.sleep(2000);
        txtPhone.sendKeys("0938058692");
        //Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1000)");

    }
}
