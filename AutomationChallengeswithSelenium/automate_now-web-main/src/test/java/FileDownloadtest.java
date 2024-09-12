import Pages.BasePage;
import Pages.FiledownloadPage;
import org.testng.annotations.Test;

public class FileDownloadtest extends Basetest
{
    @Test
    public void Downloadtest() throws InterruptedException
    {
         BasePage.File_download(driver).click();
         Thread.sleep(1000);
        Object[] windowHandles=driver.getWindowHandles().toArray();

        FiledownloadPage.Download(driver).click();

        System.out.println("######################################################################################");


        Thread.sleep(3000);
      //  driver.switchTo().alert().sendKeys(String.valueOf(Keys.ENTER));
        //driver.switchTo().defaultContent();

        driver.switchTo().window((String) windowHandles[0]);




    }
}
