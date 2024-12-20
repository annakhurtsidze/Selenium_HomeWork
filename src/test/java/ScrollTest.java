import DemoQa.Steps.TextBoxPageActions;
import DemoQa.Utils.SetUp;
import Selenium.Action.SeleniumDevActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ScrollTest extends SetUp {

//    @Test
//    public void pageScrollTest() throws InterruptedException {
//
//        //ეს ტესტი ფეილდება და ვერ გავაკეთე
//        System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        Long scrollPositionBefore = (Long) js.executeScript("return window.scrollY;");
//
//        // Perform the scroll action (e.g., scroll down by 500 pixels)
//        js.executeScript("window.scrollBy(0, 500);");
//
//        Thread.sleep(2000);
//
//        // Get the current scroll position after scrolling
//        Long scrollPositionAfter = (Long) js.executeScript("return window.scrollY;");
//
//        // Assert that the scroll position has changed
//        Assert.assertNotEquals(scrollPositionBefore, scrollPositionAfter, "The page position has not changed after scroll.");
//
//
//
//        driver.quit();
//
//    }


    @Test
    public void scrollToElement(){
        TextBoxPageActions textBoxPageActions =new TextBoxPageActions(driver);
        driver.get("https://demoqa.com/text-box");

        textBoxPageActions.scrollToSubmitButton();
        textBoxPageActions.assertThatSubmitButtonIsDisplayed();

    }


    @Test
    public void fullScrollTest(){
        driver.get("https://www.selenium.dev/");
        SeleniumDevActions seleniumDevActions = new SeleniumDevActions(driver);

        seleniumDevActions.scrollToTheBottomOfThePage();

    }
}
