package testcases;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.stringtemplate.v4.ST;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.Utilities;
import workflow.ToDoListWorkFlow;

import java.util.concurrent.TimeUnit;

public class ToDoLIstTestCases extends CommonOps {
    int size = 0;

    @Test( description = "Create Task ")
    @Description("create task to list")
    @Parameters("taskName")
    public void test01_create(String task) {
        size = ToDoListWorkFlow.getSizeList();
        ToDoListWorkFlow.createTask(task);
        Verifications.verifyTrue(sizeList == size + 1);
    }




    @Test( description = "Complete Task ")
    @Description("mark a completed task")
    @Parameters("taskNameComplete")
    public void test02_complete(String task) {
        size = ToDoListWorkFlow.getSizeList();
        String completedString = ToDoListWorkFlow.completedTsk(task);
            Verifications.verifyEquals(completedString, Utilities.getDataXML("expectedCompleteList"));

    }
    @Test( description = "Delete Task ")
    @Description("delete task from a list")
    @Parameters("taskNameDelete")
    public void test03_delete(String task) {
        size = ToDoListWorkFlow.getSizeList();
        WebElement completedTask = ToDoListWorkFlow.deleteTask(task);
            Verifications.verifyTrue(sizeList == size - 1);
    }
}
