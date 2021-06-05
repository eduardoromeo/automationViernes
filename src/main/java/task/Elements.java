package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.ElementsUI;

public class Elements {
    public static void as(WebDriver driver){

        Click.on(driver, ElementsUI.form);
       // Click.on(driver, ElementsUI.buttonAdd);
    }
}
