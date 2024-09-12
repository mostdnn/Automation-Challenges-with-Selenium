package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PopUpPages
{
    static By alert_popup =By.id("alert");
    static By confirm_popup =By.id("confirm");
    static By prompt_popup =By.id("prompt");
    static public WebElement Alert_PopUp(WebDriver driver)
    {
        WebElement Alert_PopUp= driver.findElement(alert_popup);
        return Alert_PopUp;
    }
    static public WebElement Prompt_PopUp(WebDriver driver)
    {
        WebElement Prompt_PopUp= driver.findElement(prompt_popup);
        return Prompt_PopUp;
    }
    static public WebElement Confirm_PopUp(WebDriver driver)
    {
        WebElement Confirm_PopUp= driver.findElement(confirm_popup);
        return Confirm_PopUp;
    }

}
