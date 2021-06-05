import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.IsUserPageDisplayer;
import task.User;

public class ABtesting extends Base{
    @Test
    public void testAB(){
        User.as(webDriver);
        Assert.assertTrue(IsUserPageDisplayer.form(webDriver));
    }

}
