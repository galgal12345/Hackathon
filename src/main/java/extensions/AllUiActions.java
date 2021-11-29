package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public abstract class AllUiActions {


    @Step
    public static String getText(WebElement element){
        return element.getText();
    }

    @Step
    public static void clearInput(WebElement element){

        element.clear();
    }

    @Step
    public static void SendKeys(WebElement element,String value){

        element.sendKeys(value);
    }

}
