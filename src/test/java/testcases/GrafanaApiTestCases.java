package testcases;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.GrafanaApiWorkFlow;

import static org.testng.AssertJUnit.assertTrue;

public class GrafanaApiTestCases extends CommonOps {
    int before = 0;
    int after = 0;

    @Test( description = "Create")
    @Description("create user and add to grafana")
    @Parameters({"name", "email", "login", "password", "OrgId"})
    public void test01_post(String name, String email, String login, String password, String OrgId) {
        before = GrafanaApiWorkFlow.setNumUsers("/stats");
        GrafanaApiWorkFlow.PostRequest(name, email, login, password, Integer.parseInt(OrgId), "/users");
        after = GrafanaApiWorkFlow.setNumUsers("/stats");
        Verifications.verifyTrue(response.statusCode()==200);
        Verifications.verifyTrue(after - before == 1);
    }

    @Test(description = "Update")
    @Description("update password for user")
    @Parameters({"newPassword"})
    public void test02_update(String password) {
        GrafanaApiWorkFlow.UpdateRequest("/password", 24, password);
        Verifications.verifyTrue(response.statusCode() == 200);
    }

    @Test(description = "Delete")
    @Description("delete user by id from grafana")
    public void test03_delete() {
        numOfUsers = GrafanaApiWorkFlow.setNumUsers("/stats");
        before = numOfUsers;
        GrafanaApiWorkFlow.DeleteRequest("/users", 24);
        after = GrafanaApiWorkFlow.setNumUsers("/stats");
        Verifications.verifyTrue(after - before == -1);
    }

}
