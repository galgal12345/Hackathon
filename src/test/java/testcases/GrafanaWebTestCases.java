package testcases;


import com.google.common.util.concurrent.Uninterruptibles;
import com.sun.corba.se.impl.io.ValueUtility;
import extensions.AllUiActions;
import extensions.WebUiActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
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
    public void homePageLogo() throws FindFailed {
        GrafanaWebWorkFlow.hoverOnImage(imagesPath,menuFileName);
        AllUiActions.wait(2);
        GrafanaWebWorkFlow.hoverOnImage(imagesPath,dashboardsFileName);
        GrafanaWebWorkFlow.clickOnImage(imagesPath,manageFileName);
        AllUiActions.wait(3);
        GrafanaWebWorkFlow.clickOnImage(imagesPath,logoFileName);
        AllUiActions.wait(2);

        //Verification
        Assert.assertTrue(screen.hasText(expectedHomePageTitle));

    }

    @Test(priority = 5)
    public void verifyDashboardName(){

        AllUiActions.clickOn(grafanaPage.getDashboardsTitle());
        AllUiActions.clickOn(grafanaPage.getManageBtn());
        AllUiActions.wait(3);
        WebElement randomElement=GrafanaWebWorkFlow.getRandomDashboard(grafanaPage.getDashboardItems());
        String expected=AllUiActions.getText(randomElement) ;////we need it for the assertion, so we have to save it cause later will disappear
        AllUiActions.clickOn(randomElement);
        //Verification
        Assert.assertEquals(AllUiActions.getText(grafanaPage.getDashboardHeader()),expected);


    }



}
