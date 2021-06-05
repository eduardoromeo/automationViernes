import org.testng.Assert;
import org.testng.annotations.Test;
import task.IsUserPageDisplayer;
import task.User;

public class ImagesTesting extends Base{
    @Test
    public void testImages(){
        User.as(webDriver);
        Assert.assertTrue(IsUserPageDisplayer.form(webDriver));
    }
}
