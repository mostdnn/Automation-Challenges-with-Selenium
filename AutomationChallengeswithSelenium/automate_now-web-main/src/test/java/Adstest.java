import Pages.AdsPage;
import Pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Adstest extends Basetest
{



    @Test
    public void Ads() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
        BasePage.Ads(driver).click();
        WebElement Close_Ads = wait.until(ExpectedConditions.elementToBeClickable(AdsPage.Close_Ads(driver)));
        Close_Ads.click();
     //   AdsPage.Close_Ads(driver).click();


    }



}
