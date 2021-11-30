package testcases;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.GrafanaWebWorkFlow;

import java.util.concurrent.TimeUnit;

public class GrafanaWebTestCases extends CommonOps {

    @Test
    public void login(){
        GrafanaWebWorkFlow.loginWithAdmin();
        GrafanaWebWorkFlow.skipPage();


    }
}
