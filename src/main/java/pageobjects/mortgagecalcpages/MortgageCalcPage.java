package pageobjects.mortgagecalcpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MortgageCalcPage {

    //todo----------------------calcFragment-----------------------------

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

    //todo----------------------savedFragment-----------------------------



    @FindBy(how = How.XPATH, using = "//*[@id='tvRef']")
    private WebElement full_date_with_gmt_savedFragment_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvAmount']")
    private WebElement amt_savedFragment_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvTerm']")
    private WebElement term_savedFragment_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvRate']")
    private WebElement rate_savedFragment_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvRepayment']")
    private WebElement repayment_savedFragment_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvInterestOnly']")
    private WebElement interestOnly_savedFragment_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='tvTimestamp']")
    private WebElement small_date_savedFragment_txt_view;

    @FindBy(how = How.XPATH, using = "//*[@id='btnDel']")
    private WebElement delete_savedFragment_btn;

    @FindBy(how = How.XPATH, using = "//*[@id='button2']")
    private WebElement cancel_savedFragment_btn;

    @FindBy(how = How.XPATH, using = "//*[@id='button1']")
    private WebElement ok_savedFragment_btn;


    public WebElement getFull_date_with_gmt_savedFragment_txt_view() {
        return full_date_with_gmt_savedFragment_txt_view;
    }

    public WebElement getAmt_savedFragment_txt_view() {
        return amt_savedFragment_txt_view;
    }

    public WebElement getTerm_savedFragment_txt_view() {
        return term_savedFragment_txt_view;
    }

    public WebElement getRate_savedFragment_txt_view() {
        return rate_savedFragment_txt_view;
    }

    public WebElement getRepayment_savedFragment_txt_view() {
        return repayment_savedFragment_txt_view;
    }

    public WebElement getInterestOnly_savedFragment_txt_view() {
        return interestOnly_savedFragment_txt_view;
    }

    public WebElement getSmall_date_savedFragment_txt_view() {
        return small_date_savedFragment_txt_view;
    }

    public WebElement getDelete_savedFragment_btn() {
        return delete_savedFragment_btn;
    }

    public WebElement getCancel_savedFragment_btn() {
        return cancel_savedFragment_btn;
    }

    public WebElement getOk_savedFragment_btn() {
        return ok_savedFragment_btn;
    }

}
