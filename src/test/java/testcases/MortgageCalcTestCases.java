package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.Utilities;
import workflow.MortgageCalcWorkFlow;

public class MortgageCalcTestCases extends CommonOps {

    @Test(priority = 1, dataProvider = "data-provider" ,dataProviderClass = Utilities.class, description = "Sends Keys To Calc Text Fileds")
    @Description("sends data to to the three text fileds on mortgage calculator checking the data is correct and saving data")
    public void calcFragment(String amount, String term, String rate){
        MortgageCalcWorkFlow.sendKeysToTextFileds(amount, term, rate);
        MortgageCalcWorkFlow.checkDataOnCalcFragment();//--
        MortgageCalcWorkFlow.saveDataOnCalcFragment();
    }

    @Test(priority = 2, description = "Check Data In Saved Fragment & Delete")
    @Description("checks if data is correct on saved fragment and deletes one of the items on the list view")
    public void savedFragment(){
        MortgageCalcWorkFlow.checkDataOnSavedFragment();//--
        MortgageCalcWorkFlow.deleteOnSavedFragment();
    }

    //todo:1) doesn't add the lest one on the data provider
    //todo:2) we need to create DB to send the expected to checkDataOnCalcFragment
    //todo 3) i think that checkDataOnSavedFragment doesn't really check the data


}
