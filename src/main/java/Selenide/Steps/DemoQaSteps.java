package Selenide.Steps;

import Selenide.WebElements.DemoQaWebElements;
import static com.codeborne.selenide.Condition.visible;

public class DemoQaSteps extends DemoQaWebElements {

    public void hoverOverButton(){
        hoverButton.shouldBe(visible);
        hoverButton.hover();
        tooltip_inner.shouldBe(visible);
    }
}
