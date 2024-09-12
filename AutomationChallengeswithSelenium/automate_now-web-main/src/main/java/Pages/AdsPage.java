package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdsPage
{
    static By close_ads =By.xpath("//button[@type=\"button\"]");

    static public WebElement Close_Ads(WebDriver driver) throws InterruptedException {


     //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
     //   WebElement Close_Ads = wait.until(ExpectedConditions.elementToBeClickable(close_ads));



        WebElement Close_Ads= driver.findElement(close_ads);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Close_Ads);
        Thread.sleep(500);
        return Close_Ads;
    }
}
