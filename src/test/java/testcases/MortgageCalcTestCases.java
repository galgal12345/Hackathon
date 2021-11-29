package testcases;

import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.MortgageCalcWorkFlow;

public class MortgageCalcTestCases extends CommonOps {

    @Test
    public void calcFragment(){
        MortgageCalcWorkFlow.sendKeysToTextFileds();
        MortgageCalcWorkFlow.checkDataOnCalcFragment();
        MortgageCalcWorkFlow.saveDataOnCalcFragment();
    }

    @Test
    public void savedFragment(){
        MortgageCalcWorkFlow.checkDataOnSavedFragment();
        MortgageCalcWorkFlow.deleteOnSavedFragment();
        System.out.println("hello from new branch gil");
    }

}
