package WebdriverUniversity.Steps;

import WebdriverUniversity.WebElements.WebDriverUniWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class WDUniversityActions extends WebDriverUniWebElements {

    public WebDriver driver;
    public WebDriverWait wait;


    public WDUniversityActions(WebDriver driver1){
        this.driver=driver1;
    }

    public void clickOnLanguagesDropDown(){
        driver.findElement(programingLanguagesDropDown).click();
    }


    public void choosePythonFromDropDown(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement pythonOptionElement = wait.until(ExpectedConditions.elementToBeClickable(pythonOption));
        driver.findElement(pythonOption).click();
        Assert.assertEquals(driver.findElement(pythonOption).getText(), "Python");
    }


    public  void checkUncheckedBoxes(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> checkboxValues = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(checkboxesElements));
        for(int i=0; i<checkboxValues.size(); i++){
            if (!checkboxValues.get(i).isSelected()){
                checkboxValues.get(i).click();
            }
        }
    }

    public void clickOnYellowRadioButton(){
        driver.findElement(yellowRadioButton).click();
    }

    public void clickOnFruitsSelect(){
        driver.findElement(fruitsSelect).click();


        Assert.assertFalse(driver.findElement(orangeOptionFromFruitsDropDown).isEnabled());


    }
}
