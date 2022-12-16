package General;

import Ins_Umployment.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class success_Payment extends BasePage {
    public success_Payment(WebDriver webDriver) {
        super(webDriver);
    }

    //Trường chọn nguồn thanh toán bằng ví MFast
    @FindBy(xpath="//div[text()='Ví tích luỹ MFast']")
    private WebElement checkChoose;

    //Trường nhấn nút tiếp tục
    @FindBy(xpath="//button[@class='checkout-btn active']")
    private WebElement btContinue;

    public void gotosuccess() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        checkChoose.click();
        Thread.sleep(3000);
        btContinue.click();
    }
}
