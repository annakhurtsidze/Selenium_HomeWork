package Google.GoogleActions;

import Google.GoogleWebElements.WebElements;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GoogleMainPageActions extends WebElements{

    WebDriver driver;


    public GoogleMainPageActions(WebDriver driver1){
        this.driver=driver1;
    }


    public void searchText(String text){
        driver.findElement(searchArea).sendKeys(text);
    }

    public void goToTheFirstLink() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
    }
}
