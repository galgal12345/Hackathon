package testcases;

import extensions.Verifications;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.ToDoListWorkFlow;

import java.util.concurrent.TimeUnit;

public class ToDoLIstTestCases extends CommonOps {
    int size = 0;

    @Test
    @Parameters({"taskName"})
    public void test01_create() {
        size = ToDoListWorkFlow.getSizeList();
        ToDoListWorkFlow.createTask("new task");
        Verifications.verifyTrue(sizeList == size + 1);
    }




    @Test()
    public void test02_complete() {
        size = ToDoListWorkFlow.getSizeList();
        String completedString = ToDoListWorkFlow.completedTsk("new task");
      //  if (completedString != null)
            Verifications.verifyEquals(completedString,"label_5i8SP completed_bHv-Q");

    }
       @Test()
    public void test03_delete() {
        size = ToDoListWorkFlow.getSizeList();
        WebElement completedTask = ToDoListWorkFlow.deleteTask("nתew task");
        //if (completedTask != null)
            Verifications.verifyTrue(sizeList == size - 1);
    }
}
