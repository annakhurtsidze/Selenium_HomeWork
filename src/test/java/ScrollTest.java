import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ScrollTest {

    @Test
    public void pageScrollTest() throws InterruptedException {

        //ეს ტესტი ფეილდება და ვერ გავაკეთე
        System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Long scrollPositionBefore = (Long) js.executeScript("return window.scrollY;");

        // Perform the scroll action (e.g., scroll down by 500 pixels)
        js.executeScript("window.scrollBy(0, 500);");

        Thread.sleep(2000);

        // Get the current scroll position after scrolling
        Long scrollPositionAfter = (Long) js.executeScript("return window.scrollY;");

        // Assert that the scroll position has changed
        Assert.assertNotEquals(scrollPositionBefore, scrollPositionAfter, "The page position has not changed after scroll.");



        driver.quit();

    }


    @Test
    public void scrollToElement(){
        System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        WebElement submitButton = driver.findElement(By.id("submit"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);

        Assert.assertTrue(submitButton.isDisplayed());
        Assert.assertTrue(submitButton.isEnabled());
        driver.quit();

    }


    @Test
    public void fullScrollTest(){
        System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        WebElement footer = driver.findElement(By.className("bg-dark"));
        Assert.assertTrue(footer.isDisplayed());

        driver.quit();

    }
}
