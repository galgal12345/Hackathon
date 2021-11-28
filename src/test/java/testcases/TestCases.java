package testcases;

import org.testng.annotations.Test;
import workflow.WorkFlowWeb;

public class TestCases extends WorkFlowWeb {

    @Test
    public void login(){
        loginWithAdmin();
        skipPage();
    }
}
