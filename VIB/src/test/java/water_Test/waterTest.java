package water_Test;
import Ins_Umployment.otp;
import payment_Electric.confirm_Payment;
import payment_Water.water;
import Ins_Umployment.success_Payment;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class waterTest extends BaseTest{
    @Test
    public void water_Test() throws InterruptedException {
        water a = new water(webDriver);
        a.goToSuccess();
        Thread.sleep(3000);
        confirm_Payment confirm = new confirm_Payment(webDriver);
        confirm.goToConfirm();
        Thread.sleep(3000);
        success_Payment payment = new success_Payment(webDriver);
        payment.gotosuccess();
        Thread.sleep(3000);
        otp o = new otp(webDriver);
        o.gotootp();
    }
}
