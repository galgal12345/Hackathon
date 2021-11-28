package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebPage {

    @FindBy(how = How.XPATH, using = "//div[2]/div/div/input")
    private WebElement username_txt;

    @FindBy(how = How.XPATH, using = "//div[2]/div[2]/div/div/input")
    private WebElement password_txt;

    @FindBy(how = How.XPATH, using = "//div[2]/div/div/form/button/span")
    private WebElement login_btn;



    @FindBy(how = How.XPATH, using = "//div[2]/div/form/div[3]/div[2]/button/span")
    private WebElement skip_btn;

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

}
