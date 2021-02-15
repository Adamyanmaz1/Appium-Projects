package AppiumProject.iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.ios.touch.IOSPressOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.util.HashMap;


public class ScrollDemo extends BaseTest1 {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        IOSDriver<IOSElement> driver=capabilities();


        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath("//*[@value='Text Entry']").click();
        driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hello");
        driver.findElementByName("OK").click();
        driver.navigate().back();

//        Dimension size = driver.manage().window().getSize();
//        int x = size.getWidth() / 2;
//        int starty = (int) (size.getHeight() * 0.60);
//        int endy = (int) (size.getHeight() * 0.10);
//        driver.swipe(x, starty, x, endy, 2000);

//WebElement elem=driver.findElementByXPath("//XCUIElementTypeStaticText[@name='AAPLSwitchViewController']");
//
//        driver.performTouchAction(new IOSTouchAction(driver).press(elem)
//                .moveTo(0, elem.getLocation().getY())
//                .release());






        driver.findElementByAccessibilityId("Steppers").click();
        driver.findElementByAccessibilityId("Increment").click();
        driver.findElementByAccessibilityId("Increment").click();
        System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());

        System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(2).getText());
        driver.findElementByAccessibilityId("Decrement").click();

        System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
        driver.navigate().back();
        driver.findElementByAccessibilityId("Picker View").click();
        driver.findElementByName("Green color component value").sendKeys("220");
        driver.findElementsByClassName("XCUIElementTypePickerWheel").get(0).sendKeys("55");
        driver.findElementByXPath("//*[@name='Blue color component value']").sendKeys("130");





    }
}
