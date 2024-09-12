package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavadDlayPage
{
    static By start_javascriptdelay_btn =By.id("start");
    static By reslut_javadelay_text =By.id("delay");


    static public WebElement Start_Dlay_fn(WebDriver driver)
    {
        WebElement Start_Dlay_fn= driver.findElement(start_javascriptdelay_btn);
        return Start_Dlay_fn;
    }
    static public WebElement Resault_Delay_Text(WebDriver driver)
    {
        WebElement Resault_Delay_Text= driver.findElement(reslut_javadelay_text);
        return Resault_Delay_Text;
    }
}
