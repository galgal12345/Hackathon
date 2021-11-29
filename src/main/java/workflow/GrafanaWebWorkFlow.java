package workflow;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.AllUiActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;
import utilities.Utilities;

import java.util.concurrent.TimeUnit;

public class GrafanaWebWorkFlow extends CommonOps {

    @Step
    public static void loginWithAdmin() {
        grafanaPage.getUsername_txt().sendKeys(userName);
        grafanaPage.getPassword_txt().sendKeys(password);
        grafanaPage.getLogin_btn().click();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }
    @Step
    public static void skipPage(){
        grafanaPage.getSkip_btn().click();
    }


    @Step
    public static void createNewDashboard(){
//        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
//        grafanaPage.getNewBtn().click();
//        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
//        grafanaPage.getCreateDashboardLink().click();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        grafanaPage.getAddPanel().click();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        grafanaPage.getAddEmptyPanelLink().click();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        grafanaPage.getSaveBtn().click();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        AllUiActions.clearInput(grafanaPage.getDashboardNameInput());
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
            }



}
