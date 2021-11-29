package pageobjects.grafanapages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GrafanaPage {

    @FindBy(how = How.XPATH, using = "//div[2]/div/div/input")
    private WebElement username_txt;

    @FindBy(how = How.XPATH, using = "//div[2]/div[2]/div/div/input")
    private WebElement password_txt;

    @FindBy(how = How.XPATH, using = "//div[2]/div/div/form/button/span")
    private WebElement login_btn;

    @FindBy(how = How.XPATH, using = "//div[2]/div/form/div[3]/div[2]/button/span")
    private WebElement skip_btn;

    @FindBy(how = How.XPATH, using = "//section/div[2]/div/h1")
    private WebElement homePageTitle;


    @FindBy(how = How.XPATH,using = "/html/body/div/div/main/div[3]/div/div/div[1]/div/div/div[1]/div/div/div[2]/section/div[2]/div/div[2]/div/div[2]/div[2]/div/a")
    private WebElement createDashboardLink;
//
//    @FindBy(how = How.XPATH,using = "//*[name()='svg']//*[name()='path'][@d='M19,11H13V5a1,1,0,0,0-2,0v6H5a1,1,0,0,0,0,2h6v6a1,1,0,0,0,2,0V13h6a1,1,0,0,0,0-2Z']")
//    private WebElement newBtn;

    @FindBy(how = How.XPATH,using = "//*[name()='svg']/*[name()='path'][@fill='url(#a)']")
    private WebElement addPanel;


    @FindBy(how = How.XPATH,using = "/html/body/div/div/main/div[3]/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div[1]/div[1]")
    private WebElement addEmptyPanelLink;

    @FindBy(how = How.XPATH,using = "//div[2]/div[1]/div[5]/button/div")
    private WebElement saveBtn;

    @FindBy(how = How.XPATH,using = "//form/div[1]/div[2]/div/div/input")
    private WebElement dashboardNameInput;

//    @FindBy(how = How.XPATH,using = "//div[2]/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div/div")
//    public WebElement dataSourceSelect;





    public WebElement getUsername_txt() {
        return username_txt;
    }

    public WebElement getPassword_txt() {
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

//    public WebElement getNewBtn() {
//        return newBtn;
//    }

//    public WebElement getCreateDashboardLink() {
//        return createDashboardLink;
//    }


    public WebElement getAddPanel() {
        return addPanel;
    }

    public WebElement getAddEmptyPanelLink() {
        return addEmptyPanelLink;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    public WebElement getDashboardNameInput() {
        return dashboardNameInput;
    }
}
