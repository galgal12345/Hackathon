package pageobjects.todopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ToDoPage {
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/input")
    private WebElement create_txt;

    @FindBy(xpath = "//*[@class=\"draggableList_DX-a1\"]/div")
    private List<WebElement> list_task;

    public WebElement getCreate_txt() {
        return create_txt;
    }

    public List<WebElement> getList_task() {
        return list_task;
    }

}
