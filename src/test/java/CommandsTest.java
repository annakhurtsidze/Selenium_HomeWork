import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CommandsTest {

    @Test
    public void dynamicControls(){
        System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-example\"]/input"))
        );
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).isEnabled();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        Assert.assertEquals("It's enabled!", driver.findElement(By.id("message")).getText());
        Assert.assertEquals("Disable", driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).getText());

        driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).sendKeys("BootCamp");
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).clear();

        driver.close();

    }


    @Test
    public void dragAndDropTest(){
        System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Assert.assertEquals(driver.findElement(By.id("column-a")).getLocation().getY(), driver.findElement(By.id("column-b")).getLocation().getY());
        System.out.println(driver.findElement(By.id("column-a")).getLocation().getY());
        System.out.println(driver.findElement(By.id("column-b")).getLocation().getY());

        driver.close();

    }
}
