package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowOpertionPage
{
   static By newtab_btn= By.xpath("//button[@onclick=\"newTab()\"]");
    static By replacewindow_btn=By.xpath("//button[@onclick=\"newWindowSelf()\"]");
    static By newwindow_btn=By.xpath("//button[@onclick=\"newWindow()\"]");

    static public WebElement NewTab_BTN(WebDriver driver) throws InterruptedException {
        WebElement NewTab_BTN=driver.findElement(newtab_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", NewTab_BTN);
        Thread.sleep(500);
        return NewTab_BTN;
    }
    static public WebElement ReplaceTab_BTN(WebDriver driver) throws InterruptedException {
        WebElement ReplaceTab_BTN=driver.findElement(replacewindow_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ReplaceTab_BTN);
        Thread.sleep(500);
        return ReplaceTab_BTN;
    }
    static public WebElement NewWindow_BTN(WebDriver driver) throws InterruptedException {
        WebElement NewWindow_BTN=driver.findElement(newwindow_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", NewWindow_BTN);
        Thread.sleep(500);
        return NewWindow_BTN;
    }


}
