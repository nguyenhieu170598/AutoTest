package VIB.Test;

import VIB.Test.OnlinePlus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class OnlinePlusTest extends BaseTest {

    @Test
    public void onlinePlusTest() throws InterruptedException {
        OnlinePlus plus = new OnlinePlus(webDriver);
        plus.gotoOnlinePlus();
        
    }

    


}
