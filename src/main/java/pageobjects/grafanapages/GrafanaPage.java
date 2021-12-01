package pageobjects.grafanapages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GrafanaPage {

    @FindBy(how = How.XPATH, using = "//div[2]/div/div/input")
    private static WebElement username_txt;

    @FindBy(how = How.XPATH, using = "//div[2]/div[2]/div/div/input")
    private static WebElement password_txt;

    @FindBy(how = How.XPATH, using = "//div[2]/div/div/form/button/span")
    private WebElement login_btn;

    @FindBy(how = How.XPATH, using = "//div[2]/div/form/div[3]/div[2]/button/span")
    private WebElement skip_btn;

    @FindBy(how = How.XPATH, using = "//section/div[2]/div/h1")
    private WebElement homePageTitle;

    @FindBy(how = How.XPATH,using = "/html/body/div/div/nav/div[2]/div[2]/a")
    private WebElement addDashboard;

    @FindBy(how = How.XPATH,using = "//div[2]/div[1]/div[1]")
    private WebElement addEmptyPanelLink;

    @FindBy(how = How.XPATH,using = "//div[2]/div[1]/div[5]/button/div")
    private WebElement saveBtn1;
    @FindBy(how = How.XPATH,using = "//form/div[1]/div[2]/div/div/input")
    private WebElement dashboardNameInput;

    @FindBy(how = How.CLASS_NAME,using = "css-aja5tg-button")
    private WebElement saveBtn2;

    @FindBy(how = How.XPATH,using = "//section/div[2]/div/div[1]/div[2]/ul")
    private WebElement dashboardsItems;

    @FindBy(how = How.XPATH,using = "/html/body/div/div/nav/div[2]/div[3]/a")
    private WebElement dashboardsTitle;

    @FindBy(how = How.XPATH,using = "/html/body/div/div/nav/div[2]/div[1]/button")
    private WebElement search;

    @FindBy(how = How.XPATH,using = "/html/body/div/div/main/div[3]/div/div[1]/div[1]/input")
    private WebElement searchInput;

    @FindBy(how = How.XPATH,using = "/html/body/div/div/main/div[3]/div/div[2]/div[2]/div[1]/div")
    private WebElement noFoundMessage;

    @FindBy(how = How.XPATH,using = "/html/body/div/div/nav/div[2]/div[3]/ul/li[4]")
    private WebElement manageBtn;

    @FindBy(how = How.XPATH,using = "//*/div/a/div[2]/div/div[1]/h2")
    private List<WebElement> dashboardItems;

    @FindBy(how = How.XPATH,using = "//header/div/nav/h1/a")
    private WebElement dashboardHeader;



    public static WebElement getUsername_txt() {
        return username_txt;
    }

    public static WebElement getPassword_txt() {
        return password_txt;
    }

    public WebElement getLogin_btn() {
        return login_btn;
    }
    public WebElement getSkip_btn() {
        return skip_btn;
    }

    public WebElement getHomePageTitle() {
        return homePageTitle;
    }

    public WebElement getAddDashboard() {
        return addDashboard;
    }

    public WebElement getAddEmptyPanelLink() {
        return addEmptyPanelLink;
    }

    public WebElement getSaveBtn1() {
        return saveBtn1;
    }

    public WebElement getDashboardNameInput() {
        return dashboardNameInput;
    }

    public WebElement getSaveBtn2() {
        return saveBtn2;
    }

    public WebElement getDashboardsItems() {
        return dashboardsItems;
    }

    public WebElement getDashboardsTitle() {
        return dashboardsTitle;
    }

    public WebElement getManageBtn() {
        return manageBtn;
    }

    public WebElement getSearch() {
        return search;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getNoFoundMessage() {
        return noFoundMessage;
    }

    public List<WebElement> getDashboardItems() {
        return dashboardItems;
    }

    public WebElement getDashboardHeader() {
        return dashboardHeader;
    }
}
