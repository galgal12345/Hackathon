package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pageobjects.grafanapages.GrafanaPage;
import pageobjects.mortgagecalcpages.MortgageCalcPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

public class CommonOps extends Base {


    @BeforeClass
    public void startSession() {

        switch("androidDriver") {
            case "webDriver": myWebStarter();
                break;
            case "androidDriver": myAppiumStarter();
                break;
            case "restAssured": myApiStarter();
                break;
            default:
                // code block
        }

        grafanaPage = PageFactory.initElements(webDriver, GrafanaPage.class);
        mortgageCalcPage = PageFactory.initElements(androidDriver, MortgageCalcPage.class);
    }

    public void myWebStarter(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }
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

    }
    private void myApiStarter() {
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
