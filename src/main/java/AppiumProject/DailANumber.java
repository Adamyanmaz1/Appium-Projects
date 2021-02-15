package AppiumProject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DailANumber {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        DesiredCapabilities dc= new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); //Android Emulator

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");

        dc.setCapability("appPackage", "com.android.dialer");
        dc.setCapability("appActivity", "com.android.dialer.DialtactsActivity");

        URL url =new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver= new AndroidDriver(url,dc);

        Thread.sleep(5000);

        driver.findElementById("com.android.dialer:id/floating_action_button").click();


        driver.findElementById("com.android.dialer:id/nine").click();
        driver.findElementById("com.android.dialer:id/six").click();
        driver.findElementById("com.android.dialer:id/one").click();
        driver.findElementById("com.android.dialer:id/eight").click();
        driver.findElementById("com.android.dialer:id/one").click();
        driver.findElementById("com.android.dialer:id/five").click();
        driver.findElementById("com.android.dialer:id/six").click();
        driver.findElementById("com.android.dialer:id/five").click();
        driver.findElementById("com.android.dialer:id/zero").click();
        driver.findElementById("com.android.dialer:id/eight").click();

        Thread.sleep(3000);

        driver.findElementById("com.android.dialer:id/dialpad_floating_action_button").click();


    }

}
