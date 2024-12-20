package DemoQa.Steps;

import DemoQa.WebElements.TextBoxPageElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TextBoxPageActions extends TextBoxPageElements {

    public WebDriver driver;


    public TextBoxPageActions(WebDriver driver1){
        this.driver=driver1;
    }

    public void scrollToSubmitButton(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(submitButton));
    }

    public void assertThatSubmitButtonIsDisplayed(){
        Assert.assertTrue(driver.findElement(submitButton).isDisplayed());
        Assert.assertTrue(driver.findElement(submitButton).isEnabled());
    }
}
