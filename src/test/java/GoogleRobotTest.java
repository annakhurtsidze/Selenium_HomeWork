import Google.GoogleActions.GoogleMainPageActions;
import Google.Utils.SetUp;
import org.testng.annotations.Test;

import java.awt.*;

public class GoogleRobotTest extends SetUp {

    @Test
    public void robotTest() throws AWTException, InterruptedException {
        GoogleMainPageActions googleMainPageActions = new GoogleMainPageActions(driver);
        googleMainPageActions.searchText("Selenium Robot Class example");
        googleMainPageActions.goToTheFirstLink();
    }
}
