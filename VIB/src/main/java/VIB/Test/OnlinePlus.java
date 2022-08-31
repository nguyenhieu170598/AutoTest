package VIB.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlinePlus extends BasePage {

    public OnlinePlus(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(name="id_front_photo")
    private WebElement lkName;

    @FindBy(name="id_back_photo")
    private WebElement lkIdNumber;

    @FindBy(name="selfie_photo")
    private WebElement lkPhone_number;

    @FindBy(xpath="//li[@class='tabs-nav__item js-tabs-item flex-14 active']//a")
    private WebElement btSubmit;

    /* public void gotoOnlinePlus() throws InterruptedException {
        lkName.sendKeys("Nguyễn Thị Hoàn Mỹ");
        Thread.sleep(2000);
        lkIdNumber.sendKeys("390490422");
        Thread.sleep(2000);
        lkPhone_number.sendKeys("0930009811");
        Thread.sleep(2000);
        btSubmit.click();
        Thread.sleep(2000);
    } */
    public void gotoOnlinePlus() throws InterruptedException {

        Thread.sleep(5000);
        btSubmit.click();
        Thread.sleep(5000);
        lkName.sendKeys("C:\\Users\\hieu.nguyenminh\\Desktop\\HINH ANH\\_DSC7734.jpg");
        Thread.sleep(5000);
        lkIdNumber.sendKeys("C:\\Users\\hieu.nguyenminh\\Desktop\\HINH ANH\\_DSC7734.jpg");
        Thread.sleep(5000);
        lkPhone_number.sendKeys("C:\\Users\\hieu.nguyenminh\\Desktop\\HINH ANH\\_DSC7734.jpg");
    }
}
