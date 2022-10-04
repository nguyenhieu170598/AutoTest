package MobileCard_Test;

import General.otp;
import General.success_Payment;
import General.switchWeb;
import Mobile_Card.*;
import Topup.Payment_Front;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class demo_Test extends BaseTest{
    private String mainWindowHandle;

    //Case 1: Mua card viettel
    @Test
    public void viettel_Card_Test() throws InterruptedException {
       viettel_Card a = new viettel_Card(webDriver);
       a.goToInfo_Card();

        Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();

        Thread.sleep(2000);

        Set<String> windowIds =webDriver.getWindowHandles();
        Iterator<String> iter = windowIds.iterator();
        String mainWindow = iter.next();
        String childwindow = iter.next();
        webDriver.switchTo().window(childwindow);

        Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();

        Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();

        Thread.sleep(2000);
        //webDriver.close();
        webDriver.switchTo().window(mainWindow);
    }

    //Case 2: Mua card mobifone
    @Test
    public void mobi_Card_Test() throws InterruptedException {
        mobi_Card a = new mobi_Card(webDriver);
        a.goToInfo_Card();

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();

        Thread.sleep(2000);

        switchWeb f = new switchWeb(webDriver);
        f.switchto();

        Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();

        otp d = new otp(webDriver);
        d.gotootp();

        Thread.sleep(2000);
        webDriver.close();


    }

    //Case 3: Mua card vinaphone
    @Test
    public void vina_Card_Test() throws InterruptedException {
        vina_Card a = new vina_Card(webDriver);
        a.goToInfo_Card();

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();

        Thread.sleep(2000);

        switchWeb f = new switchWeb(webDriver);
        f.switchto();

        Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();


        otp d = new otp(webDriver);
        d.gotootp();

        Thread.sleep(2000);
        webDriver.close();

    }

    //Case 4: Mua card viettel mua nhiều phiếu
    @Test
    public void add_Card_Test() throws InterruptedException {

        add_Card_Vina h = new add_Card_Vina(webDriver);
        h.goToInfo_Card();

        Thread.sleep(2000);

        add_Card a = new add_Card(webDriver);
        a.goToInfo_Card_Add();

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();

        Thread.sleep(2000);

        switchWeb f = new switchWeb(webDriver);
        f.switchto();

        Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();


        otp d = new otp(webDriver);
        d.gotootp();

        Thread.sleep(2000);
        webDriver.close();

    }

}
