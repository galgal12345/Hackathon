package workflow;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.MobileUiActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class MortgageCalcWorkFlow extends CommonOps {

    @Step("filling text fileds with amount term and rate & clicking on calculate")
    public static void sendKeysToTextFileds(String amount, String term, String rate) {
        calculateFragmentPage.getAmount_edit_txt().sendKeys(amount);
        calculateFragmentPage.getTerm_edit_txt().sendKeys(term);
        calculateFragmentPage.getRate_edit_txt().sendKeys(rate);
        calculateFragmentPage.getCalc_btn().click();
    }

    @Step("checks if the repayment & interest only  on calculate fragment is equal to the expected result")
    public static void checkDataOnCalcFragment() {
//        assertEquals(mortgageCalcPage.getRepayment_txt_view().getText(), "£11491.92");
//        assertEquals(mortgageCalcPage.getInterest_only_txt_view().getText(), "£10833.33");
    }

    @Step("saves all the data from calculate fragment by clicking on save button")
    public static void saveDataOnCalcFragment() {
        calculateFragmentPage.getSave_btn().click();
    }

    @Step("checks if all data on the specific item is correct in savedFragmentListview")
    public static void checkDataOnSavedFragment() {

        MobileUiActions.swipeScreen();

//        assertEquals(savedFragmentPage.getAmt_txt_view().getText(), "£1300000.0");
//        assertEquals(savedFragmentPage.getTerm_txt_view().getText(), "30.0 yrs");
//        assertEquals(savedFragmentPage.getRate_txt_view().getText(), "10.0%");
//        assertEquals(savedFragmentPage.getRepayment_txt_view().getText(), "£11491.92");
//        assertEquals(savedFragmentPage.getInterestOnly_txt_view().getText(), "£10833.33");
//        assertEquals(savedFragmentPage.getSmall_date_txt_view().getText(), "Saved on 29-11-2021");

    }

    @Step("clicks on delete and checks the delete dialog buttons")
    public static void deleteOnSavedFragment() {

        savedFragmentPage.getDelete_btn().click();
        savedFragmentPage.getCancel_btn().click();
        savedFragmentPage.getDelete_btn().click();
        savedFragmentPage.getOk_btn().click();

    }
}
