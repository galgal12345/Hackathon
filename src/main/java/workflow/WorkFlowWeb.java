package workflow;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class WorkFlowWeb extends CommonOps {

    @Step
    public void loginWithAdmin() {
        webPage.getUsername_txt().sendKeys(userName);
        webPage.getPassword_txt().sendKeys(password);
        webPage.getLogin_btn().click();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }
    @Step
    public void skipPage(){
        webPage.getSkip_btn().click();
    }

}
