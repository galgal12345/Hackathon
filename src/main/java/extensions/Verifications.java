package extensions;

import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Verifications<T> {
    static SoftAssert softAssert = new SoftAssert();
    @Step("verify string" )
    public static void verifyEquals(String actual,String expected){
        assertEquals(actual,expected);
    }
    @Step("verify int" )
    public static void verifyEquals(int actual,int expected){
        assertEquals(actual,expected);
    }
    @Step("verify boolean" )
    public static void verifyEquals(boolean actual,boolean expected){
        assertEquals(actual,expected);
    }
    @Step("verify true" )
    public static void verifyTrue(boolean condition){
        assertTrue(condition);
    }
    @Step("verify true with message" )
    public static void verifyTrueMsg(String message,boolean condition){
        assertTrue(message,condition);
    }
    @Step("verify string  softAssert")
    public static void softAssert(String actual,String expected){
        softAssert.assertEquals(actual,expected);
    }
    @Step("verify int softAssert")
    public static void softAssert(int actual,int expected){
        softAssert.assertEquals(actual,expected);
    }
    @Step("verify boolean softAssert")
    public static void softAssert(boolean actual,boolean expected){
        softAssert.assertEquals(actual,expected);
    }

    @Step("verify assertAll")
    public static void assertAll(){
        softAssert.assertAll();
    }







}
