package Selenide.WebElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class DemoQaWebElements {

    public SelenideElement

            hoverButton = $x("//button[@id='toolTipButton']"),
            tooltip_inner = $x("//div[@class='tooltip-inner' and text()='You hovered over the Button']");
}
