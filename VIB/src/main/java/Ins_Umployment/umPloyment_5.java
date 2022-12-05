package Ins_Umployment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class umPloyment_5 extends BasePage{

    public umPloyment_5(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath="//input[@name='insurance_control'][@value='5']")
    private WebElement chkTerm;

    @FindBy(xpath="//a[@class='share-btn btn-primary']")
    private WebElement btBuy;

    @FindBy(id="answer-12")
    private WebElement ra_answer1;

    //@FindBy(id="answer-22")
    //private WebElement ra_answer2;

    @FindBy(id="answer-32")
    private WebElement ra_answer3;

    @FindBy(name="fullName")
    private WebElement txtName;

    @FindBy(name="dob")
    private WebElement txtDate;

    @FindBy(xpath="//div[@class='mbsc-fr-btn1 mbsc-fr-btn-e mbsc-fr-btn']")
    private WebElement btChooseDate;

    @FindBy(name="mobilePhone")
    private WebElement txtPhone;

    @FindBy(name="idNumber")
    private WebElement txtId;

    @FindBy(name="address")
    private WebElement txtAdd;

    @FindBy(xpath="//a[@class='btn-primary']")
    private WebElement btContinue;

    @FindBy(name="email")
    private WebElement txtEmail;

    public void gotoIns_5() throws InterruptedException {

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
        txtName.sendKeys("Nguyễn Hoàng 5");
        Thread.sleep(1000);
        txtDate.click();
        Thread.sleep(1000);
        btChooseDate.click();
        Thread.sleep(1000);
        txtPhone.sendKeys("0938058605");
        Thread.sleep(1000);
        txtId.sendKeys("212000322085");
        txtAdd.sendKeys("55 thành mỹ");
        txtEmail.click();
        Thread.sleep(1000);
        btContinue.click();
        Thread.sleep(1000);
    }
}
