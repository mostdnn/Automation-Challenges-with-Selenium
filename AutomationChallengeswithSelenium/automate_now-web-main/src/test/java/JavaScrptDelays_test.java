import Pages.BasePage;
import Pages.JavadDlayPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScrptDelays_test extends Basetest
{
    @Test
    public void check_Delays_1() throws InterruptedException
    {

        //BasePage.ScrollToJavaScriptDelays(driver);
        BasePage.JavaScriptDelays(driver).click();
        JavadDlayPage.Start_Dlay_fn(driver).click();
        BasePage.Smallscrolldown(driver);
        Thread.sleep(10000);
        JavadDlayPage.Resault_Delay_Text(driver).click();
        String message = JavadDlayPage.Resault_Delay_Text(driver).getAttribute("value");
        System.out.println("print message:");
        System.out.println(message);
        Assert.assertTrue(driver.findElement(By.id("delay")).isDisplayed());
        //System.out.println("flag displayed");
        Assert.assertEquals("Liftoff!",message);

    }

}
