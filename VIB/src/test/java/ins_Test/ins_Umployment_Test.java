package ins_Test;

import General.Payment;
import General.otp;
import General.success_Payment;
import Ins_Umployment.*;
import org.testng.annotations.Test;

public class ins_Umployment_Test extends BaseTest {
    @Test
    public void umploymentTest_4() throws InterruptedException {
       umPloyment_4 um = new umPloyment_4(webDriver);
       um.gotoIns();

       Payment payment = new Payment(webDriver);
       payment.gotoPayment();

       success_Payment success = new success_Payment(webDriver);
       success.gotosuccess();

       otp o = new otp(webDriver);
       o.gotootp();
    }

    @Test
    public void umploymentTest_1() throws InterruptedException {
        umPloyment_1 um = new umPloyment_1(webDriver);
        um.gotoIns_1();

        Payment payment = new Payment(webDriver);
        payment.gotoPayment();

        success_Payment success = new success_Payment(webDriver);
        success.gotosuccess();

        otp o = new otp(webDriver);
        o.gotootp();
    }

    @Test
    public void umploymentTest_2() throws InterruptedException {
        umPloyment_2 um = new umPloyment_2(webDriver);
        um.gotoIns_2();

        Payment payment = new Payment(webDriver);
        payment.gotoPayment();

        success_Payment success = new success_Payment(webDriver);
        success.gotosuccess();

        otp o = new otp(webDriver);
        o.gotootp();
    }
    @Test
    public void umploymentTest_3() throws InterruptedException {
        umPloyment_3 um = new umPloyment_3(webDriver);
        um.gotoIns_3();

        Payment payment = new Payment(webDriver);
        payment.gotoPayment();

        success_Payment success = new success_Payment(webDriver);
        success.gotosuccess();

        otp o = new otp(webDriver);
        o.gotootp();
    }
    @Test
    public void umploymentTest_5() throws InterruptedException {
        umPloyment_5 um = new umPloyment_5(webDriver);
        um.gotoIns_5();

        Payment payment = new Payment(webDriver);
        payment.gotoPayment();

        success_Payment success = new success_Payment(webDriver);
        success.gotosuccess();

        otp o = new otp(webDriver);
        o.gotootp();
    }
}
