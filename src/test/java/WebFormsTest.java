import WebdriverUniversity.Steps.WDUniversityActions;
import WebdriverUniversity.Utils.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebFormsTest extends SetUp {


    @Test
    public void webFormsTest(){

        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WDUniversityActions wdUniversityActions = new WDUniversityActions(driver);

        wdUniversityActions.clickOnLanguagesDropDown();
        wdUniversityActions.choosePythonFromDropDown();
        wdUniversityActions.checkUncheckedBoxes();
        wdUniversityActions.clickOnYellowRadioButton();
        wdUniversityActions.clickOnFruitsSelect();

    }
}
