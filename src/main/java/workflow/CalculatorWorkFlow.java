package workflow;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

import static org.testng.AssertJUnit.assertTrue;

public class CalculatorWorkFlow extends CommonOps {
    @Step
    public static void Calculation() {
        calcPage.btn_C.click();
        calcPage.btn_1.click();
        calcPage.btn_plus.click();
        calcPage.btn_2.click();
        calcPage.btn_multy.click();
        calcPage.btn_4.click();
        calcPage.btn_2.click();
        calcPage.btn_less.click();
        calcPage.btn_6.click();
        calcPage.btn_equal.click();
        System.out.println(calcPage.resultNum());


    }


}
