import Pages.BasePage;
import Pages.CalenderPage;
import org.testng.annotations.Test;

public class CalenderTest extends Basetest
{
    @Test
    public void ValidDate() throws InterruptedException
    {
        //Thread.sleep(1000);
        //BasePage. Longscrolldown(driver);
        //BasePage.ScrollToCalenders(driver);
        //Thread.sleep(1000);
        BasePage.Calenders(driver).click();
        CalenderPage.Text(driver).sendKeys("2020-10-10");
        CalenderPage.Submit(driver).click();

    }
}
