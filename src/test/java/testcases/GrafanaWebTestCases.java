package testcases;

import org.testng.annotations.Test;
import workflow.GrafanaWebWorkFlow;

public class GrafanaWebTestCases extends GrafanaWebWorkFlow {

    @Test
    public void login(){
        loginWithAdmin();
        skipPage();
    }
}
