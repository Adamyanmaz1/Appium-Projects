package AppiumProject;

import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class BatteryTest extends AndroidTest {



    @Test
    public void veryGettingBatteryInformation() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        final AndroidBatteryInfo batteryInfo = driver.getBatteryInfo();
        assertThat(batteryInfo.getLevel(), is(greaterThan(0.0)));
        assertThat(batteryInfo.getState(), is(not(AndroidBatteryInfo.BatteryState.UNKNOWN)));

        System.out.println(batteryInfo.getState());

    }
}