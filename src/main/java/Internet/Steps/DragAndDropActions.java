package Internet.Steps;

import Internet.WebElements.DragAndDropWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DragAndDropActions extends DragAndDropWebElements {

    WebDriver driver;

    public DragAndDropActions(WebDriver driver1){
        this.driver=driver1;
    }

    public int getYCoordinateOfA(){
        return driver.findElement(columnA).getLocation().getY();
    }

    public int getYCoordinateOfB(){
        return driver.findElement(columnB).getLocation().getY();
    }

    public void assertYCoordinates(){
        Assert.assertEquals(getYCoordinateOfA(), getYCoordinateOfB());
    }


}
