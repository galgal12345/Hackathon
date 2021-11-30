package pageobjects.mortgagecalcpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SavedFragmentPage {



    @FindBy(how = How.XPATH, using = "//*[@id='tvAmount']")
    private WebElement amt_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvTerm']")
    private WebElement term_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvRate']")
    private WebElement rate_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvRepayment']")
    private WebElement repayment_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvInterestOnly']")
    private WebElement interestOnly_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvTimestamp']")
    private WebElement small_date_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='btnDel']")
    private WebElement delete_btn;

    @FindBy(how = How.XPATH, using = "//*[@id='button2']")
    private WebElement cancel_btn;

    @FindBy(how = How.XPATH, using = "//*[@id='button1']")
    private WebElement ok_btn;


    public WebElement getAmt_txt_view() {
        return amt_txt_view;
    }

    public WebElement getTerm_txt_view() {
        return term_txt_view;
    }

    public WebElement getRate_txt_view() {
        return rate_txt_view;
    }

    public WebElement getRepayment_txt_view() {
        return repayment_txt_view;
    }

    public WebElement getInterestOnly_txt_view() {
        return interestOnly_txt_view;
    }

    public WebElement getSmall_date_txt_view() {
        return small_date_txt_view;
    }

    public WebElement getDelete_btn() {
        return delete_btn;
    }

    public WebElement getCancel_btn() {
        return cancel_btn;
    }

    public WebElement getOk_btn() {
        return ok_btn;
    }

}
