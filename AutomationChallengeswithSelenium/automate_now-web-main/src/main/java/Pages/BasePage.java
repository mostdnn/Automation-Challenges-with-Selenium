package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage
{

    static By javascriptdelays_btn =By.xpath("//a[@href='https://practice-automation.com/javascript-delays/']");
    static By formdields_btn =By.xpath("//a[@href=\"https://practice-automation.com/form-fields/\"]");
    static By popup_btn =By.xpath("//a[@href=\"https://practice-automation.com/popups/\"]");
    static By slider_btn =By.xpath("//a[@href=\"https://practice-automation.com/slider/\"]");

    static By calender_btn =By.xpath("//a[@href=\"https://practice-automation.com/calendars/\"]");
    static By modals_btn =By.xpath("//a[@href=\"https://practice-automation.com/modals/\"]");
    static By tables_btn =By.xpath("//a[@href=\"https://practice-automation.com/tables/\"]");
    static By windowperation_btn =By.xpath("//a[@href=\"https://practice-automation.com/window-operations/\"]");
    static By hover_btn =By.xpath("//a[@href=\"https://practice-automation.com/hover/\"]");
    static By ads_btn =By.xpath("//a[@href=\"https://practice-automation.com/ads/\"]");
    static By gesture_btn =By.xpath("//a[@href=\"https://practice-automation.com/gestures/\"]");
    static By filedownload_btn =By.xpath("//a[@href=\"https://practice-automation.com/file-download/\"]");
    static By clickevent_btn =By.xpath("");
    static By spinners_btn =By.xpath("");
    static By fileupload_btn =By.xpath("");
    static By iframs_btn =By.xpath("");
    static By brokenimages_btn =By.xpath("");
    static By brokenlinks_btn =By.xpath("");
    static By accordions_btn =By.xpath("");


    static public WebElement JavaScriptDelays(WebDriver driver) throws InterruptedException {
        WebElement JavaScriptDelays= driver.findElement(javascriptdelays_btn);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", JavaScriptDelays);
        Thread.sleep(500);
        return JavaScriptDelays;
    }
    static public  WebElement FormFields(WebDriver driver) throws InterruptedException {
        WebElement formfields=driver.findElement(formdields_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", formfields);
        Thread.sleep(500);
        return formfields;
    }
    static public  WebElement PopUp (WebDriver driver) throws InterruptedException {
        WebElement Popup =driver.findElement(popup_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Popup);
        Thread.sleep(500);
        return Popup;
    }
    static public  WebElement Sliders (WebDriver driver) throws InterruptedException {
        WebElement Sliders =driver.findElement(slider_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Sliders);
        Thread.sleep(500);
        return Sliders;
    }
    static public  WebElement Calenders (WebDriver driver) throws InterruptedException {
        WebElement Calenders =driver.findElement(calender_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Calenders);
        Thread.sleep(500);
        return Calenders;
    }

    static public  WebElement Modals (WebDriver driver) throws InterruptedException {
        WebElement Modals=driver.findElement(modals_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Modals);
        Thread.sleep(500);
        return Modals;
    }
    static public  WebElement Tables(WebDriver driver) throws InterruptedException {
        WebElement Tables=driver.findElement(tables_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Tables);
        Thread.sleep(500);
        return Tables ;
    }
    static public  WebElement  Window_Operations(WebDriver driver) throws InterruptedException {
        WebElement Window_Operations=driver.findElement(windowperation_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Window_Operations);
        Thread.sleep(500);
        return Window_Operations;
    }
    static public  WebElement Hover (WebDriver driver)
    {
        WebElement Hover=driver.findElement(hover_btn);
        return Hover ;
    }
    static public  WebElement Ads (WebDriver driver) throws InterruptedException {
        WebElement Ads =driver.findElement(ads_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Ads);
        Thread.sleep(500);
        return Ads;
    }
    static public  WebElement Gesture_BTN (WebDriver driver) throws InterruptedException
    {
        WebElement Gest =driver.findElement(gesture_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Gest );
        Thread.sleep(500);
        return Gest;
    }
    static public  WebElement File_download (WebDriver driver) throws InterruptedException
    {
        WebElement File_download =driver.findElement(filedownload_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",File_download );
        Thread.sleep(500);
        return File_download;
    }
//    static public  WebElement (WebDriver driver)
//    {
//    WebElement =driver.findElement(formdields_btn);
//    return ;
//    }
    public static void  Smallscrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("window.scrollTo(0, 500)");


    }
    public static void  Longscrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("window.scrollTo(0, 800)");


    }
    public static void  Smallscrollup(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(700,0)");

    }
///////////////////////////////////////////////////////////////////////////////////////////////
    /*static public void  ScrollToJavaScriptDelays(WebDriver driver) throws InterruptedException {
        WebElement JavaScriptDelays= driver.findElement(javascriptdelays_btn);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", JavaScriptDelays);
        Thread.sleep(500);

    }
    static public  void ScrollToFormFields(WebDriver driver) throws InterruptedException {
        WebElement formfields=driver.findElement(formdields_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", formfields);
        Thread.sleep(500);

    }
    static public void  ScrollToPopUp (WebDriver driver) throws InterruptedException {
        WebElement Popup =driver.findElement(popup_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Popup);
        Thread.sleep(500);

    }
    static public void  ScrollToSliders (WebDriver driver) throws InterruptedException {
        WebElement Sliders =driver.findElement(slider_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Sliders);
        Thread.sleep(500);

    }
    static public void  ScrollToCalenders (WebDriver driver) throws InterruptedException {
        WebElement Calenders =driver.findElement(calender_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Calenders);
        Thread.sleep(500);

    }

    static public void   ScrollToModals (WebDriver driver) throws InterruptedException {
        WebElement Modals=driver.findElement(modals_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Modals);
        Thread.sleep(500);

    }

*/
}
