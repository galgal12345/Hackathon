package testcases;

import extensions.Verifications;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.CalculatorWorkFlow;

import static org.testng.AssertJUnit.assertTrue;

public class CalculatorTestCases extends CommonOps {
    @Test
    public void test01() {
        CalculatorWorkFlow.Calculation();
        Verifications.verifyTrueMsg("worng in calac",calcPage.resultNum()==120);
    }

}
