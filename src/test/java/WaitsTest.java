import DemoQa.Steps.ProgressBarActions;
import DemoQa.Utils.SetUp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class WaitsTest extends SetUp {

    @Test
    public void waitsTest(){
        ProgressBarActions progressBarActions = new ProgressBarActions(driver);
        driver.get("https://demoqa.com/progress-bar");
        progressBarActions.clickOnStartButton();
        progressBarActions.waitUntilProgressBarIsFull();
        progressBarActions.assertThatProgressBarIsFull();
    }
}
