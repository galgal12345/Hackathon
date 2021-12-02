package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement ;
import utilities.Base;

public class ElectronActions extends Base {
    @Step()
    public static void mouseHover(WebElement element){
        action.moveToElement(element);
        action.build().perform();
        action.sendKeys(Keys.RETURN).build().perform();

    }

}
