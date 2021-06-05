import org.testng.Assert;
import org.testng.annotations.Test;
import task.Elements;
import task.IsUserPageDisplayer;

public class ElementsTesting extends Base{
    @Test
    public void testElements(){
        Elements.as(webDriver);
        Assert.assertTrue(IsUserPageDisplayer.form(webDriver));
    }
}
