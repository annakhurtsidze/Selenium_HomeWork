package Selenide.WebElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class GoogleWebElements {

    public SelenideElement

    searchArea = $x("//textarea[@id='APjFqb']"),
    firstLink = $x("//*[@id='ixcYae']");
}
