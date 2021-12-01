package extensions;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utilities.Base;

public class ApiUiActions extends Base {

    public static Response Get(String url){
        response=request.get(url);
        return response;
    }
    public static Response Post(String url, String name, String email,String login, String password,int OrgId){

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

    public static Response Update(String url, int Id,String password) {

        params = new JSONObject();
        params.put("password", password);
        request.body(params.toJSONString());
        response = request.put(url+"/"+Id+"/password");
        return response;
    }

    public static  Response Delete(String url,int Id) {

        response = request.delete(url+"/"+Id);
        return response;
    }


    public static String extractJson(String params){
        jp = response.jsonPath();
        return jp.get(params).toString();
    }
}
