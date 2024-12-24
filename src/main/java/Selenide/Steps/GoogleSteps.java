package Selenide.Steps;

import Selenide.WebElements.GoogleWebElements;
import java.awt.*;
import java.awt.event.KeyEvent;



public class GoogleSteps extends GoogleWebElements {

    public void searchTExt(String txt) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        searchArea.setValue(txt).pressEnter();
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }
}
