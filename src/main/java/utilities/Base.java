package utilities;

import org.openqa.selenium.WebDriver;
import pageobjects.WebPage;

public class Base {


    //WEB
    protected static WebDriver driver;

    //URL
    protected static String url = "http://localhost:3000/?orgId=1";

    //PAGES
    protected static WebPage webPage;

    //XML
    protected static String userName = "admin";
    protected static String password = "admin";
}
