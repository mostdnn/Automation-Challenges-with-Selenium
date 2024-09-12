import Pages.BasePage;
import Pages.WindowOpertionPage;
import org.testng.annotations.Test;

public class WindowOperation_test extends Basetest
{
    @Test (priority = 0)
    public void NewTab() throws InterruptedException
    {
        BasePage.Window_Operations(driver).click();
        WindowOpertionPage.NewTab_BTN(driver).click();
        Object[] windowHandles=driver.getWindowHandles().toArray();

        driver.switchTo().window((String) windowHandles[1]);
        driver.close();
        driver.switchTo().window((String) windowHandles[0]);

       // driver.close();
        //driver.switchTo().newWindow(WindowType.TAB);


    }
    @Test (priority = 1)

    public void ReblaceTab() throws InterruptedException
    {
        WindowOpertionPage.ReplaceTab_BTN(driver).click();
        driver.navigate().back();
    }
    @Test (priority = 2)

    public void NewWindow() throws InterruptedException
    {
        WindowOpertionPage.NewWindow_BTN(driver).click();
        Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        Thread.sleep(500);
        driver.close();
        driver.switchTo().window((String) windowHandles[0]);




    }

}
