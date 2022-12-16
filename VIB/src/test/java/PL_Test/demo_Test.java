package PL_Test;
import PL.MAFC_info;
import PL.MAFC_pre;
import org.testng.annotations.Test;

public class demo_Test extends BaseTest {
    @Test
    public void MAFC_Test() throws InterruptedException {
        MAFC_pre a = new MAFC_pre(webDriver);
        a.goToMAFC();
        Thread.sleep(2000);

        MAFC_info b = new MAFC_info(webDriver);
        b.goToMAFC_info();
    }
}
