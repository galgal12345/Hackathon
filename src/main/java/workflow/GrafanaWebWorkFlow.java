package workflow;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.AllUiActions;
import extensions.WebUiActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GrafanaWebWorkFlow extends CommonOps {

    @Step
    public static void loginWithAdmin() {
        WebUiActions.sendUserName();
         WebUiActions.sendPassword();
        AllUiActions.clickOn(grafanaPage.getLogin_btn());
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }
    @Step
    public static void skipPage(){
        AllUiActions.clickOn(grafanaPage.getSkip_btn());
    }


    @Step
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

    @Step
    public static void manageDashboards(){
        WebUiActions.mouseHover(grafanaPage.getDashboardsTitle(),grafanaPage.getManageBtn());

    }

    @Step
    public static void researchDashboardByName(String dashboardName){
        AllUiActions.clickOn(grafanaPage.getSearch());
        AllUiActions.SendKeys(grafanaPage.getSearchInput(),dashboardName);
    }

    @Step
    public static void clickOnImage(String path,String imageName) throws FindFailed {
        screen.click(path+"/"+imageName);
    }


    @Step
    public static void hoverOnImage(String path,String imageName) throws FindFailed {
        screen.hover(path+"/"+imageName);
    }

    @Step
    public static WebElement getRandomDashboard(List<WebElement> list){
        Random rnd=new Random();
        int i=rnd.nextInt(list.size());

        return list.get(i);
    }


}
