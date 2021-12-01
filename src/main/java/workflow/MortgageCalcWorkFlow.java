package workflow;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.MobileUiActions;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;
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
    public static void checkDataOnCalcFragment(String expectedRepayment, String expectedInterest_only) {
        assertEquals(calculateFragmentPage.getRepayment_txt_view().getText(), expectedRepayment);
        assertEquals(calculateFragmentPage.getInterest_only_txt_view().getText(), expectedInterest_only);
    }

    @Step("saves all the data from calculate fragment by clicking on save button")
    public static void saveDataOnCalcFragment() {
        calculateFragmentPage.getSave_btn().click();
    }

    @Step("checks if all data on the specific item is correct in savedFragmentListview")
    public static void checkDataOnSavedFragment() {

        MobileUiActions.swipeScreen();

        SoftAssert softDataOnSavedFragment = new SoftAssert();
        softDataOnSavedFragment.assertEquals(savedFragmentPage.getAmt_txt_view().getText(), myExpectedArray[0]);
        softDataOnSavedFragment.assertEquals(savedFragmentPage.getTerm_txt_view().getText(), myExpectedArray[1]);
        softDataOnSavedFragment.assertEquals(savedFragmentPage.getRate_txt_view().getText(), myExpectedArray[2]);
        softDataOnSavedFragment.assertEquals(savedFragmentPage.getRepayment_txt_view().getText(), myExpectedArray[3]);
        softDataOnSavedFragment.assertEquals(savedFragmentPage.getInterestOnly_txt_view().getText(), myExpectedArray[4]);
        softDataOnSavedFragment.assertAll();

    }

    @Step("clicks on delete and checks the delete dialog buttons")
    public static void deleteOnSavedFragment() {

        savedFragmentPage.getDelete_btn().click();
        savedFragmentPage.getCancel_btn().click();
        savedFragmentPage.getDelete_btn().click();
        savedFragmentPage.getOk_btn().click();

    }
}
