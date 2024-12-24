package Selenide.WebElements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class TablesWebElementsSelenide {

    public SelenideElement

    table1 = $x("//table[@id='table1']//tbody");


    public ElementsCollection
            namesColumn = $$x("//table[@id='table1']//tbody//tr//td[2]"),
            balancesColumn = $$x("//table[@id='table1']//tbody//tr//td[4]");

}
