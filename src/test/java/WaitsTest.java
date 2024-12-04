import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitsTest {

    @Test
    public void waitsTest(){
        System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/progress-bar");
        driver.findElement(By.xpath(".//button[@id='startStopButton']")).click();
        wait.until(ExpectedConditions.textToBe(By.xpath(".//div[@id='progressBar']"), "100%"));
        String progressBarText = driver.findElement(By.xpath(".//div[@id='progressBar']")).getText();
        System.out.println(progressBarText);
        driver.close();
    }
}
