package AppiumProject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Miscelleanous extends AndroidTest {

    public static void main(String[] args) throws MalformedURLException {

        //
       AndroidDriver<AndroidElement> driver=capabilities();

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println(driver.currentActivity());
        System.out.println(driver.getBatteryInfo());

        System.out.println(driver.getContext());

        System.out.println(driver.isDeviceLocked());

        driver.findElementByXPath("").click();
        //driver.pressKey(An
    }
}
