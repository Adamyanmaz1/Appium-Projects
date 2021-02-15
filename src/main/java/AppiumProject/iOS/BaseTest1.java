package AppiumProject.iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BaseTest1 {
//    public static void main(String[] args) throws MalformedURLException {

//    static IOSDriver<IOSElement>driver;

    public static IOSDriver<IOSElement> capabilities() throws MalformedURLException {

      IOSDriver<IOSElement>driver;

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
       cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
      //  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "AUTOMATION_NAME");

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.3");

        cap.setCapability(MobileCapabilityType.APP, "/Users/memetiminabliz/Library/Developer/Xcode/DerivedData/UICatalog-ejnhtxmxhjsiyqhapciddhfxhnla/Build/Products/Debug-iphonesimulator/UICatalog.app");

//        URL url=new URL("http://127.0.0.1:4723/wd/hub");


         driver = new IOSDriver<> (new URL("http://127.0.0.1:4723/wd/hub"), cap);

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         return  driver;
    }

}
