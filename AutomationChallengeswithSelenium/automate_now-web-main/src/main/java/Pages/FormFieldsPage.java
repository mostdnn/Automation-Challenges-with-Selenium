package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormFieldsPage
{  static By name =By.id("name-input");
    static By drink1 =By.id("drink1");
    static By drink2 =By.id("drink2");
    static By drink3 =By.id("drink3");
    static By drink4 =By.id("drink4");
    static By drink5 =By.id("drink5");
    static By color4=By.id("color4");

    static By siblings= By.name("automation");
    static By option_drob=By.cssSelector("option[value=\"yes\"]");
    static By mail= By.id("email");
    static By message= By.name("message");
    static By btn_submit=By.id("submit-btn");

    static public WebElement Name(WebDriver driver)
    {
        WebElement Name=driver.findElement(name);
     return Name;
    }
    static public WebElement Drink1(WebDriver driver)
    {
        WebElement Drink=driver.findElement(drink1);
        return Drink;
    }
    static public WebElement Drink2(WebDriver driver)
    {
        WebElement Drink=driver.findElement(drink2);
        return Drink;
    }
    static public WebElement Drink3(WebDriver driver)
    {
        WebElement Drink=driver.findElement(drink3);
        return Drink;
    }
    static public WebElement Drink4(WebDriver driver)
    {
        WebElement Drink=driver.findElement(drink4);
        return Drink;
    }
    static public WebElement Drink5(WebDriver driver)
    {
        WebElement Drink=driver.findElement(drink5);
        return Drink;
    }
    static public WebElement Color(WebDriver driver)
    {
        WebElement Color=driver.findElement(color4);
        return Color;
    }
    static public WebElement Siblings(WebDriver driver)
    {
        WebElement Siblings=driver.findElement(siblings);
        return Siblings;
    }
    static public WebElement Option_Drob(WebDriver driver)
    {
        WebElement Option_drob=driver.findElement(option_drob);
        return Option_drob;
    }
    static public WebElement Mail(WebDriver driver)
    {
        WebElement Mail=driver.findElement(mail);
        return Mail;
    }
    static public WebElement Message(WebDriver driver)
    {
        WebElement Message=driver.findElement(message);
        return Message;
    }
    static public WebElement Btn_Submit(WebDriver driver)
    {
        WebElement Btn_Submit=driver.findElement(btn_submit);
        return Btn_Submit;
    }
}
