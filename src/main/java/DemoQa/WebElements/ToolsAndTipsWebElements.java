package DemoQa.WebElements;

import org.openqa.selenium.By;

public class ToolsAndTipsWebElements {

    public By

    hoverButton = By.xpath("//button[@id='toolTipButton']"),
    tooltip_inner = By.xpath("//div[@class='tooltip-inner' and text()='You hovered over the Button']");
}
