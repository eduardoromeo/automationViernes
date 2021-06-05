package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.UserUI;

public class User {
    public static void as(WebDriver driver){
        Click.on(driver, UserUI.form);
    }
}
