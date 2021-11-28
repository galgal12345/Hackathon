package workflow;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class GrafanaWebWorkFlow extends CommonOps {

    @Step
    public void loginWithAdmin() {
        grafanaPage.getUsername_txt().sendKeys(userName);
        grafanaPage.getPassword_txt().sendKeys(password);
        grafanaPage.getLogin_btn().click();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }
    @Step
    public void skipPage(){
        grafanaPage.getSkip_btn().click();
    }

}
