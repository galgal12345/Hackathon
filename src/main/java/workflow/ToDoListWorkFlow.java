package workflow;

import extensions.AllUiActions;
import extensions.ElectronActions;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageobjects.todopages.ToDoPage;
import utilities.CommonOps;

public class ToDoListWorkFlow extends CommonOps {
    @Step("creat task and add to list")
    public static void createTask(String task) {
        AllUiActions.SendKeys(toDoPage.getCreate_txt(),task);
        AllUiActions.SendKeysReturn();
        sizeList = getSizeList();
    }

    @Step("get num of list")
    public static int getSizeList() {

        return toDoPage.getList_task().size();
    }

    @Step("Search for a task by name")
    public static WebElement findTask(String task) {
        WebElement getTask;
        String text;
        for (int i = 0; i < getSizeList(); i++) {
            getTask = toDoPage.getList_task().get(i);
            text = getTask.getText().split("\n", toDoPage.getList_task().get(i).getText().length())[1];
            if (text.equals(task)) {
                return getTask;
            }
        }
        return null;
    }

    @Step("delete task")
    public static WebElement deleteTask(String task) {
        WebElement findTask = findTask(task);
        if (findTask != null) {
            ElectronActions.mouseHover(findTask);
            AllUiActions.clickOn(findTask.findElement(By.xpath("div/div//*[@class='destroy_19w1q']//*[name()='path']")));
            sizeList = getSizeList();
            return findTask;
        }
        System.out.println("There is no such task on the list");
        return null;
    }


    @Step("completed task")
    public static String completedTsk(String task) {
        WebElement findTask = findTask(task);
        if (findTask != null) {
            AllUiActions.clickOn(findTask.findElement(By.xpath("div/div/label")));
            return findTask.findElement(By.xpath("div/div/div/label")).getAttribute("class");
        }
        System.out.println("There is no such task on the list");
        return null;
    }

}