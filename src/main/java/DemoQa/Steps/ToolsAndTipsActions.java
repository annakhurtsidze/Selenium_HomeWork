package DemoQa.Steps;

import DemoQa.WebElements.ToolsAndTipsWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ToolsAndTipsActions extends ToolsAndTipsWebElements {

    WebDriver driver;
    WebDriverWait wait;

    public ToolsAndTipsActions(WebDriver driver1){
        this.driver=driver1;
    }

    public void hoverOverButton(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(hoverButton));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(hoverButton)).perform();
    }

    public void asserThatToolTipTextIsDisplayed(){

         wait.until(ExpectedConditions.visibilityOfElementLocated(tooltip_inner));
        Assert.assertTrue(driver.findElement(tooltip_inner).isDisplayed());

    }
}
