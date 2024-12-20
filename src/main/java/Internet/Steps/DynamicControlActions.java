package Internet.Steps;

import Internet.WebElements.DynamicControlWebElements;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DynamicControlActions extends DynamicControlWebElements {

    WebDriver driver;

    public DynamicControlActions(WebDriver driver1){
        driver = driver1;
    }

    public  void enrolButtonClick(){
        driver.findElement(enableButton).click();
    }

    public void inputValueToTheField(String value){
        driver.findElement(textField).sendKeys(value);
    }

    public void clearInputField(){
        driver.findElement(textField).clear();
    }

    public void assertTxtFieldIsEnabled(){

    }


    public void assertFieldIsEnabledText(){
        Assert.assertEquals("It's enabled!", driver.findElement(message).getText());
    }

    public void assertButtonIsDisabledText(){
        Assert.assertEquals("Disable", driver.findElement(enableButton).getText());
    }
}
