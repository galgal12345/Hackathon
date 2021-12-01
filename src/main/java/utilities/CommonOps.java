package utilities;


import extensions.AllUiActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.python.util.Generic;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pageobjects.calcpages.CalcPage;
import pageobjects.grafanapages.GrafanaPage;
import pageobjects.mortgagecalcpages.CalculateFragmentPage;
import pageobjects.mortgagecalcpages.SavedFragmentPage;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {

    @Parameters({"platform"})
    @BeforeClass
    public void startSession(String value) throws MalformedURLException, SQLException, ClassNotFoundException {

        switch (value) {
            case "webDriver":
                myWebStarter();
                break;
            case "androidDriver":
                myAppiumStarter();
                break;
            case "restAssured":
                myApiStarter();
                break;
            case "desktop":
                myDesktopStarter();
                break;
            case "electron":
                myElectronStarter();
                break;
        }

    }

    @AfterMethod
    public void wait_seconds(){
        AllUiActions.wait(3);
    }


    @Step("init WEB")
    public void myWebStarter() throws SQLException, ClassNotFoundException {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get(url);
        webDriver.manage().window().maximize();
        action = new Actions(webDriver);
        screen =new Screen();
        //WEB_PAGE_FACTORY
        grafanaPage = PageFactory.initElements(webDriver, GrafanaPage.class);
        ManageDb.myDB();
    }
    @Step("init APPIUM")
    public void myAppiumStarter() {

        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "16af5295");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.shivgadhia.android.ukMortgageCalc");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");

        try {
            androidDriver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //androidDriver.setLogLevel(Level.INFO);
        //APPIUM_PAGE_FACTORY
        calculateFragmentPage = PageFactory.initElements(androidDriver, CalculateFragmentPage.class);
        savedFragmentPage = PageFactory.initElements(androidDriver, SavedFragmentPage.class);


    }
    @Step("init API")
    public void myApiStarter(){
        RestAssured.baseURI = restUrl;
        request = RestAssured.given();
        request.header("Content-Type", "application/json");
    }
    @Step("init DESKTOP")
    public void myDesktopStarter() throws MalformedURLException {
        capabilities=new DesiredCapabilities();
        capabilities.setCapability("app",calcApp);
        deskDriver=new WindowsDriver(new URL("http://127.0.0.1:4723"),capabilities);
        deskDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        calcPage = PageFactory.initElements(deskDriver, CalcPage.class);
    }
    @Step("init ELECTRON")
    public void myElectronStarter(){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\electrondriver-v3.1.2-win32-x64\\electrondriver.exe");
        opt=new ChromeOptions();
        opt.setBinary("C:\\Automation\\TodoList-Setup.exe");

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("chromeOptions", opt);
        capabilities.setBrowserName("chrome");
        webDriver = new ChromeDriver(opt);
        opt.merge(capabilities);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @AfterClass
    public void endSession() {

        if (webDriver != null) webDriver.quit();
        else if (androidDriver != null) androidDriver.quit();

    }


    @Attachment(value = "Page Screen-Shot", type = "image/png")
    public static byte[] saveScreenshot() {
        return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
    }


}
