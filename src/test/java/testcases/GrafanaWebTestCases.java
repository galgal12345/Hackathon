package testcases;


import com.google.common.util.concurrent.Uninterruptibles;
import extensions.AllUiActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.Utilities;
import workflow.GrafanaWebWorkFlow;

import java.util.concurrent.TimeUnit;

public class GrafanaWebTestCases extends CommonOps {

    @Test
    public void login(){
        GrafanaWebWorkFlow.loginWithAdmin();
        GrafanaWebWorkFlow.skipPage();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        //Verifications
        Assert.assertEquals(AllUiActions.getText(grafanaPage.getHomePageTitle()),expectedHomePageTitle);

    }

    @Test
    public void createNewDashboard(){
        Uninterruptibles.sleepUninterruptibly(8, TimeUnit.SECONDS);
        GrafanaWebWorkFlow.createNewDashboard();
    }



}
