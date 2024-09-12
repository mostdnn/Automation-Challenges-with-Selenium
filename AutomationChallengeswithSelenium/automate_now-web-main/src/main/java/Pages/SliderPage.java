package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SliderPage
{
    static By slider=By.id("slideMe");
    static public WebElement Slider(WebDriver driver)
    {
        WebElement Slider= driver.findElement(slider);
        return Slider;
    }

}
