package testcases;


import com.google.common.util.concurrent.Uninterruptibles;
import extensions.AllUiActions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.grafanapages.GrafanaPage;
import utilities.CommonOps;
import utilities.Utilities;
import workflow.GrafanaWebWorkFlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GrafanaWebTestCases extends CommonOps {

    @Test(priority = 1)
    public void login(){
        GrafanaWebWorkFlow.loginWithAdmin();
        GrafanaWebWorkFlow.skipPage();


        //Verifications
        Assert.assertEquals(AllUiActions.getText(grafanaPage.getHomePageTitle()),expectedHomePageTitle);

    }

       @Test(priority = 2,dependsOnMethods="login")
    public void createNewDashboard(){
        SoftAssert softAssert=new SoftAssert();

          GrafanaWebWorkFlow.createNewDashboard(dashboardName1);
          AllUiActions.clickOn(grafanaPage.getDashboardsTitle());
          AllUiActions.wait(3);
          softAssert.assertTrue(AllUiActions.getText(grafanaPage.getDashboardsItems()).contains(dashboardName1));
          AllUiActions.wait(3);
          GrafanaWebWorkFlow.createNewDashboard(dashboardNameAyala);
          AllUiActions.clickOn(grafanaPage.getDashboardsTitle());
          AllUiActions.wait(3);
           softAssert.assertTrue(AllUiActions.getText(grafanaPage.getDashboardsItems()).contains(dashboardNameAyala));
          AllUiActions.wait(3);

          GrafanaWebWorkFlow.createNewDashboard(dashboardNameRami);
          AllUiActions.clickOn(grafanaPage.getDashboardsTitle());
          AllUiActions.wait(3);
           softAssert.assertTrue(AllUiActions.getText(grafanaPage.getDashboardsItems()).contains(dashboardNameRami));
          AllUiActions.wait(3);

          GrafanaWebWorkFlow.createNewDashboard(dashboardNameGil);
          AllUiActions.clickOn(grafanaPage.getDashboardsTitle());
          AllUiActions.wait(3);
           softAssert.assertTrue(AllUiActions.getText(grafanaPage.getDashboardsItems()).contains(dashboardNameGil));
          AllUiActions.wait(3);


        //Verification
        softAssert.assertAll();

    }

    @Test(priority = 3)
    public void searchDashboardNotExist(){
      GrafanaWebWorkFlow.researchDashboardByName(dashboardNotExist);

      //Verification
        Assert.assertTrue(grafanaPage.getNoFoundMessage().isDisplayed());

    }


    @Test(priority = 4)
    public void sortDashboards(){
        GrafanaWebWorkFlow.manageDashboards();
    }



}
