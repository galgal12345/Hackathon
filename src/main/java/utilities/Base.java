package utilities;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageobjects.grafanapages.GrafanaPage;
import pageobjects.mortgagecalcpages.CalculateFragmentPage;
import pageobjects.mortgagecalcpages.SavedFragmentPage;

public class Base {

    //-------------------------------------------------------------------------

    //WEB_STARTER
    protected static WebDriver webDriver;

    //WEB_URL
    protected static String url = "http://localhost:3000/?orgId=1";

    //WEB_PAGES
    protected static GrafanaPage grafanaPage;

    //WEB_XML
    protected static String userName = "admin";
    protected static String password = "admin";

    //WEB_EXPECTED
    //TODO:expected result will come from  https://remotemysql.com

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

    //RESTAPI_STARTER
    protected static Response response;
    protected static RequestSpecification httpRequest;
    protected static String restAssuredURL = "https://api.chucknorris.io/";

    //RESTAPI_XML

    //RESTAPI_EXPECTED
    //TODO:expected result will come from  https://remotemysql.com

    //-------------------------------------------------------------------------
    //DESKTOP_STARTER

    //-------------------------------------------------------------------------
    //ELECTRON_STARTER

    //-------------------------------------------------------------------------




}
