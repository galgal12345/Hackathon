package extensions;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utilities.Base;

public class ApiUiActions extends Base {

    @Step("get api")
    public static Response Get(String url){
        response=request.get(url);
        return response;
    }
    @Step("post api")
    public static Response Post( String url,String name, String email,String login, String password,int OrgId){

        params = new JSONObject();
        params.put("name", name);
        params.put("email", email);
        params.put("login", login);
        params.put("password", password);
        params.put("OrgId", OrgId);

        request.body(params.toJSONString());
        response = request.post(url);
        return response;
    }
    @Step("put api")
    public static Response Update(String url, int Id,String password) {

        params = new JSONObject();
        params.put("password", password);
        request.body(params.toJSONString());
        response = request.put(url+"/"+Id+"/password");
        return response;
    }
    @Step("delete api")
    public static  Response Delete(String url,int Id) {
        response = request.delete(url+"/"+Id);
        return response;
    }

    @Step("extract Json")
    public static String extractJson(String params){
        jp = response.jsonPath();
        return jp.get(params).toString();
    }
}
