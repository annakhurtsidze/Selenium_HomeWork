package Selenium.Action;

import Selenium.WebElements.SeleniumDevWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SeleniumDevActions extends SeleniumDevWebElements {

    public WebDriver driver;


    public SeleniumDevActions(WebDriver driver1){
        this.driver=driver1;
    }

    public void scrollToTheBottomOfThePage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Assert.assertTrue(driver.findElement(footer).isDisplayed());
    }
}
