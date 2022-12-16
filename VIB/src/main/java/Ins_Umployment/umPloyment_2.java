package Ins_Umployment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class umPloyment_2 extends BasePage{

    public umPloyment_2(WebDriver webDriver) {
        super(webDriver);
    }

    //Trường chọn gói quyền lợi bảo hiểm
    @FindBy(xpath="//input[@name='insurance_control'][@value='2']")
    private WebElement chkTerm;

    //Trường nhấn nút Mua bảo hiểm ngay
    @FindBy(xpath="//a[@class='share-btn btn-primary']")
    private WebElement btBuy;

    //Trường chọn câu trả lời
    @FindBy(id="answer-12")
    private WebElement ra_answer1;

    //Trường chọn câu trả lời
    @FindBy(id="answer-32")
    private WebElement ra_answer3;

    //Trường nhập tên
    @FindBy(name="fullName")
    private WebElement txtName;

    //Trường nhập ngày sinh
    @FindBy(name="dob")
    private WebElement txtDate;

    //Trường xác nhận ngày sinh dựa vào nhập ngày sinh
    @FindBy(xpath="//div[@class='mbsc-fr-btn1 mbsc-fr-btn-e mbsc-fr-btn']")
    private WebElement btChooseDate;

    //Trường nhập số điện thoại
    @FindBy(name="mobilePhone")
    private WebElement txtPhone;

    //Trường nhập CCCD/CMND
    @FindBy(name="idNumber")
    private WebElement txtId;

    //Trường nhập địa chỉ
    @FindBy(name="address")
    private WebElement txtAdd;

    //Trường nhấn nút tiếp tục
    @FindBy(xpath="//a[@class='btn-primary']")
    private WebElement btContinue;

    //Trường nhập email
    @FindBy(name="email")
    private WebElement txtEmail;

    public void gotoIns_2() throws InterruptedException {

        btBuy.click();
        Thread.sleep(2000);
        chkTerm.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1000)");
        ra_answer1.click();
        //Thread.sleep(3000);
        //ra_answer2.click();
        //Thread.sleep(3000);
        ra_answer3.click();
        Thread.sleep(1000);
        txtName.sendKeys("Nguyễn Hoàng 2");
        Thread.sleep(1000);
        txtDate.click();
        Thread.sleep(1000);
        btChooseDate.click();
        Thread.sleep(1000);
        txtPhone.sendKeys("0938058602");
        Thread.sleep(1000);
        txtId.sendKeys("212000322082");
        txtAdd.sendKeys("55 thành mỹ");
        txtEmail.click();
        Thread.sleep(1000);
        btContinue.click();
        Thread.sleep(1000);
    }
}
