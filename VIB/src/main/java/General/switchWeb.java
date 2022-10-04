package General;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class switchWeb  {
    protected WebDriver webDriver;
    JavascriptExecutor jsExecutor;

    public switchWeb(WebDriver webDriver) {
        this.webDriver = webDriver;
        jsExecutor = (JavascriptExecutor) webDriver;
        PageFactory.initElements(webDriver, this);
    }

    protected void setText(WebElement el, String text) {
        jsExecutor.executeScript("arguments[0].setAttribute('value', arguments[1]);", el, text);
    }
    public void switchto() throws InterruptedException {
        Set<String> windowIds =webDriver.getWindowHandles();
        Iterator<String> iter = windowIds.iterator();
        String mainWindow = iter.next();
        String childwindow = iter.next();
        webDriver.switchTo().window(childwindow);
        Thread.sleep(5000);
        //webDriver.switchTo().window(mainWindow);
        //webDriver.close();
    }

}
