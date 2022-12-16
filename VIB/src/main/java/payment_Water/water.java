package payment_Water;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class water extends BasePage{
    public water(WebDriver webDriver) {
        super(webDriver);
    }

    //Trường nhấn chọn nhà cung cấp nước
    @FindBy(xpath = "//div[@class='js-toggle_modal amount_brand_content empty_brand']")
    private WebElement chooseProd;

    //Trường xác nhận chọn nhà cung cấp nước
    @FindBy(xpath = "//div[@class='amount_brand_name_b']/span[text()='Dịch vụ nước Đồng Tháp']")
    private WebElement nameProd;

    //Trường nhập mã khách hàng
    @FindBy(name = "billCode")
    private WebElement nameCode;

    //Trường nhấn nút tra cứu hợp đồng
    @FindBy(xpath = "//input[@class='btn-success']")
    private WebElement butSuccess;

    public void goToSuccess() throws InterruptedException {
        //Thread.sleep(5000);
        chooseProd.click();
        Thread.sleep(2000);
        nameProd.click();
        //Thread.sleep(5000);
        nameCode.sendKeys("Pd02t21768168101_s");
        //Thread.sleep(5000);
        butSuccess.click();
        //Thread.sleep(10000);
    }

}
