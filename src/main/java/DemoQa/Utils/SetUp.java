package DemoQa.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class SetUp{
    public  WebDriver driver;


    @BeforeClass
    public void openBrowser () {
        System.setProperty("WebDriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @AfterClass
    public void closeBrowser () {
        if (driver != null) {
            driver.quit();
        }
    }
}
