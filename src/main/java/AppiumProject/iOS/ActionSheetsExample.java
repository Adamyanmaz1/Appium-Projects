package AppiumProject.iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


import java.net.MalformedURLException;

public class ActionSheetsExample extends BaseTest1 {

    public static void main(String[] args) throws MalformedURLException {

        IOSDriver<IOSElement> driver=capabilities();

        driver.findElementByAccessibilityId("Action Sheets").click();

        driver.findElementByAccessibilityId("Other").click();

        driver.findElementByXPath("//XCUIElementTypeButton[@name='Safe Choice']").click();

      //  driver.navigate().back();

    }
}
