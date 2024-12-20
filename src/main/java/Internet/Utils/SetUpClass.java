package Internet.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class SetUpClass {

    public  WebDriver driver;


    @BeforeClass
    public void openBrowser () {
        System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @AfterClass
    public void closeBrowser () {
        driver.close();
    }
}
