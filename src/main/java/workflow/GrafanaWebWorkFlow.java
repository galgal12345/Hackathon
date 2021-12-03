package workflow;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.AllUiActions;
import extensions.WebUiActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.python.antlr.ast.Str;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GrafanaWebWorkFlow extends CommonOps {

    @Step("login with admin")
        public static void loginWithAdmin() {
        WebUiActions.sendUserName();
         WebUiActions.sendPassword();
        AllUiActions.clickOn(grafanaPage.getLogin_btn());
        AllUiActions.wait(3);
    }

    @Step("Skip reset password")
    public static void skipPage(){
        AllUiActions.clickOn(grafanaPage.getSkip_btn());
    }


    @Step("Create new dashboard")
    public static void createNewDashboard(String dashboardName){
        AllUiActions.wait(3);
        AllUiActions.clickOn(grafanaPage.getAddDashboard());
        AllUiActions.wait(3);
        AllUiActions.clickOn(grafanaPage.getAddEmptyPanelLink());
        AllUiActions.wait(3);
        AllUiActions.clickOn(grafanaPage.getSaveBtn1());
        AllUiActions.wait(3);
        AllUiActions.clearInput(grafanaPage.getDashboardNameInput());
        AllUiActions.wait(3);
        AllUiActions.SendKeys(grafanaPage.getDashboardNameInput(),dashboardName);
        AllUiActions.wait(2);
        AllUiActions.clickOn(grafanaPage.getSaveBtn2());
        AllUiActions.wait(3);

           }

    @Step("Navigate to DashboardTitle")
    public static void navigateToDashboardTitle(){
        AllUiActions.clickOn(grafanaPage.getDashboardsTitle());
        AllUiActions.wait(2);
    }

    @Step("check if an element contains a value")
    public static boolean ifElementContainsValue(WebElement element, String value){
        if (AllUiActions.getText(element).contains(value)) return true;
        else return false;
    }

    @Step("Navigate to manage page")
    public static void manageDashboards(){
        WebUiActions.mouseHover(grafanaPage.getDashboardsTitle(),grafanaPage.getManageBtn());
        AllUiActions.wait(3);

    }

    @Step("Research dashboard by name")
    public static void researchDashboardByName(String dashboardName){
        AllUiActions.clickOn(grafanaPage.getSearch());
        AllUiActions.SendKeys(grafanaPage.getSearchInput(),dashboardName);
    }

    @Step("Click on image, by getting the image path")
    public static void clickOnImage(String path,String imageName) throws FindFailed {
        screen.click(path+"/"+imageName);
    }


    @Step("Hover on image, by getting the image path")
    public static void hoverOnImage(String path,String imageName) throws FindFailed {
        screen.hover(path+"/"+imageName);
    }

    @Step("return a random dashboard element from list of dashboards")
    public static WebElement getRandomDashboard(List<WebElement> list){
        Random rnd=new Random();
        int i=rnd.nextInt(list.size());

        return list.get(i);
    }




}
