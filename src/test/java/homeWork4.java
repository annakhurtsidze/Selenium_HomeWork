import DemoQa.Steps.ToolsAndTipsActions;
import Internet.Steps.TablesActions;
import Internet.Utils.SetUpClass;
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


public class homeWork4 extends SetUpClass {


    @Test
    public void webTablesTest() {
        driver.get("https://the-internet.herokuapp.com/tables");
        TablesActions tablesActions = new TablesActions(driver);
        tablesActions.printNamesAndBalances();
        tablesActions.checkNameFranck();
        }


        @Test
    public void hoverTest(){
            driver.get("https://demoqa.com/tool-tips");
            ToolsAndTipsActions toolsAndTipsActions = new ToolsAndTipsActions(driver);
            toolsAndTipsActions.hoverOverButton();
            toolsAndTipsActions.asserThatToolTipTextIsDisplayed();


        }
    }