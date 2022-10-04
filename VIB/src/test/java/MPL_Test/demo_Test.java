package MPL_Test;

import MPL.gotoInfo;
import MPL.infomation;
import org.testng.annotations.Test;

public class demo_Test extends BaseTest{
    @Test
    public void MPLtest() throws InterruptedException {

        //gotoInfo go = new gotoInfo(webDriver);
        //go.goToInfo();
        Thread.sleep(2000);
        infomation in = new infomation(webDriver);
        in.goToLead();
        Thread.sleep(2000);
        System.out.println("Case 1");
    }
    @Test
    public void MPLtest2() throws InterruptedException {
            System.out.println("Case 2");
        }
    }

