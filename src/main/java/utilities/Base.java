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
import org.sikuli.script.Screen;
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

    protected static Screen screen;
    //URL
    protected static String url = "http://localhost:3000/?orgId=1";

    //PAGES
    protected static GrafanaPage grafanaPage;

    //XML
    protected static String userName ;
    protected static String password ;
    protected static String dashboardName1="Dashboard1";
    protected static String dashboardNameAyala="AyalaDashboard";
    protected static String dashboardNameRami="RamiDashboard";
    protected static String dashboardNameGil="GilDashboard";
    protected static String dashboardNotExist="stam";
    protected static String imagesPath="C:\\Automation\\Hackathon\\Sikuli\\Images";
    protected static String logoFileName="logo.png";
    protected static String menuFileName="menu.png";
    protected static String manageFileName="manage.png";
    protected static String dashboardsFileName="dashboards.png";

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
    protected static String [] myExpectedArray = {"£1300000.0", "30.0 yrs", "10.0%", "£11491.92", "£10833.33"};

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
    //DESKTOP_STARTER

    //Desktop
    protected WindowsDriver deskDriver;
    protected DesiredCapabilities capabilities;
    protected final String calcApp = "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App";

    //PAGES
    protected static CalcPage calcPage;
    protected static ToDoPage toDoPage;
    //-------------------------------------------------------------------------

    //ELECTRON
    protected static ChromeOptions opt;
    protected static int sizeList=0;

    //--------------------------------------------------------------------------

    protected static String dbUrl = "jdbc:mysql://sql4.freemysqlhosting.net:3306/sql4455326";//Connect URL
    protected static String user = "sql4455326", pass = "KqUKNu5jPZ";//Database Username & Password
    protected static String query = "select * from login";//Query to Execute
    protected static String myUsername, myPassword;





}
