package Topup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class topup_Front_Vina_200 extends BasePage{
    public topup_Front_Vina_200(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath="//form[@id='topup-form-prepaid']/div[contains(@class, 'finance-company')]/div/img[@src='/mfast_assets/img/topup//vinaphone.png']")
    private WebElement checkVina;

    @FindBy(xpath = "//div[@class='topup_option_contain']/div/div/div[5]")
    private  WebElement checkMoney;

    @FindBy(name = "phone")
    private  WebElement txtPhone;
    @FindBy(xpath = "//a[@class='js-continue_payment continue_payment']")
    private  WebElement butContinue;

    public void goToInfo_Topup() throws InterruptedException {
        checkVina.click();
        //Thread.sleep(2000);
        checkMoney.click();
        //Thread.sleep(2000);
        txtPhone.sendKeys("0938058692");
        //Thread.sleep(2000);
        butContinue.click();
       //Thread.sleep(2000);
    }
}
