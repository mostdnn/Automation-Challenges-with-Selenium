import Pages.BasePage;
import Pages.ModalsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Modalstest extends Basetest
{
    @Test (priority = 0)
    public void SimpleModals() throws InterruptedException
    {
          BasePage.Modals(driver).click();
          Thread.sleep(500);
          ModalsPage.Simple_modal_BTN(driver).isDisplayed();
          ModalsPage.Simple_modal_BTN(driver).click();
          System.out.println("flag before assertion ");
          Assert.assertTrue(ModalsPage.SimplePopUp_Assertion(driver).isDisplayed());
          ModalsPage.SimplePopUp_Close(driver).click();




    }
    @Test (priority = 1)
    public void FormModals() throws InterruptedException
    {
       ModalsPage.Form_modal(driver).click();
       ModalsPage.Form_Name(driver).sendKeys("TesT");
       ModalsPage.Form_Email(driver).sendKeys("Test@Test.com");
       ModalsPage.Form_Message(driver).sendKeys("Test Message");
       ModalsPage.Form_Submit(driver).click();



    }
}
