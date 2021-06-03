package task;

import actions.IsDisplayed;
import org.openqa.selenium.WebDriver;
import ui.UserUI;

public class IsUserPageDisplayer {
    public static boolean form(WebDriver webDriver){
        return IsDisplayed.element(webDriver, UserUI.form);
    }
}
