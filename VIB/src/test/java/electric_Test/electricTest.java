package electric_Test;

import Ins_Umployment.otp;
import payment_Electric.confirm_Payment;
import payment_Electric.electric;
import Ins_Umployment.success_Payment;
import org.testng.annotations.Test;

public class electricTest extends BaseTest{
    @Test
    public void electric_Test() throws InterruptedException {
       electric e = new electric(webDriver);
       e.goToSuccess();

       confirm_Payment confirm = new confirm_Payment(webDriver);
       confirm.goToConfirm();

       success_Payment payment = new success_Payment(webDriver);
       payment.gotosuccess();

       otp o = new otp(webDriver);
       o.gotootp();
    }
}
