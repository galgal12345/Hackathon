package utilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageobjects.grafanapages.GrafanaPage;
import pageobjects.mortgagecalcpages.MortgageCalcPage;

public class Base {


    //WEB
    protected static WebDriver webDriver;

    //APPIUM_STARTER
    protected static String reportDirectory = "reports";
    protected static String reportFormat = "xml";
    protected static String testName = "Untitled";
    protected static AndroidDriver<AndroidElement> androidDriver = null;
    protected static DesiredCapabilities dc = new DesiredCapabilities();

    //APPIUM_PAGES
    protected static MortgageCalcPage mortgageCalcPage;

    //APPIUM_XML

    //APPIUM_EXPECTED

    //URL
    protected static String url = "http://localhost:3000/?orgId=1";

    //PAGES
    protected static GrafanaPage grafanaPage;

    //XML
    protected static String userName = "admin";
    protected static String password = "admin";


}
