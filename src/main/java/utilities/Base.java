package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.windows.WindowsDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageobjects.calcpages.CalcPage;
import pageobjects.grafanapages.GrafanaPage;
import pageobjects.mortgagecalcpages.CalculateFragmentPage;
import pageobjects.mortgagecalcpages.SavedFragmentPage;
import pageobjects.todopages.ToDoPage;

import javax.swing.*;

public class Base {


    //WEB
    protected static WebDriver webDriver;

    //
    protected static Actions action;
    //URL
    protected static String url = "http://localhost:3000/?orgId=1";

    //PAGES
    protected static GrafanaPage grafanaPage;

    //XML
    protected static String userName = "admin";
    protected static String password = "admin";
    protected static String dashboardName1="Dashboard1";
    protected static String dashboardNameAyala="AyalaDashboard";
    protected static String dashboardNameRami="RamiDashboard";
    protected static String dashboardNameGil="GilDashboard";
    protected static String dashboardNotExist="stam";

    //EXPECTED
    protected static String expectedHomePageTitle="Welcome to Grafana";


    //--------------------------------------------------------------------

    //APPIUM_STARTER
    protected static String reportDirectory = "reports";
    protected static String reportFormat = "xml";
    protected static String testName = "Untitled";
    protected static AndroidDriver<AndroidElement> androidDriver = null;
    protected static DesiredCapabilities dc = new DesiredCapabilities();

    //APPIUM_PAGES
    protected static CalculateFragmentPage calculateFragmentPage;
    protected static SavedFragmentPage savedFragmentPage;

    //APPIUM_XML

    //APPIUM_EXPECTED
    //TODO:expected result will come from  https://remotemysql.com

    //-------------------------------------------------------------------------

    //API
    protected static String restUrl = "http://admin:admin@localhost:3000/api/admin";
    protected static RequestSpecification request;
    protected static Response response;
    protected static JsonPath jp;
    protected static JSONObject params;
    protected static int numOfUsers;
    //-------------------------------------------------------------------------

    //Desktop
    protected WindowsDriver deskDriver;
    protected DesiredCapabilities capabilities;
    protected final String calcApp = "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App";

    //PAGES
    protected static CalcPage calcPage;
    protected static ToDoPage toDoPage;
    //-------------------------------------------------------------------------

    //ELECTRON
    public ChromeOptions opt;


}
