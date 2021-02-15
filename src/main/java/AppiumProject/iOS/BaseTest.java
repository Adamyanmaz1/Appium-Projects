package AppiumProject.iOS;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
//        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4");

//        cap.setCapability(MobileCapabilityType.APP, "/Users/memetiminabliz/Library/Developer/Xcode/DerivedData/UICatalog-ejnhtxmxhjsiyqhapciddhfxhnla/Build/Products/Debug-iphonesimulator/UICatalog.app");

          cap.setCapability(MobileCapabilityType.APP, "/Users/memetiminabliz/Library/Developer/Xcode/DerivedData/UICatalog-ejnhtxmxhjsiyqhapciddhfxhnla/Build/Products/Debug-iphonesimulator/UICatalog.app");

URL url=new URL("http://127.0.0.1:4723/wd/hub");


        IOSDriver driver = new IOSDriver (url, cap);


        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        driver.findElementByAccessibilityId("Alert Views").click();
    }

}
