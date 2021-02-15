package AppiumProject.iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.Keys;


import java.net.MalformedURLException;
import java.util.List;


public class DatePicker extends BaseTest1 {



    public static void main(String[] args) throws MalformedURLException {

        IOSDriver<IOSElement>driver=capabilities();


        driver.findElementByAccessibilityId("Date Picker").click();

       List<IOSElement> elements=driver.findElementsByXPath("//XCUIElementTypePickerWheel");


        for (IOSElement element : elements) {

            System.out.println(element.getText());
        }

        System.out.println("*************************");

        elements.get(0).sendKeys("Sat Sep 26");

        elements.get(0).sendKeys(Keys.TAB);

        elements.get(1).sendKeys("8");
        elements.get(1).sendKeys(Keys.TAB);

        elements.get(2).sendKeys("39");

        elements.get(2).sendKeys(Keys.TAB);

        elements.get(3).sendKeys("PM");

        elements.get(3).sendKeys(Keys.TAB);


        for (IOSElement element : elements) {

            System.out.println(element.getText());
        }





        List<IOSElement> elements1=driver.findElementsByXPath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]");


        for (IOSElement element1 : elements1) {

            System.out.println(element1.getText());
        }



    }
    }
