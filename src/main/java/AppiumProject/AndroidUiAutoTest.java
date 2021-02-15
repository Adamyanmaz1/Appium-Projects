package AppiumProject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class AndroidUiAutoTest extends AndroidTest {

    public static void main(String[] args) throws MalformedURLException {
        //TODO Auto-generated method stub

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable()").size());
    }

}
