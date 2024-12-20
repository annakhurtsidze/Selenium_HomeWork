import Internet.Steps.DragAndDropActions;
import Internet.Steps.DynamicControlActions;
import Internet.Utils.SetUpClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class CommandsTest extends SetUpClass {


    @Test
    public  void dynamicControlsTest(){
        DynamicControlActions dynamicControlActions =new DynamicControlActions(driver);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        dynamicControlActions.enrolButtonClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicControlActions.textField));
        wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicControlActions.message));
        dynamicControlActions.assertFieldIsEnabledText();
        dynamicControlActions.assertButtonIsDisabledText();
        dynamicControlActions.inputValueToTheField("BootCamp");
        dynamicControlActions.clearInputField();
    }

    @Test
    public void dragAndDropTest(){

        DragAndDropActions dragAndDropActions = new DragAndDropActions(driver);
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        dragAndDropActions.assertYCoordinates();
    }

}
