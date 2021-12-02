package workflow;

import extensions.AllUiActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

import static org.testng.AssertJUnit.assertTrue;

public class CalculatorWorkFlow extends CommonOps {
    @Step("operations on a calculator")
    public static void Calculation() {
        AllUiActions.clickOn(calcPage.getBtn_C());
        AllUiActions.clickOn(calcPage.getBtn_1());
        AllUiActions.clickOn(calcPage.getBtn_plus());
        AllUiActions.clickOn( calcPage.getBtn_2());
        AllUiActions.clickOn(calcPage.getBtn_multy());
        AllUiActions.clickOn(calcPage.getBtn_4());
        AllUiActions.clickOn( calcPage.getBtn_2());
        AllUiActions.clickOn(calcPage.getBtn_less());
        AllUiActions.clickOn(calcPage.getBtn_6());
        AllUiActions.clickOn(calcPage.getBtn_equal());
    }


}
