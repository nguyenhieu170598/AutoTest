package PL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MAFC_info extends BasePage{
    public MAFC_info(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath="//input[@name='fullName']")
    private WebElement txt_Name;

    @FindBy(xpath="//input[@name='idNumber']")
    private WebElement txt_Id;

    @FindBy(xpath="//input[@name='mobilePhone']")
    private WebElement txt_Phone;

    @FindBy(xpath="//input[@id='districtID_dummy']")
    private WebElement cbb_Address;

    @FindBy(xpath="//input[@class='mbsc-sel-filter-input mbsc-control']")
    private WebElement src_Address;

    @FindBy(xpath="//div[@class='mbsc-sc-itm mbsc-sc-itm-3d mbsc-btn-e']")
    private WebElement ad_Address;

    @FindBy(xpath="//span[@class='mfast-mobiscroll-selected']")
    private WebElement check_Add;

    @FindBy(xpath="//span[@class='mfast-checkbox-custom-checkmark']")
    private WebElement check_Info;

    @FindBy(xpath="//button[@class='btn-submit btn-prescoring mfast-button-checked']")
    private WebElement but_Check;



    public void goToMAFC_info() throws InterruptedException {
        Thread.sleep(10000);
        txt_Name.sendKeys("Nguyễn Minh Hiếu");
        Thread.sleep(5000);
        txt_Id.sendKeys("212099333");
        Thread.sleep(3000);
        txt_Phone.sendKeys("0938058692");
        cbb_Address.click();
        src_Address.sendKeys("Tân Bình");
        ad_Address.click();
        check_Add.click();
        check_Info.click();
        but_Check.click();

    }
}
