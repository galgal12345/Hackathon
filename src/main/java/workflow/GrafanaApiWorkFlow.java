package workflow;

import extensions.ApiUiActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class GrafanaApiWorkFlow extends CommonOps {


    @Step
    public static void GetRequest(String url) {
        ApiUiActions.Get(url);
    }

    @Step
    public static void PostRequest(String url, String name, String email,String login, String password,int OrgId) {
        ApiUiActions.Post(url,name,email,login,password,OrgId);
        response.prettyPrint();
    }

    @Step
    public static void DeleteRequest(String url,int Id) {
        ApiUiActions.Delete(url,Id);
        response.prettyPrint();
    }
    @Step
    public static void UpdateRequest(String url,int Id,String pasword) {
        ApiUiActions.Update(url,Id,pasword);
        response.prettyPrint();
    }
    @Step
    public static int setNumUsers(String url){
        ApiUiActions.Get(url);
      return Integer.parseInt(ApiUiActions.extractJson("users"));
    }
}

