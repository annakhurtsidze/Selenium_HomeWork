package Internet.Steps;

import Internet.WebElements.TablesWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TablesActions extends TablesWebElements {

    WebDriver driver;


    public TablesActions(WebDriver driver1){
        this.driver=driver1;
    }


    public void printNamesAndBalances(){
        WebElement table = driver.findElement(table1);
        List<WebElement> names = table.findElements(namesColumn);
        List<WebElement> balances = table.findElements(balancesColumn);

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i).getText();
            String balance = balances.get(i).getText();
            System.out.println("Name: " + name + ", Balance: " + balance);
        }
    }


    public void checkNameFranck(){

        WebElement table = driver.findElement(table1);
        List<WebElement> names = table.findElements(namesColumn);
        String valueToCheck = "Frank";

        List<String> nameTexts = names.stream().map(WebElement::getText).toList();
        if (nameTexts.contains(valueToCheck)) {
            System.out.println("The list contains the value: " + valueToCheck);
        } else {
            System.out.println("The list does not contain the value: " + valueToCheck);
        }
    }
}
