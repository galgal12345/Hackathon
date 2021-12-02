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
import org.openqa.selenium.support.ui.WebDriverWait;
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
    protected static String url;

    //PAGES
    protected static GrafanaPage grafanaPage;

    //DB
    protected static String userName ;
    protected static String password ;
    //XML
    protected static String dashboardName1=Utilities.getDataXML("dashboardName1");
    protected static String dashboardNameAyala=Utilities.getDataXML("dashboardNameAyala");
    protected static String dashboardNameRami=Utilities.getDataXML("dashboardNameRami");
    protected static String dashboardNameGil=Utilities.getDataXML("dashboardNameGil");
    protected static String dashboardNotExist=Utilities.getDataXML("dashboardNotExist");
    protected static String imagesPath=Utilities.getDataXML("imagesPath");
    protected static String logoFileName=Utilities.getDataXML("logoFileName");
    protected static String menuFileName=Utilities.getDataXML("menuFileName");
    protected static String manageFileName=Utilities.getDataXML("manageFileName");
    protected static String dashboardsFileName=Utilities.getDataXML("dashboardsFileName");
    //EXPECTED
    protected static String expectedHomePageTitle=Utilities.getDataXML("expectedHomePageTitle");


    //--------------------------------------------------------------------

    //APPIUM_STARTER
    protected static String reportDirectory = Utilities.getDataXML("reportDirectory");
    protected static String reportFormat = Utilities.getDataXML("reportFormat");
    protected static String testName =Utilities.getDataXML("testName");
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
    protected static String restUrl;
    protected static RequestSpecification request;
    protected static Response response;
    protected static JsonPath jp;
    protected static JSONObject params;
    protected static int numOfUsers;
    protected static int  userId=0;
    //-------------------------------------------------------------------------
    //DESKTOP_STARTER

    //Desktop
    protected static WindowsDriver deskDriver;
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
//SQL
    protected static String dbUrl =Utilities.getDataXML("dbUrl");//Connect URL
    protected static String user =Utilities.getDataXML("user"), pass = Utilities.getDataXML("pass");//Database Username & Password
    protected static String query =Utilities.getDataXML("query");//Query to Execute






}
