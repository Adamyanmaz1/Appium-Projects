package AppiumProject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class AndroidTest1 extends AndroidTest {
    public static void main(String[] args) throws MalformedURLException {

       AndroidDriver<AndroidElement> driver= capabilities();

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
       driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
       driver.findElementById("android:id/checkbox").click();
       driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
       driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
       //driver.findElementsByClassName("android.widget.Button").get(1).click();

       driver.findElementById("android:id/button1").click();
    }
}
