package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GesturesPage
{
    static By move=By.id("moveMeHeader");
    static By dragMe=By.id("dragMe");
    static By dragMab=By.cssSelector("div.mk-map-node-element");




    static public WebElement Move(WebDriver driver) throws InterruptedException
    {
        WebElement Slider= driver.findElement(move);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Slider);
        Thread.sleep(500);
        return Slider;
    }
    static public WebElement dragMe(WebDriver driver) throws InterruptedException
    {
        WebElement Slider= driver.findElement(dragMe);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Slider);
        Thread.sleep(500);
        return Slider;
    }
    static public WebElement dragMab(WebDriver driver) throws InterruptedException
    {
        WebElement Slider= driver.findElement(dragMab);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Slider);
        Thread.sleep(500);
        return Slider;
    }

}
