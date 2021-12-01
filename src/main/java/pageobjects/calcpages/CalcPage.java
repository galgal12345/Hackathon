package pageobjects.calcpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalcPage {

    @FindBy(name = "One")
    private WebElement btn_1;
    @FindBy(name = "Two")
    private WebElement btn_2;
    @FindBy(name = "Three")
    private WebElement btn_3;
    @FindBy(name = "Four")
    private WebElement btn_4;
    @FindBy(name = "Five")
    private WebElement btn_5;
    @FindBy(name = "Six")
    private WebElement btn_6;
    @FindBy(name = "Seven")
    private WebElement btn_7;
    @FindBy(name = "Eight")
    private WebElement btn_8;
    @FindBy(name = "Nine")
    private WebElement btn_9;
    @FindBy(name = "Zero")
    private WebElement btn_0;
    @FindBy(name = "Clear")
    private WebElement btn_C;
    @FindBy(name = "Plus")
    private WebElement btn_plus;

    @FindBy(name = "Minus")
    private WebElement btn_less;

    @FindBy(name = "Multiply by")
    private WebElement btn_multy;

    @FindBy(name = "Divide by")
    private WebElement btn_div;
    @FindBy(name = "Equals")
    private WebElement btn_equal;
    @FindBy(xpath = "//*[@AutomationId='CalculatorResults']")
    private WebElement btn_result;

    public WebElement getBtn_1() {
        return btn_1;
    }

    public WebElement getBtn_2() {
        return btn_2;
    }

    public WebElement getBtn_3() {
        return btn_3;
    }

    public WebElement getBtn_4() {
        return btn_4;
    }

    public WebElement getBtn_5() {
        return btn_5;
    }

    public WebElement getBtn_6() {
        return btn_6;
    }

    public WebElement getBtn_7() {
        return btn_7;
    }

    public WebElement getBtn_8() {
        return btn_8;
    }

    public WebElement getBtn_9() {
        return btn_9;
    }

    public WebElement getBtn_0() {
        return btn_0;
    }

    public WebElement getBtn_C() {
        return btn_C;
    }

    public WebElement getBtn_plus() {
        return btn_plus;
    }

    public WebElement getBtn_less() {
        return btn_less;
    }

    public WebElement getBtn_multy() {
        return btn_multy;
    }

    public WebElement getBtn_div() {
        return btn_div;
    }

    public WebElement getBtn_equal() {
        return btn_equal;
    }

    public WebElement getBtn_result() {
        return btn_result;
    }

    public Integer resultNum() {
        String str = btn_result.getAttribute("Name");
        String[] arr = str.split(" ");
        return Integer.parseInt(arr[arr.length - 1]);
    }
}