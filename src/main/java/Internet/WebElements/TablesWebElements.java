package Internet.WebElements;

import org.openqa.selenium.By;

public class TablesWebElements {

    public By
    table1 = By.xpath("//table[@id='table1']//tbody"),
    namesColumn = By.xpath("//table[@id='table1']//tbody//tr//td[2]"),
    balancesColumn = By.xpath("//table[@id='table1']//tbody//tr//td[4]");
}
