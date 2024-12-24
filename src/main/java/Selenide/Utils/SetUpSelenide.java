package Selenide.Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class SetUpSelenide {


    @BeforeClass
    public void openBrowser () {
        Configuration.browser = "chrome";
        Configuration.browserSize = "null";
    }



}
