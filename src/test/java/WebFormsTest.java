import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebFormsTest {

    @Test
    public void webFormsTest(){
        System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        driver.findElement(By.xpath(".//select[@id='dropdowm-menu-1']")).click();
        driver.findElement(By.xpath(".//option[@value='python']")).click();
        System.out.println(driver.findElement(By.xpath(".//option[@value='python']")).getText());
        driver.findElement(By.xpath(".//input[@value='option-1']")).click();
        driver.findElement(By.xpath(".//input[@value='option-2']")).click();
        driver.findElement(By.xpath(".//input[@value='option-4']")).click();
        driver.findElement(By.xpath(".//input[@type='radio' and @value='yellow']")).click();
        driver.findElement(By.xpath(".//select[@id='fruit-selects']")).click();
        boolean orangeOptionState = driver.findElement(By.xpath(".//option[@value='orange']")).isEnabled();
        System.out.println(orangeOptionState);

        driver.close();
    }
}
