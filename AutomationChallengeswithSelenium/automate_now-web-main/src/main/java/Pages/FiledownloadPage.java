package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FiledownloadPage
{
    static By download =By.xpath("//a[@href='#']");
    static public WebElement Download(WebDriver driver)
    {
        WebElement Download= driver.findElement(download);
        return Download;
    }


}
