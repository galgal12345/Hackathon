package workflow;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.AllUiActions;
import extensions.WebUiActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

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


}
