package testcases;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.CalculatorWorkFlow;

import static org.testng.AssertJUnit.assertTrue;

public class CalculatorTestCases extends CommonOps {

    @Test( description = "Calculation")
    @Description("Performing a number of operations on a calculator")
    public void test01_calc() {
        CalculatorWorkFlow.Calculation();
        Verifications.verifyTrueMsg("worng in calac",calcPage.resultNum()==120);
    }

}
