package testcases;

import extensions.AllUiActions;
import extensions.Verifications;
import extensions.WebUiActions;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;
import utilities.Base;
import utilities.CommonOps;
import workflow.GrafanaWebWorkFlow;


public class GrafanaWebTestCases extends CommonOps {

    @Test(priority = 1, description = "Login")
    @Description("login with username and password")
    public void login() {
        GrafanaWebWorkFlow.loginWithAdmin();
        GrafanaWebWorkFlow.skipPage();
        Verifications.verifyEquals(AllUiActions.getText(grafanaPage.getHomePageTitle()), expectedHomePageTitle);
    }


    @Test(priority = 2, dependsOnMethods = "login", description = "Ensure dashboard was created")
    @Description("Create new dashboards and verify that we can see them shown in homepage, with soft assert for each dashboard")
    public void createNewDashboard() {

        GrafanaWebWorkFlow.createNewDashboard(dashboardName1);
        GrafanaWebWorkFlow.navigateToDashboardTitle();
        Verifications.softAssertTrue(GrafanaWebWorkFlow.ifElementContainsValue(grafanaPage.getDashboardsItems(), dashboardName1));
        AllUiActions.wait(2);

        GrafanaWebWorkFlow.createNewDashboard(dashboardNameAyala);
        GrafanaWebWorkFlow.navigateToDashboardTitle();
        Verifications.softAssertTrue(GrafanaWebWorkFlow.ifElementContainsValue(grafanaPage.getDashboardsItems(), dashboardNameAyala));
        AllUiActions.wait(2);

        GrafanaWebWorkFlow.createNewDashboard(dashboardNameRami);
        GrafanaWebWorkFlow.navigateToDashboardTitle();
        Verifications.softAssertTrue(GrafanaWebWorkFlow.ifElementContainsValue(grafanaPage.getDashboardsItems(), dashboardNameRami));
        AllUiActions.wait(2);

        GrafanaWebWorkFlow.createNewDashboard(dashboardNameGil);
        GrafanaWebWorkFlow.navigateToDashboardTitle();
        Verifications.softAssertTrue(GrafanaWebWorkFlow.ifElementContainsValue(grafanaPage.getDashboardsItems(), dashboardNameGil));
        AllUiActions.wait(2);

        Verifications.assertAll();

    }

    @Test(priority = 3, dependsOnMethods = "login", description = "Checking the search management")
    @Description("insert a name of dashboard does not exist, and verify there is message means that this dashboard not found")
    public void searchDashboardNotExist() {
        GrafanaWebWorkFlow.researchDashboardByName(dashboardNotExist);
        Verifications.verifyTrue(grafanaPage.getNoFoundMessage().isDisplayed());

    }


    @Test(priority = 4, dependsOnMethods = "login", description = "Homepage logo")
    @Description("Verify that home page logo navigate to the home page using sikuli")
    public void homePageLogo() throws FindFailed {
        GrafanaWebWorkFlow.hoverOnImage(imagesPath, menuFileName);
        AllUiActions.wait(2);
        GrafanaWebWorkFlow.hoverOnImage(imagesPath, dashboardsFileName);
        GrafanaWebWorkFlow.clickOnImage(imagesPath, manageFileName);
        AllUiActions.wait(2);
        GrafanaWebWorkFlow.clickOnImage(imagesPath, logoFileName);
        AllUiActions.wait(2);


        Verifications.verifyTrue(screen.hasText(expectedHomePageTitle));

    }

    @Test(priority = 5, dependsOnMethods = "login", description = "Verify dashboard name")
    @Description("choose a random dashboard from dashboards, clicking on it, verify the name in the title is the same")
    public void verifyDashboardName() {

        GrafanaWebWorkFlow.manageDashboards();
        WebElement randomElement = GrafanaWebWorkFlow.getRandomDashboard(grafanaPage.getDashboardItems());
        String expected = AllUiActions.getText(randomElement);////we need it for the assertion, so we have to save it cause later will disappear
        AllUiActions.clickOn(randomElement);


        Verifications.verifyEquals(AllUiActions.getText(grafanaPage.getDashboardHeader()), expected);

    }


}
