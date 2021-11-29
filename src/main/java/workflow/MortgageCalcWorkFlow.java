package workflow;

import io.qameta.allure.Step;
import utilities.CommonOps;

import static org.testng.Assert.assertEquals;

public class MortgageCalcWorkFlow extends CommonOps {

    @Step
    public static void sendKeysToTextFileds(){
        mortgageCalcPage.getAmount_edit_txt().sendKeys("1300000");
        mortgageCalcPage.getTerm_edit_txt().sendKeys("30");
        mortgageCalcPage.getRate_edit_txt().sendKeys("10");
        mortgageCalcPage.getCalc_btn().click();
    }
    @Step
    public static void checkDataOnCalcFragment(){
        assertEquals(mortgageCalcPage.getRepayment_txt_view().getText(), "£11491.92");
        assertEquals(mortgageCalcPage.getInterest_only_txt_view().getText(), "£10833.33");
    }
    @Step
    public static void saveDataOnCalcFragment(){
        mortgageCalcPage.getSave_btn().click();
    }

    //todo----------------------savedFragment-----------------------------

    @Step
    public static void checkDataOnSavedFragment(){

    }
    @Step
    public static void deleteOnSavedFragment(){

    }
}
