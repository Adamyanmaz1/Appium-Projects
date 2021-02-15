package AppiumProject.iOS;

import io.appium.java_client.ios.IOSDriver;


import io.appium.java_client.ios.IOSElement;


import java.net.MalformedURLException;
import java.util.List;

import static AppiumProject.iOS.BaseTest1.capabilities;

public class PickerViewExample {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        IOSDriver<IOSElement> driver=capabilities();

        driver.findElementByAccessibilityId("Picker View").click();

      List<IOSElement> listelement=driver.findElementsByXPath("//XCUIElementTypePickerWheel");

        System.out.println(listelement.size());

  for(IOSElement element:listelement){

    System.out.println(element.getAttribute("value"));


}



        Thread.sleep(5000);

        System.out.println("**************************");

        listelement.get(0).sendKeys("100");
        listelement.get(1).sendKeys("166");
        listelement.get(0).sendKeys("300");


        System.out.println(listelement.get(0).getAttribute("value"));
        System.out.println(listelement.get(1).getAttribute("value"));

        System.out.println(listelement.get(2).getAttribute("value"));
    }
}
