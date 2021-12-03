package workflow;

import extensions.ApiUiActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class GrafanaApiWorkFlow extends CommonOps {


    @Step("get properties on admit")
    public static void GetRequest(String url) {
        ApiUiActions.Get(url);
    }

    @Step("add user to grafana")
    public static void PostRequest( String name, String email,String login, String password,int OrgId,String url) {
        ApiUiActions.Post(url,name,email,login,password,OrgId);
        response.prettyPrint();
    }

    @Step("delete user from grafana")
    public static void DeleteRequest(String url,int Id) {
        ApiUiActions.Delete(url,Id);
        response.prettyPrint();
    }
    @Step("update password")
    public static void UpdateRequest(String url,int Id,String password) {
        ApiUiActions.Update(url,Id,password);
        response.prettyPrint();
    }
    @Step
    public static int setNumUsers(String url){
        GetRequest(url);
      return Integer.parseInt(ApiUiActions.extractJson("users"));
    }
    @Step
    public static int getIdUser(){
        return Integer.parseInt(ApiUiActions.extractJson("id"));
    }
}

