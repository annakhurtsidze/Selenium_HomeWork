import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;


public class homeWork4 {


    @Test
    public void webTablesTest() {
        System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/tables");


        WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']//tbody"));
        List<WebElement> names = table1.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[2]"));
        List<WebElement> balances = table1.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[4]"));

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i).getText();
            String balance = balances.get(i).getText();
            System.out.println("Name: " + name + ", Balance: " + balance);
        }

        String valueToCheck = "Frank";

        List<String> nameTexts = names.stream().map(WebElement::getText).toList();
        if (nameTexts.contains(valueToCheck)) {
            System.out.println("The list contains the value: " + valueToCheck);
        } else {
            System.out.println("The list does not contain the value: " + valueToCheck);
        }

        driver.close();

        }


        @Test
    public void hoverTest(){
            System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/tool-tips");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement button = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='toolTipButton']")));
            Actions action = new Actions(driver);
            action.moveToElement(button).perform();

            WebElement tooltip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='tooltip-inner' and text()='You hovered over the Button']")));
            Assert.assertTrue(tooltip.isDisplayed());
            System.out.println(tooltip.getText());
            driver.close();
        }


        @Test
    public void robotTest() throws AWTException, InterruptedException {
            System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            Robot robot = new Robot();



            driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium Robot Class example");
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(5000);

            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(5000);
            driver.close();
        }
    }