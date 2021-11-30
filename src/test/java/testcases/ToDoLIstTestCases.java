package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class ToDoLIstTestCases extends CommonOps {
    @Test
    public void test01(){
        driver.findElement(By.name("Create a task")).sendKeys("C");

    }
}
