package pageobjects.mortgagecalcpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CalculateFragmentPage {


    @FindBy(how = How.XPATH, using = "//*[@id='etAmount']")
    private WebElement amount_edit_txt;

    @FindBy(how = How.XPATH, using = "//*[@id='etTerm']")
    private WebElement term_edit_txt;

    @FindBy(how = How.XPATH, using = "//*[@id='etRate']")
    private WebElement rate_edit_txt;

    @FindBy(how = How.XPATH, using = "//*[@id='add_schedule_text']")
    private WebElement calc_btn;

    @FindBy(how = How.XPATH, using = "//*[@id='tvRepayment']")
    private WebElement repayment_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvInterestOnly']")
    private WebElement interest_only_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='btnSave']")
    private WebElement save_btn;


    public WebElement getAmount_edit_txt() {
        return amount_edit_txt;
    }

    public WebElement getTerm_edit_txt() {
        return term_edit_txt;
    }

    public WebElement getRate_edit_txt() {
        return rate_edit_txt;
    }

    public WebElement getCalc_btn() {
        return calc_btn;
    }

    public WebElement getRepayment_txt_view() {
        return repayment_txt_view;
    }

    public WebElement getInterest_only_txt_view() {
        return interest_only_txt_view;
    }

    public WebElement getSave_btn() {
        return save_btn;
    }

}
