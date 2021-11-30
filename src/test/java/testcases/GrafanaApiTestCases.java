package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.GrafanaApiWorkFlow;

import static org.testng.AssertJUnit.assertTrue;

public class GrafanaApiTestCases extends CommonOps {
   // @Test
    //public void test01(){
       // GrafanaApiWorkFlow.GetRequest("/stats");
       // response.prettyPrint();
   // }
    @Test
    public void test02_post(){
     int before=  GrafanaApiWorkFlow.setNumUsers("/stats");
        GrafanaApiWorkFlow.PostRequest("/users","User6","user6@graf.com","user6","userpassword",1);
        response.prettyPrint();
        int after=GrafanaApiWorkFlow.setNumUsers("/stats");
        assertTrue(after-before==1);
    }
    @Test
    public void test03_delete(){
        int before=  GrafanaApiWorkFlow.setNumUsers("/stats");
        GrafanaApiWorkFlow.DeleteRequest("/users",2);
        response.prettyPrint();
        int after=GrafanaApiWorkFlow.setNumUsers("/stats");
        assertTrue(after-before==-1);

    }
    @Test
    public void test04_update(){
        GrafanaApiWorkFlow.UpdateRequest("/users",2,"123456");
        response.prettyPrint();
        Assert.assertTrue(response.statusCode()==200);

    }
}
