package extensions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.Dimension;
import utilities.CommonOps;

import java.time.Duration;

public class MobileUiActions extends CommonOps {
    @Step("Swipe Screen")
    public static void swipeScreen() {


        final int ANIMATION_TIME = 200; // ms
        final int PRESS_TIME = 200; // ms
        int edgeBorder = 10; // better avoid edges
        Dimension dims = androidDriver.manage().window().getSize();// init screen variables
        PointOption pointOptionStart = PointOption.point(900, dims.height / 2);// init start point
        PointOption pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);// init end point

        // execute swipe using TouchAction
        try {
            new TouchAction(androidDriver)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
