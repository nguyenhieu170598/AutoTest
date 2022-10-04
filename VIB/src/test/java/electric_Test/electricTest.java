package electric_Test;

import General.otp;
import payment_Electric.confirm_Payment;
import payment_Electric.electric;
import General.success_Payment;
import org.testng.annotations.Test;
import payment_Water.water;

public class electricTest extends BaseTest{
    @Test
    public void electric_Test() throws InterruptedException {
       electric e = new electric(webDriver);
       e.goToSuccess();
        Thread.sleep(3000);
       confirm_Payment confirm = new confirm_Payment(webDriver);
       confirm.goToConfirm();
        Thread.sleep(3000);
       success_Payment payment = new success_Payment(webDriver);
       payment.gotosuccess();
        Thread.sleep(3000);
       otp o = new otp(webDriver);
       o.gotootp();
        Thread.sleep(3000);
    }

}
