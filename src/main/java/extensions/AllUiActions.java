package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class AllUiActions {


    @Step("get an element text")
    public static String getText(WebElement element){
        return element.getText();
    }

    @Step("clear input text ")
    public static void clearInput(WebElement element){

        element.clear();
    }

    @Step("send value to an input element")
    public static void SendKeys(WebElement element,String value){

        element.sendKeys(value);
    }

    @Step("clicking on an element")
    public static void clickOn(WebElement element){
        element.click();
    }

    @Step("waiting n seconds")
    public static void wait(int seconds){
        Uninterruptibles.sleepUninterruptibly(seconds, TimeUnit.SECONDS);

    }
    @Step("checking if a value exist in a WebElement list ")
    public static boolean ifExist(List<WebElement> list,String value){
        for (int i = 0; i <list.size() ; i++) {
            if (getText(list.get(0)).equals(value))
                return true;
        }
        return false;

    }
}
