package testcases;

import extensions.Verifications;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.GrafanaApiWorkFlow;

import static org.testng.AssertJUnit.assertTrue;

public class GrafanaApiTestCases extends CommonOps {
    int before=0;
    int after=0;
    @Test
    public void test01_get(){
        GrafanaApiWorkFlow.GetRequest("/stats");
        response.prettyPrint();
   }
    @Test
    public void test01_post(){
      before= GrafanaApiWorkFlow.setNumUsers("/stats");
        GrafanaApiWorkFlow.PostRequest("/users","User10","useruser10@graf.com","useruser10","userpassword",1);
         after=GrafanaApiWorkFlow.setNumUsers("/stats");
        Verifications.verifyTrue(after-before==1);
        System.out.println(numOfUsers);
    }

    @Test
    public void test02_update(){
        numOfUsers=GrafanaApiWorkFlow.setNumUsers("/stats");
        System.out.println(numOfUsers);
        GrafanaApiWorkFlow.UpdateRequest("/users",0,"123456");
        Verifications.verifyTrue(response.statusCode()==200);
        System.out.println(numOfUsers);

    }
    @Test
    public void test03_delete(){
        numOfUsers=GrafanaApiWorkFlow.setNumUsers("/stats");
        before= numOfUsers;
        System.out.println(before);
        GrafanaApiWorkFlow.DeleteRequest("/users",1);
        after=GrafanaApiWorkFlow.setNumUsers("/stats");
        System.out.println(after);
        Verifications.verifyTrue(after-before== -1);
    }

}
