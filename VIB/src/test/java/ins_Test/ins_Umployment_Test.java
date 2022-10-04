package ins_Test;

import General.Payment;
import General.otp;
import General.success_Payment;
import Ins_Umployment.umPloyment;
import org.testng.annotations.Test;

public class ins_Umployment_Test extends BaseTest {
    @Test
    public void umploymentTest() throws InterruptedException {
       umPloyment um = new umPloyment(webDriver);
       um.gotoIns();

       Payment payment = new Payment(webDriver);
       payment.gotoPayment();

       success_Payment success = new success_Payment(webDriver);
       success.gotosuccess();

       otp o = new otp(webDriver);
       o.gotootp();
    }
}
