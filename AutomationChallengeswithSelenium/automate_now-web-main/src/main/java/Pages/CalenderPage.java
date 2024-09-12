package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalenderPage
{
    static By text=By.name("g1065-selectorenteradate");
    static By submit=By.xpath("//button[text()=\"Submit\"]");

    static public WebElement Text(WebDriver driver)
    {
        WebElement Text= driver.findElement(text);
        return Text;
    }
    static public WebElement Submit(WebDriver driver)
    {
        WebElement Submit= driver.findElement(submit);
        return Submit;
    }
}
