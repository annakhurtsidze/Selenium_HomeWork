package Selenide.Steps;

import Selenide.WebElements.TablesWebElementsSelenide;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;

public class TablesActionsSelenide extends TablesWebElementsSelenide {


    public void printNamesAndBalancesSelenide(){
        for (int i = 0; i < namesColumn.size(); i++) {
            String name = namesColumn.get(i).getText();
            String balance = balancesColumn.get(i).getText();
            System.out.println("Name: " + name + ", Balance: " + balance);
        }
    }

    public void checkNameFranckSelenide(){
        String valueToCheck = "Frank";
        try {
            namesColumn.filterBy(text(valueToCheck)).shouldHave(sizeGreaterThan(0));
            System.out.println("The list contains the value: " + valueToCheck);
        } catch (AssertionError e) {
            System.out.println("The list does not contain the value: " + valueToCheck);
        }
    }
}
