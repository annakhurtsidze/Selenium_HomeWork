package SelenideTests;

import Selenide.Steps.DemoQaSteps;
import Selenide.Steps.GoogleSteps;
import Selenide.Steps.TablesActionsSelenide;
import Selenide.Utils.SetUpSelenide;
import org.testng.annotations.Test;

import java.awt.*;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTests extends SetUpSelenide {


    @Test
    public void printNamesAndBalancesSelenide(){
        open("https://the-internet.herokuapp.com/tables");
        TablesActionsSelenide tablesActionsSelenide = new TablesActionsSelenide();
        tablesActionsSelenide.printNamesAndBalancesSelenide();
        tablesActionsSelenide.checkNameFranckSelenide();

    }

    @Test
    public void demoQaTest(){
        open("https://demoqa.com/tool-tips");
        DemoQaSteps demoQaSteps= new DemoQaSteps();
        demoQaSteps.hoverOverButton();
    }

    @Test

    public void googleTest() throws InterruptedException, AWTException {
        open("https://www.google.com/");
        GoogleSteps googleSteps =new GoogleSteps();
        googleSteps.searchTExt("Selenium Robot Class example");
    }
}
