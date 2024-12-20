package DemoQa.Steps;

import DemoQa.Utils.SetUp;
import DemoQa.WebElements.ProgressBarElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProgressBarActions extends ProgressBarElements {

    WebDriver driver;
    WebDriverWait wait;

    public ProgressBarActions(WebDriver driver1){
        this.driver=driver1;
    }

    public void clickOnStartButton(){
        driver.findElement(startButton).click();
    }

    public String waitUntilProgressBarIsFull(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBe(progressBar, "100%"));
        return driver.findElement(progressBar).getText();
    }


    public void assertThatProgressBarIsFull(){
        Assert.assertEquals("100%", waitUntilProgressBarIsFull());
    }
}
