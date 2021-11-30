package testcases;

import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.CalculatorWorkFlow;

import static org.testng.AssertJUnit.assertTrue;

public class CalculatorTestCases extends CommonOps {
    @Test
    public void test01() {
        CalculatorWorkFlow.Calculation();

        assertTrue("worng cala",calcPage.resultNum() == 120);
    }

}
