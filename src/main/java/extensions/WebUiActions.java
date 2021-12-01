package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import pageobjects.grafanapages.GrafanaPage;
import utilities.Base;

public class WebUiActions extends Base {

    @Step("send username value")
    public static void sendUserName() {
       AllUiActions.SendKeys(GrafanaPage.getUsername_txt(),userName);
    }

    @Step("send password value")
    public static void sendPassword(){

        AllUiActions.SendKeys(GrafanaPage.getPassword_txt(),password);
    }
    @Step("Mouse hover on element")
    public static void mouseHover(WebElement element1,WebElement element2){


            action.moveToElement(element1).moveToElement(element2).click();

            action.build().perform();
    }

}
